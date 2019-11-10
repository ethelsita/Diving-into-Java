package com.trifulcas.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.trifulcas.hibernate.entidades.Modulos;
import com.trifulcas.hibernate.entidades.Profesores;

public class CrearProfesor {

	public static void main(String[] args) {

		// Crear la configuraci�n cog�endola del xml y a�adiendo la clase Categorias
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Profesores.class).addAnnotatedClass(Modulos.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		// Crear la factor�a de sesiones
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		// Crear la sesi�n
		Session session = factory.getCurrentSession();

		try {
			// Iniciar transacci�n
			session.beginTransaction();
			// Creamos una profesor

			Profesores prof = new Profesores("Prof1","23345677","jose@hola.com");
			Profesores prof2 = new Profesores("Prof2","23345675","guille@hola.com");
			
			session.save(prof);

			session.save(prof2);

			// commit de la transacci�n
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

}
