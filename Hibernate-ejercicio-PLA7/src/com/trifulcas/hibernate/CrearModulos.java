package com.trifulcas.hibernate;

import org.hibernate.Session;

import org.hibernate.SessionFactory;

import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import org.hibernate.cfg.Configuration;



import com.trifulcas.hibernate.entidades.*;



public class CrearModulos{



	public static void main(String[] args) {



		// Crear la configuración cogíendola del xml y añadiendo la clase Categorias

		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")

				.addAnnotatedClass(Profesores.class).addAnnotatedClass(Modulos.class).addAnnotatedClass(Alumnos.class);

		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()

				.applySettings(configuration.getProperties());

		// Crear la factoría de sesiones

		SessionFactory factory = configuration.buildSessionFactory(builder.build());

		// Crear la sesión

		Session session = factory.getCurrentSession();

		try {

			// Iniciar transacción
			session.beginTransaction();
			
			Modulos mod1 = new Modulos("Phyton");
			Profesores prof = session.get(Profesores.class, 4);
			mod1.setProfesor(prof);
			session.save(mod1);

			Modulos mod2= new Modulos("R");
			Profesores prof2 = session.get(Profesores.class, 16);
			prof2.addModulos(mod2);
			session.save(mod2);

			// commit de la transacción
			session.getTransaction().commit();



		} finally {

			factory.close();

		}

	}



}