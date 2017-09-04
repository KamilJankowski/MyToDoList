package main.java.co.uk.kjankowski.mytodolist.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import main.java.co.uk.kjankowski.mytodolist.model.MyList;
import org.springframework.jdbc.core.RowMapper;

public class MyListMapper implements RowMapper<MyList> {
	
	public static final String BASE_SQL = "select id, subject, description from mylist";
	@Override
	public MyList mapRow(ResultSet rs, int rowNum) throws SQLException{
		Integer id = rs.getInt("id");
		String subject = rs.getString("subject");
		String description = rs.getString("description");
			
		return new MyList(id, subject, description);			
	}
	

}
