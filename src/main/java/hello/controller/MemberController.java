package hello.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import hello.form.NameForm;
import hello.model.MemberRegist;
import hello.model.MemberSearch;
import hello.repository.NameRepository;

@Controller
@EnableAutoConfiguration
@ComponentScan
public class MemberController {
	
	@Autowired
	NameRepository repository;

//ここはHOME画面
	//HOME
	@RequestMapping({ "/", "/home" })
	public String home(Model model) {
		MemberSearch ms = new MemberSearch();
		model.addAttribute("name", ms.MemberList(repository));
		return "home";
	}
	
//ここから追加機能
	//入力画面
	@RequestMapping(value = "/setName", method = RequestMethod.GET)
	public String nameForm(Model model) {
		model.addAttribute("nameForm", new NameForm());
		return "setName";
	}
	
	//入力内容確認画面
	@RequestMapping(value = "/checkName", method = RequestMethod.POST)
	public String checkForm(@ModelAttribute @Valid NameForm nameForm, Model model) {
		model.addAttribute("nameForm", nameForm);
		return "checkName";
	}
	
	// 登録完了画面
	@RequestMapping(value = "/finishName", method = RequestMethod.POST)
	public String finishForm( @ModelAttribute @Valid NameForm nameForm, Model model) {
		new MemberRegist(nameForm,repository);
		model.addAttribute("nameForm", nameForm);
		return "finishName";
	}
	
//ここから検索機能
	//検索内容入力画面
	@RequestMapping(value = "/searchName", method = RequestMethod.GET)
	public String searchnameForm() {
		return "searchName";
	}
	
	// 検索完了画面
	@RequestMapping(value = "/finishSearch", method = RequestMethod.POST)
	public String finishSearch( Model model, @RequestParam("category") String category,
			@RequestParam("word") String word) {
		
		MemberSearch ms = new MemberSearch();
		model.addAttribute("word", word);
		model.addAttribute("results", ms.MemberSearchList(category,word,repository));
		return "finishSearch";
	}

	
}
