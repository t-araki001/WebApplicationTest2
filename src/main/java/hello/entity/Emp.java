package hello.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity// ���̃N���X��Entity�Ƃ��ēo�^���܂���A��spring�ɋ����Ă܂�
public class Emp {

	@Id//�@�v���C�}���[�L�[�̂��̂ɐݒ肵�Ă�������
	@GeneratedValue//�@��ɐ����ɑ΂��āA���ԂɈ�ӂɐݒ肵�܂���A�̈Ӗ�
	protected Integer empID;

	@Column//�@�����̕ϐ�����Ȃ��āADB�̃J��������A�̈Ӗ�
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