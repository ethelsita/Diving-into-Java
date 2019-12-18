package com.proyectojava.mavenblog.config;


import java.sql.Connection;
import java.sql.DriverManager;

public class TestJDBC {
		
	public static void main(String[] args) {
		String bd="proyecto_blog";
		String jdbcUrl = "jdbc:mysql://localhost:3306/"+bd+"?useSSL=false&serverTimezone=UTC";
		String user = "root";
		String pass = ".adrianita19";
		
		try {
		System.out.println("Conectando: " + jdbcUrl);
		Connection myConn =
		DriverManager.getConnection(jdbcUrl, user, pass);
		System.out.println("Todo bien. Circulen.");
		}
		catch (Exception exc) {
		exc.printStackTrace();
		}
	}
}
