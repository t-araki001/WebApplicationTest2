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

	//HOME画面
	@RequestMapping({ "/", "/home" })
	public String home(@RequestParam(value = "name", required = false, defaultValue = "Guest") String name,
			Model model) {
		model.addAttribute("name", name);
		return "home";
	}

	//ログイン画面
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	
	//追加入力画面
	@RequestMapping(value = "/setName", method = RequestMethod.GET)
	public String nameForm(Model model) {
		model.addAttribute("nameForm", new NameForm());
		return "setName";
	}

	//入力確認画面
	@RequestMapping(value = "/checkName", method = RequestMethod.POST)
	public String checkForm(@ModelAttribute NameForm nameForm, Model model) {
		model.addAttribute("nameForm", nameForm);
		return "checkName";
	}

	//入力完了画面
	@RequestMapping(value="/finishName", method=RequestMethod.POST)
    public String finishForm(@ModelAttribute NameForm nameForm, Model model) {
        model.addAttribute("nameForm", nameForm);
        return "finishName";
    }

	//検索入力画面
	@RequestMapping(value = "/searchName", method = RequestMethod.GET)
	public String searchnameForm(Model model) {
		model.addAttribute("nameForm", new NameForm());
		return "searchName";
	}

	//検索完了画面
	@RequestMapping(value = "/finishSearch", method = RequestMethod.POST)
	public String finishSearch(@ModelAttribute NameForm nameForm, Model model) {
		model.addAttribute("nameForm", nameForm);
		return "finishSearch";
	}

}
