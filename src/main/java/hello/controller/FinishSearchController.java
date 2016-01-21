package hello.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import hello.entity.Name;
import hello.repository.NameRepository;

@Controller
public class FinishSearchController {

	@Autowired
	// リポジトリ関連付け
	NameRepository repository;

	// 検索完了画面
	@RequestMapping(value = "/finishSearch", method = RequestMethod.POST)
	public String finishSearch(Model model, @RequestParam("category") String category,
			@RequestParam("word") String word) {

		Iterable<Name> list = null;
		if (category.equals("firstName")) {
			list = repository.findByFirstname(word);
		}else if (category.equals("lastName")) { 
			list = repository.findByLastname(word); 
		}else if (category.equals("fullName")) { 
			list = repository.findByFirstnameOrLastname(word, word); 
		}else { 
			list = null; 
		}
		model.addAttribute("word", word);
		model.addAttribute("results", list);
		return "finishSearch";
	}

}
