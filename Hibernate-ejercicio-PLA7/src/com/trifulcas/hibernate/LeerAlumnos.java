package com.trifulcas.hibernate;



import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.cfg.Configuration;



import com.trifulcas.hibernate.entidades.Profesores;
import com.trifulcas.hibernate.entidades.Alumnos;
import com.trifulcas.hibernate.entidades.Modulos;



public class LeerAlumnos {

	public static void main(String[] args) {

		// Crear la configuración cogíendola del xml y añadiendo la clase Categorias

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")

				.addAnnotatedClass(Profesores.class)

				.addAnnotatedClass(Modulos.class)
				
				.addAnnotatedClass(Alumnos.class);

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()

				.applySettings(configuration.getProperties());

		// Crear la factoría de sesiones

		SessionFactory factory = configuration.buildSessionFactory(builder.build());

		// Crear la sesión

		Session session = factory.getCurrentSession();



		try {



			// Iniciar transacción

			session.beginTransaction();



			// Leemos un producto



			Alumnos alu1 = session.get(Alumnos.class, 12);

			System.out.println(alu1);

			

			

			// commit de la transacción

			session.getTransaction().commit();



		} finally {

			factory.close();

		}



	}



}