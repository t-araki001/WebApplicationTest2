package hello.model;



import hello.entity.Name;
import hello.repository.NameRepository;

public class MemberSearch {

	public MemberSearch() {
	}

	public Iterable<Name> MemberSearchList(String category, String word, NameRepository repository) {
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
		return list;
	}

	public Iterable<Name> MemberList( NameRepository repository) {
		Iterable<Name> list = repository.findAll();
		return list;
	}

}
