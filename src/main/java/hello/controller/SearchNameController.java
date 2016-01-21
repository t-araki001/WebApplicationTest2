package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hello.model.NameForm;


@Controller
public class SearchNameController {
	//検索入力画面
	@RequestMapping(value = "/searchName", method = RequestMethod.GET)
	public String searchnameForm(Model model) {
		model.addAttribute("nameForm", new NameForm());
		return "searchName";
	}

}
