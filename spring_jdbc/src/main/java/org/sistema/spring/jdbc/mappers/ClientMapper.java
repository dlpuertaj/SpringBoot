package org.sistema.spring.jdbc.mappers;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.sistema.spring.jdbc.models.Client;
import org.springframework.jdbc.core.RowMapper;

public class ClientMapper implements RowMapper<Client>{
	public ClientMapper() {}
	
	public Client mapRow(ResultSet rs, int rowNum) throws SQLException {
		Client client = new Client();
		
		client.setId(rs.getInt("id"));
		client.setName(rs.getString("name"));
		client.setCountry(rs.getString("country"));
		client.setPhone(rs.getString("phone"));
		client.setAge(rs.getInt("age"));
		return client;
	}
}
