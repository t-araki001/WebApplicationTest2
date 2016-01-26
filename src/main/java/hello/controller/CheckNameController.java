package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hello.model.NameForm;

@Controller
public class CheckNameController {
	//確認画面
	@RequestMapping(value = "/checkName", method = RequestMethod.POST)
	public String checkForm(@ModelAttribute NameForm nameForm, Model model) {
		model.addAttribute("nameForm", nameForm);
		return "checkName";
	}
}
