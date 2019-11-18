package com.trifulcas.springhibernate.dao;
import java.util.List;
import com.trifulcas.springhibernate.entity.Contacto;
public interface IContactoDAO {
List<Contacto> getContactos();
void save(Contacto contacto);

Contacto getContacto(int idcontacto);
void delete(Contacto contacto);
}