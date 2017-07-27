package main.java.co.uk.kjankowski.mytodolist.dao;

import java.util.List;

import javax.sql.DataSource;

import main.java.co.uk.kjankowski.mytodolist.mapper.MyListMapper;
import main.java.co.uk.kjankowski.mytodolist.model.MyList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class MyListDAO extends JdbcDaoSupport {

	@Autowired
	public MyListDAO(DataSource dataSource) {
		this.setDataSource(dataSource);

	}

	public List<MyList> listMyList() {
		String sql = MyListMapper.BASE_SQL;

		Object[] params = new Object[] {};
		MyListMapper mapper = new MyListMapper();

		List<MyList> list = this.getJdbcTemplate().query(sql, params, mapper);
		return list;
	}
	
	public void insertTask(String subject, String description) {
		String sql = "insert into mylist(subject, description) values(?, ?)";
		
		Object[] params = new Object[] {subject, description};
		this.getJdbcTemplate().update(sql, params);
		
		}
	
	public void deleteTask(Integer task_id) {
		String sql = "delete from mylist where id=?";
		
		Object[] params = new Object[] {task_id};
		
		this.getJdbcTemplate().update(sql, params);
	}
	
	
	
				
	}


