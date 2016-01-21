package hello.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity// 
public class Name {

	@Id//プライマリキー
	@GeneratedValue//順番
	protected Integer id;

	//カラム
	@Column(name="first_name")
	protected String firstname;
	@Column(name="last_name")
	protected String lastname;
	
	// setter & getter ---------------------
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

    public String getFirstname(){
    	return firstname;
    }
    
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

    public String getLastname(){
    	return lastname;
    }

    // constructor --------------------------
	public Name(){
		super();
	}

    public Name(String firstname, String lastname){
        super();
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
}