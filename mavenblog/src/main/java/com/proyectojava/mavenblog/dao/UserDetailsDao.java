package com.proyectojava.mavenblog.dao;



import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.proyectojava.mavenblog.model.User;

@Repository
public class UserDetailsDao implements IUserDetailsDao {

  @Autowired
  private SessionFactory sessionFactory;


  public User findUserByUsername(String username) {
    return sessionFactory.getCurrentSession().get(User.class, username);
  }
 
}
