package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import hello.model.NameForm;

@Controller
public class FinishNameController {

	//“ü—ÍŠ®—¹‰æ–Ê
	@RequestMapping(value="/finishName", method=RequestMethod.POST)
    public String finishForm(@ModelAttribute NameForm nameForm, Model model) {
        model.addAttribute("nameForm", nameForm);
        return "finishName";
    }
}
