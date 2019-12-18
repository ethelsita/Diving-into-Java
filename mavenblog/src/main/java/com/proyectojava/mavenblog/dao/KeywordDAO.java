

package com.proyectojava.mavenblog.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.proyectojava.mavenblog.model.Keyword;

@Repository
public class KeywordDAO implements IKeywordDAO {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public List<Keyword> getKeyword() {
		Session miSesion = sessionFactory.getCurrentSession();
		List<Keyword> keyword = miSesion.createQuery("from Keyword", Keyword.class).list();
		return keyword;
	}

	@Override
	public List<Keyword> getKeywords(int idblogentry) {
		Session miSesion = sessionFactory.getCurrentSession();
		List<Keyword> keyword=miSesion.createQuery("from Keyword u join u.blogentry r where r.idblogentry=:idblogentry", 
				Keyword.class).setParameter("idblogentry", idblogentry).list();
		return keyword ;
	}
	
	
	@Override
	public void save(Keyword keyword) {
		Session miSesion=sessionFactory.getCurrentSession();
		miSesion.saveOrUpdate(keyword);
	}

	@Override
	public Keyword getKeyword(int idkeyword) {
		Session miSesion=sessionFactory.getCurrentSession();
		return miSesion.get(Keyword.class,idkeyword);
	}

	@Override
	public void delete(Keyword keyword) {
		Session miSesion=sessionFactory.getCurrentSession();
		miSesion.delete(keyword);

	}

}
