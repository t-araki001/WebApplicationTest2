package hello.model;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hello.entity.Name;
import hello.form.SearchForm;
import hello.repository.NameRepository;

@Component
public class MemberSearch {

	@Autowired
	NameRepository repository;

	
	public MemberSearch() {
	}

	public List<Name> MemberSearchList(SearchForm searchForm) {
		List<Name> list = null;
		if (searchForm.getCategory().equals("firstName")) {
			list = repository.findByFirstname(searchForm.getWord());
		}else if (searchForm.getCategory().equals("lastName")) { 
			list = repository.findByLastname(searchForm.getWord()); 
		}else if (searchForm.getCategory().equals("fullName")) { 
			list = repository.findByFirstnameOrLastname(searchForm.getWord(), searchForm.getWord()); 
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
