package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import hello.model.NameForm;

@Controller
public class FinishSearchController {
	//åüçıäÆóπâÊñ 
	@RequestMapping(value = "/finishSearch", method = RequestMethod.POST)
	public String finishSearch(@ModelAttribute NameForm nameForm, Model model) {
		model.addAttribute("nameForm", nameForm);
		return "finishSearch";
	}

}
