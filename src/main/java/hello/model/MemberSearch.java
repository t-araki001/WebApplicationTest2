package hello.model;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hello.entity.Name;
import hello.repository.NameRepository;

@Component
public class MemberSearch {

	@Autowired
	NameRepository repository;

	
	public MemberSearch() {
	}

	public List<Name> MemberSearchList(String category, String word) {
		List<Name> list = null;
		if (category.equals("firstName")) {
			list = repository.findByFirstname(word);
		}else if (category.equals("lastName")) { 
			list = repository.findByLastname(word); 
		}else if (category.equals("fullName")) { 
			list = repository.findByFirstnameOrLastname(word, word); 
		}else { 
			list = null; 
		}
		return list;
	}

	public List<Name> MemberList() {
		List<Name> list = repository.findAll();
		return list;
	}

}
