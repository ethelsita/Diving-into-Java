package com.proyectojava.mavenblog.dao;



import com.proyectojava.mavenblog.model.User;

public interface IUserDetailsDao {
  User findUserByUsername(String username);
}
