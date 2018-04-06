package br.com.app.modules.cadastros.service;

import br.com.app.modules.cadastros.repository.ContactRepository;
import br.com.app.modules.global.entitys.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    ContactRepository contactRepository;


    public List<Contact> findAll() {
        return contactRepository.findAll();
    }

    public Contact save(Contact contact) {
        contactRepository.save(contact);
        return contact;
    }
}
