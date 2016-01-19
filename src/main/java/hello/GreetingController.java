package hello;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import hello.model.NameForm;

@Controller
public class GreetingController {

	//HOME���
	@RequestMapping({ "/", "/home" })
	public String home(@RequestParam(value = "name", required = false, defaultValue = "Guest") String name,
			Model model) {
		model.addAttribute("name", name);
		return "home";
	}

	//���O�C�����
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	//�ǉ����͉��
	@RequestMapping(value = "/setName", method = RequestMethod.GET)
	public String nameForm(Model model) {
		model.addAttribute("nameForm", new NameForm());
		return "setName";
	}

	//���͊m�F���
	@RequestMapping(value = "/checkName", method = RequestMethod.POST)
	public String checkForm(@ModelAttribute NameForm nameForm, Model model) {
		model.addAttribute("nameForm", nameForm);
		return "checkName";
	}

	//���͊������
	@RequestMapping(value="/finishName", method=RequestMethod.POST)
    public String finishForm(@ModelAttribute NameForm nameForm, Model model) {
        model.addAttribute("nameForm", nameForm);
        return "finishName";
    }

	//�������͉��
	@RequestMapping(value = "/searchName", method = RequestMethod.GET)
	public String searchnameForm(Model model) {
		model.addAttribute("nameForm", new NameForm());
		return "searchName";
	}

	//�����������
	@RequestMapping(value = "/finishSearch", method = RequestMethod.POST)
	public String finishSearch(@ModelAttribute NameForm nameForm, Model model) {
		model.addAttribute("nameForm", nameForm);
		return "finishSearch";
	}

}
