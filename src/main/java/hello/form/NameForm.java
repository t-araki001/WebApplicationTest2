package hello.form;

import org.hibernate.validator.constraints.NotEmpty;

public class NameForm {
	@NotEmpty
    private String firstName;
	@NotEmpty
    private String lastName;

    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /*
    public NameForm(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
    */
}
