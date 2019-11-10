package com.trifulcas.hibernate;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.cfg.Configuration;



import com.trifulcas.hibernate.entidades.*;

public class CrearAlumnos {

	public static void main(String[] args) {



		// Crear la configuraci�n cog�endola del xml y a�adiendo la clase Categorias

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")

				.addAnnotatedClass(Alumnos.class)
				.addAnnotatedClass(Modulos.class)
				.addAnnotatedClass(Profesores.class);


		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()

				.applySettings(configuration.getProperties());

		// Crear la factor�a de sesiones

		SessionFactory factory = configuration.buildSessionFactory(builder.build());

		// Crear la sesi�n

		Session session = factory.getCurrentSession();



		try {



			// Iniciar transacci�n

			session.beginTransaction();

			Alumnos alu1= new Alumnos("Ethelsita", "epz@lea.com");

			session.save(alu1);
			Alumnos alu2= new Alumnos("Juanjo", "jj@lea.com");
			session.save(alu2);

			Alumnos alu3= new Alumnos("Migue", "migue@lea.com");
			session.save(alu3);
			
			Modulos mod1 = session.get(Modulos.class, 14);
			Modulos mod2 = session.get(Modulos.class, 15);

			alu1.addModulo(mod1);
			alu2.addModulo(mod1);
			alu3.addModulo(mod2);
			session.save(alu1);
			session.save(alu2);
			session.save(alu3);

			// commit de la transacci�n

			session.getTransaction().commit();

			session.close();



		} finally {

			factory.close();

		}

	}



}