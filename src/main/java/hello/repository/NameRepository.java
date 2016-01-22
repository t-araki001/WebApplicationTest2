package hello.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.test.context.ActiveProfiles;

import hello.entity.Name;

@ActiveProfiles("dev")
@Repository
public interface NameRepository extends JpaRepository<Name, Integer>{
// find methods
	  public List<Name> findByFirstname(String firstname);
	  
	  public List<Name> findByLastname(String lastname);
	  
	  public List<Name> findByFirstnameOrLastname(String firstname,String lastname);
}