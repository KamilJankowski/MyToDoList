package main.java.co.uk.kjankowski.mytodolist.model;

public class User {

	private Integer userid;
	private String login;
	private String password;

	public User() {

	}

	public User(Integer userid, String login, String password) {
		this.userid = userid;
		this.login = login;
		this.password = password;
	}

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
