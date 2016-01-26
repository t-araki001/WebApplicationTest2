package hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrController {
	//エラー画面
	@RequestMapping("/err")
	public String Err() {
		return "err";
	}
}
