package hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import hello.entity.Name;
import hello.model.NameForm;
import hello.repository.NameRepository;

@Controller
public class FinishNameController {
	
	@Autowired
	NameRepository repository;
	
	// 登録完了画面
	@RequestMapping(value = "/finishName", method = RequestMethod.POST)
	public String finishForm(@RequestParam("firstName") String firstname, @RequestParam("lastName") String lastname,
			@ModelAttribute NameForm nameForm, Model model) {
		Name name = new Name(firstname,lastname);
		repository.saveAndFlush(name);
		model.addAttribute("nameForm", nameForm);
		return "finishName";
	}
}
