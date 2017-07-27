package main.java.co.uk.kjankowski.mytodolist.model;

public class MyList {

	private Integer id;
	private String subject;
	private String description;

	public MyList() {
		
	}

	public MyList(Integer id, String subject, String description) {
		this.id = id;
		this.subject = subject;
		this.description = description;

	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
