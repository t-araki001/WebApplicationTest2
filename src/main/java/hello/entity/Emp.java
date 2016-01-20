package hello.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity// このクラスはEntityとして登録しますよ、とspringに教えてます
public class Emp {

	@Id//　プライマリーキーのものに設定してください
	@GeneratedValue//　主に数字に対して、順番に一意に設定しますよ、の意味
	protected Integer empID;

	@Column//　ただの変数じゃなくて、DBのカラムだよ、の意味
	protected String empname;
	@Column//
	protected String empname2;
	
	// setter & getter ---------------------
	public Integer getEmpID() {
		return empID;
	}

	public void setEmpID(Integer empID) {
		this.empID = empID;
	}

	public void setEmpName(String empName) {
		this.empname = empName;
	}

    public String getEmpName(){
    	return empname;
    }
    
	public void setEmpName2(String empName2) {
		this.empname2 = empName2;
	}

    public String getEmpName2(){
    	return empname2;
    }

    // constructor --------------------------
	public Emp(){
		super();
	}

    public Emp(Integer id, String name, String name2){
        super();
        this.empID =id;
        this.empname2 = name2;
    }
    
}