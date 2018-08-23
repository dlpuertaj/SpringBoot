package org.sistema.spring.jdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.sistema.spring.jdbc.models.Client;

public interface ClientDAO {
	public void setDataSource(DataSource ds);
	
	public void insert(String name, String country, String phone, Integer age);
	
	public Client selectById(Integer id);
	
	public List<Client> selectAll();
	
	public void delete(Integer id);
}
