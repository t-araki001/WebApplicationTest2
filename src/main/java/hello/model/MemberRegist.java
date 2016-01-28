package hello.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import hello.entity.Name;
import hello.form.NameForm;
import hello.repository.NameRepository;

@Component
public class MemberRegist {

	@Autowired
	NameRepository repository;
	
	public MemberRegist() {
	}	
	
	public void MemberRegister(NameForm nameForm) {
		Name name = new Name(nameForm.getFirstName(),nameForm.getLastName());
		repository.saveAndFlush(name);
	}



}
