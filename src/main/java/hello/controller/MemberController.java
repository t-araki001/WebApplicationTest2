package hello.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hello.form.NameForm;
import hello.form.SearchForm;
import hello.model.MemberRegist;
import hello.model.MemberSearch;

@Controller
@EnableAutoConfiguration
@ComponentScan
public class MemberController {
	
	@Autowired
	MemberRegist memberRegist;

	@Autowired
	MemberSearch memberSearch;
	
//ここはHOME画面
	//HOME
	@RequestMapping({ "/", "/home" })
	public String home(Model model) {
		model.addAttribute("name", memberSearch.MemberList());
		return "home";
	}
	
//ここから追加機能
	//入力画面
	@RequestMapping(value = "/setName", method = RequestMethod.GET)
	public String nameForm(@ModelAttribute NameForm nameForm, Model model) {
//		model.addAttribute("nameForm", new NameForm());
		return "setName";
	}
	
	//入力内容確認画面
	@RequestMapping(value = "/checkName", method = RequestMethod.POST)
	public String checkForm(@ModelAttribute @Validated NameForm nameForm, Model model) {
		model.addAttribute("nameForm", nameForm);
		return "checkName";
	}
	
	// 登録完了画面
	@RequestMapping(value = "/finishName", method = RequestMethod.POST)
	public String finishForm(@ModelAttribute @Validated NameForm nameForm, Model model){
		memberRegist.MemberRegister(nameForm);
		model.addAttribute("nameForm", nameForm);
		return "finishName";
	}
	
//ここから検索機能
	//検索内容入力画面
	@RequestMapping(value = "/searchName", method = RequestMethod.GET)
	public String searchnameForm(@ModelAttribute SearchForm searchForm){
		return "searchName";
	}
	
	// 検索完了画面
	@RequestMapping(value = "/finishSearch", method = RequestMethod.POST)
	public String finishSearch(@ModelAttribute @Validated SearchForm searchForm, Model model){
		
		model.addAttribute("word", searchForm.getWord());
		model.addAttribute("results", memberSearch.MemberSearchList(searchForm));
		return "finishSearch";
	}

	
}
