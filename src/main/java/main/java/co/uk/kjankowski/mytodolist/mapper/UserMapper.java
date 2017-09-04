package main.java.co.uk.kjankowski.mytodolist.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;


import main.java.co.uk.kjankowski.mytodolist.model.User;
import org.springframework.jdbc.core.RowMapper;

public class UserMapper implements RowMapper<User>{
	
	public static final String BASE_SQL = "select id, login, password from user";
	@Override
	public User mapRow(ResultSet rs, int rowNum) throws SQLException{
		Integer id = rs.getInt("id");
		String login = rs.getString("login");
		String password = rs.getString("password");
			
		return new User(id, login, password);			
	}

}
