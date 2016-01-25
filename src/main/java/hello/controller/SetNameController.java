package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hello.model.NameForm;

@Controller
public class SetNameController {
	//入力画面
	@RequestMapping(value = "/setName", method = RequestMethod.GET)
	public String nameForm(Model model) {
		model.addAttribute("nameForm", new NameForm());
		return "setName";
	}
}
