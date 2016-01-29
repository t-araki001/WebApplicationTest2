package hello.form;

import org.hibernate.validator.constraints.NotEmpty;

public class SearchForm {
	
	@NotEmpty
    private String category;

	@NotEmpty
    private String word;
	
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}


}
