package com.demo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.demo.model.packs;

@Repository
public class packsDaoImpl {
	@Autowired
	   private JdbcTemplate jdbcTemplate;
	
	public List<packs> findAllpacks() {
		return jdbcTemplate.query("select * from customers2", (rs,num)->{
			packs e=new packs();
			e.setCustno(rs.getString(1));
			e.setBasepack(rs.getString(2));
			e.setOptionalpack(rs.getString(3));
			return e;
		});
	}
	
	public void save(packs e) {
		String str="insert into customers2 values(?,?,?)";
		jdbcTemplate.update(str,new Object[] {e.getCustno(),
				e.getBasepack(),e.getOptionalpack()});
		
	}
	
	public packs findById(int id) {
		try {
		    return jdbcTemplate.queryForObject("select * from customers2 where cust_no=?",new Object[] {id},BeanPropertyRowMapper.newInstance(packs.class));
		}catch(EmptyResultDataAccessException e) {
			return null;
		}
		
	}
	

public void modifypacks(packs e) {
	jdbcTemplate.update("update customers2 set basepack=?,optionalpack=? where cust_no=?",
			new Object[] {e.getBasepack(),e.getOptionalpack(),e.getCustno()});
	
}

public void removeById(int id) {
	jdbcTemplate.update("delete from customers2 where cust_no=?",new Object[] {id});
	
}


	
	
	
	
	
	

}
