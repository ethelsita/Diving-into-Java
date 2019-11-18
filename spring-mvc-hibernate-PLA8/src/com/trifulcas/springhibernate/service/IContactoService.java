package com.trifulcas.springhibernate.service;
import java.util.List;
import com.trifulcas.springhibernate.entity.Contacto;
public interface IContactoService {
List<Contacto> getContactos();

void save(Contacto contacto);

Contacto getContacto(int idcontacto);
void delete(Contacto idcontacto);
}