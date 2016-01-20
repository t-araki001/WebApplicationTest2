package hello.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import hello.entity.Emp;

@Repository
public interface EmpRepository extends JpaRepository<Emp, Integer>{
	
}