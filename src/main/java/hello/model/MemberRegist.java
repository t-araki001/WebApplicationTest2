package hello.model;


import hello.entity.Name;
import hello.form.NameForm;
import hello.repository.NameRepository;

public class MemberRegist {

	public MemberRegist() {
	}
		
	
	public MemberRegist(NameForm nameForm,NameRepository repository) {
		Name name = new Name(nameForm.getFirstName(),nameForm.getLastName());
		repository.saveAndFlush(name);
	}



}
