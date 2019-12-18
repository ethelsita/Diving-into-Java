package com.proyectojava.mavenblog.dao;


	import java.util.List;

	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Repository;

	import com.proyectojava.mavenblog.model.Blogentry;
import com.proyectojava.mavenblog.model.Keyword;
import com.proyectojava.mavenblog.services.KeywordService;

	@Repository
	public class BlogentryDAO implements IBlogentryDAO {

		@Autowired
		private SessionFactory sessionFactory;

		@Override
		public List<Blogentry> getBlogentry() {
			Session miSesion = sessionFactory.getCurrentSession();
			List<Blogentry> blogentry=miSesion.createQuery("from Blogentry", Blogentry.class).list();
			return blogentry;
		}

		public List<Blogentry> getBlogentrys(int idblogentry) {
			Session miSesion = sessionFactory.getCurrentSession();
			List<Blogentry> blogentry=miSesion.createQuery("from Blogentry where idblogentry=:idblogentry", 
					Blogentry.class).setParameter("idblogentry", idblogentry).list();
			return blogentry;
		}
		
		public List<Blogentry> getBlogentrys(String palabra) {
			Session miSesion = sessionFactory.getCurrentSession();
			List<Blogentry> blogentry=			
					miSesion.createQuery("select distinct b from Blogentry b join b.keyword k where "		
							+ "k.keyword like concat('%',:palabra,'%') or "
							+ "title like concat('%',:palabra,'%') or "
							+ "extract like concat('%',:palabra,'%') or "
							+ "description like concat('%',:palabra,'%') order by b.title desc",					
					Blogentry.class).setParameter("palabra", palabra).list();
			return blogentry;
		}
		/*
		public List<Blogentry> getBlogentrys(String palabra) {
			Session miSesion = sessionFactory.getCurrentSession();
			List<Blogentry> blogentry=			
					miSesion.createSQLQuery("CALL busqueda(:palabra)").addEntity(Blogentry.class).setParameter("palabra", palabra).list();
			return blogentry;
		}*/
			
	    @Override
		public void save(Blogentry blogentry) {
			Session miSesion = sessionFactory.getCurrentSession();
			miSesion.saveOrUpdate(blogentry);
		}

		@Override
		public Blogentry getBlogentry(int idblogentry) {
			Session miSesion = sessionFactory.getCurrentSession();
			return miSesion.get(Blogentry.class,idblogentry);
		}

	    @Override
		public void delete(Blogentry blogentry) {
			Session miSesion = sessionFactory.getCurrentSession();
			miSesion.delete(blogentry);
		}

	    
	}
