package com.foodiyweb.testing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JDBCTester {

	public static void main(String[] args) {
		
		/*try {
			Class.forName("com.mysql.jdbc.Driver");
			
				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gofoodiy_gofoodiy","root","tiger");
			
				System.out.println("SUCCESS");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		
		ApplicationContext app= new ClassPathXmlApplicationContext("hibernate-datasrc.xml");
		SessionFactory sessionFactory=(SessionFactory) app.getBean("sessionFactory");
		
		System.out.println("session created");
	}
}
