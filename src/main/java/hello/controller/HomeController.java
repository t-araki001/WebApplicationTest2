package hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hello.entity.Name;
import hello.repository.NameRepository;

@Controller
@EnableAutoConfiguration
public class HomeController {
	
	@Autowired
	//リポジトリ関連付け
	NameRepository repository;
	
	//HOME
	@RequestMapping({ "/", "/home" })
	public String home(Model model) {
		Iterable<Name> list = repository.findAll();
		model.addAttribute("name", list);
		return "home";
	}
}