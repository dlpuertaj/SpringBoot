package org.sistema.spring.jdbc.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.sistema.spring.jdbc.dao.ClientDAO;
import org.sistema.spring.jdbc.mappers.ClientMapper;
import org.sistema.spring.jdbc.models.Client;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcClientDAO implements ClientDAO{
	private DataSource dataSource;
	private JdbcTemplate jdbcTemplateObject;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	public void insert(String name, String country, String phone, Integer age) {
		String SQL = "INSERT INTO Client (name, country, phone, age) VALUES (?, ?, ?, ?)";
		
		jdbcTemplateObject.update(SQL, name, country, phone, age);
		System.out.println("Created record Name: " + name + " Country: " + country + " Phone: " + phone + " Age: " +  age);
	}
	public Client selectById(Integer id) {
		String SQL = "SELECT * FROM Client WHERE id = ?";
		Client client = (Client) jdbcTemplateObject.queryForObject(SQL, new Object[] {id}, new ClientMapper());
		return client;
	}
	public List<Client> selectAll() {
		String SQL = "SELECT * FROM Client";
		List<Client> clients = jdbcTemplateObject.query(SQL, new ClientMapper());
		return clients;
	}
	public void delete(Integer id) {
		String SQL = "DELETE FROM Client WHERE id = ?";
		jdbcTemplateObject.update(SQL, id);
		
	}
	public void truncate() {
		String SQL = "Truncate Client";
		jdbcTemplateObject.update(SQL);
	}
	
	public void update(Integer id, String name) {
		String SQL = "UPDATE Client SET name = ? WHERE id = ?";
		jdbcTemplateObject.update(SQL, name,id);
		System.out.println("Updated Record with ID = " + id);
	}
}
