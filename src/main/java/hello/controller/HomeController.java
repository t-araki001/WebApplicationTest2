package hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import hello.repository.EmpRepository;
import hello.entity.Emp;

@Controller
@EnableAutoConfiguration
public class HomeController {
	
	@Autowired
	// ���|�W�g����R�Â��܂�
	EmpRepository repository;
	
	//HOME���
	@RequestMapping({ "/", "/home" })
	public String home(Model model) {
		Iterable<Emp> list = repository.findAll();
		model.addAttribute("name", list);
		return "home";
	}
}