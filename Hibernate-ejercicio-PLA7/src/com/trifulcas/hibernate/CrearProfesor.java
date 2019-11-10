package com.trifulcas.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import com.trifulcas.hibernate.entidades.Modulos;
import com.trifulcas.hibernate.entidades.Profesores;

public class CrearProfesor {

	public static void main(String[] args) {

		// Crear la configuración cogíendola del xml y añadiendo las clases
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Profesores.class).addAnnotatedClass(Modulos.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		// Crear la factoría de sesiones
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		// Crear la sesión
		Session session = factory.getCurrentSession();

		try {
			// Iniciar transacción
			session.beginTransaction();
			// Creamos una profesor

			Profesores prof = new Profesores("Prof1","23345677","jose@hola.com");
			Profesores prof2 = new Profesores("Prof2","23345675","guille@hola.com");
			
			session.save(prof);

			session.save(prof2);

			// commit de la transacción
			session.getTransaction().commit();

		} finally {
			factory.close();
		}
	}

}
