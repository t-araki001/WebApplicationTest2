package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	//ログイン画面
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
}
