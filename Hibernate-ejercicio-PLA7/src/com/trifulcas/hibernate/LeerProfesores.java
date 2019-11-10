package com.trifulcas.hibernate;



import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.cfg.Configuration;



import com.trifulcas.hibernate.entidades.Profesores;
import com.trifulcas.hibernate.entidades.Alumnos;
import com.trifulcas.hibernate.entidades.Modulos;



public class LeerProfesores{



	public static void main(String[] args) {

		// Crear la configuraci�n cog�endola del xml y a�adiendo la clase Categorias

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")

				.addAnnotatedClass(Profesores.class)

				.addAnnotatedClass(Modulos.class)
				.addAnnotatedClass(Alumnos.class);

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()

				.applySettings(configuration.getProperties());

		// Crear la factor�a de sesiones

		SessionFactory factory = configuration.buildSessionFactory(builder.build());

		// Crear la sesi�n

		Session session = factory.getCurrentSession();



		try {



			// Iniciar transacci�n

			session.beginTransaction();



			// Creamos una categor�a



			Profesores prof = session.get(Profesores.class, 16);

			System.out.println(prof);

			System.out.println(prof.getModulos());

		

			// commit de la transacci�n

			session.getTransaction().commit();



		} finally {

			factory.close();

		}



	}



}