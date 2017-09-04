package main.java.co.uk.kjankowski.mytodolist.dao;

import java.util.List;

import javax.sql.DataSource;


import main.java.co.uk.kjankowski.mytodolist.mapper.UserMapper;
import main.java.co.uk.kjankowski.mytodolist.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class UserDAO extends JdbcDaoSupport {

	@Autowired
	public UserDAO(DataSource dataSource) {
		this.setDataSource(dataSource);

	}

	public List<User> listUser() {
		String sql = UserMapper.BASE_SQL;

		Object[] params = new Object[] {};
		UserMapper mapper = new UserMapper();

		List<User> list = this.getJdbcTemplate().query(sql, params, mapper);
	
		return list;
	}
	
	public void insertTask(String subject, String description) {
		String sql = "insert into mylist(subject, description) values(?, ?)";
		
		Object[] params = new Object[] {subject, description};
		this.getJdbcTemplate().update(sql, params);
		
		}
	
	public boolean auth(String ulogin, String upassword) {
		String sql = "select * from user where login=? and password=?";
		
		Object[] params = new Object[] {ulogin, upassword};
		UserMapper mapper = new UserMapper();
		List<User> list = this.getJdbcTemplate().query(sql, params, mapper);
		
		if(list.isEmpty()) {
			return false;
			
		}
		else {
			return true;
		}
	}
	

	}

