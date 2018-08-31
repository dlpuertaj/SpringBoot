package org.sistema.spring.jdbc;

import java.util.List;

import org.sistema.spring.jdbc.dao.impl.JdbcClientDAO;
import org.sistema.spring.jdbc.models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	private static ApplicationContext context;

	public static void main(String[] args) {
		context = new ClassPathXmlApplicationContext("beans.xml");
		JdbcClientDAO clientJDBCTemplate = (JdbcClientDAO) context.getBean("clientJDBCTemplate");
		System.out.println("Creating clients--------------------------");
		clientJDBCTemplate.insert("Cesar", "Spain", "65987", 32);
		clientJDBCTemplate.insert("John", "UK", "789456", 45);
		clientJDBCTemplate.insert("Mauro", "Italy", "123456", 15);
		clientJDBCTemplate.insert("Eugenia", "Spain", "456123", 30);
		System.out.println();
		selectAllCLients(clientJDBCTemplate);
		
		System.out.println("Updating client with ID = 3------------------------------------");
		clientJDBCTemplate.update(3, "Peter");
		System.out.println();
		
		System.out.println("Listing client with ID = 3-----------------------------------------");
		Client client = clientJDBCTemplate.selectById(3);
		System.out.println("ID: " + client.getId());
		System.out.println("Name: " + client.getName());
		System.out.println();
		
		System.out.println("Deleting client with ID = 1---------------------------------");
		clientJDBCTemplate.delete(1);
		selectAllCLients(clientJDBCTemplate);
		
		clientJDBCTemplate.truncate();
		selectAllCLients(clientJDBCTemplate);
		
	}
	
	private static void selectAllCLients(JdbcClientDAO clientDAO) {
		System.out.println("Listing clients---------------------------------------");
		List<Client> clients = clientDAO.selectAll();
		if(clients.isEmpty())
			System.out.println("Table is empty");
		else {
			for(Client client : clients) {
				System.out.println("ID: " + client.getId());
				System.out.println("Name: " + client.getName());
				System.out.println("Country: " + client.getCountry());
				System.out.println("Phone: " + client.getPhone());
				System.out.println("Age: " + client.getAge());
			}
		}
		System.out.println();
	}

}
