package com.proyectojava.mavenblog.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

//import com.trifulcas.hibernate.entidades.Categorias;
import com.proyectojava.mavenblog.model.Blogentry;

public class LeerEntities {
/*
	public static void main(String[] args) {
		// Crear la configuraci�n cog�endola del xml y a�adiendo la clase Categorias
		Configuration configuration = new Configuration().configure("hibernate.cfg.xml")
			//	.addAnnotatedClass(Categorias.class)
				.addAnnotatedClass(Blogentry.class);
		StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder()
				.applySettings(configuration.getProperties());
		// Crear la factor�a de sesiones
		SessionFactory factory = configuration.buildSessionFactory(builder.build());
		// Crear la sesi�n
		Session session = factory.getCurrentSession();

		try {

			// Iniciar transacci�n
			session.beginTransaction();

			// Leemos un producto
			Blogentry blog = session.get(Blogentry.class, 2);
			System.out.println(blog);
			
			
			// commit de la transacci�n
			session.getTransaction().commit();

		} finally {
			factory.close();
		}

	}
*/
}
