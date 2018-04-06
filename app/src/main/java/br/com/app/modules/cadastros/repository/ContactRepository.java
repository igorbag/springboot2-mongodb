package br.com.app.modules.cadastros.repository;

import br.com.app.modules.global.entitys.Contact;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface ContactRepository extends CrudRepository<Contact, String> {
    
    @Override
    List<Contact> findAll();

    @Override
    void delete(Contact deleted);
}