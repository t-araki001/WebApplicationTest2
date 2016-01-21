package hello.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hello.entity.Name;

@Repository
public interface NameRepository extends JpaRepository<Name, Integer>{
// find methods
	  public List<Name> findByFirstname(String firstname);
	  public List<Name> findByLastname(String lastname);
	  public List<Name> findByFirstnameOrLastname(String firstname,String lastname);
}