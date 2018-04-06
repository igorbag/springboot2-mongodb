package br.com.app.modules.cadastros.controller;

import br.com.app.modules.cadastros.service.ContactService;
import br.com.app.modules.global.entitys.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ContactController {


    @Autowired
    ContactService contactService;

    @RequestMapping(method = RequestMethod.GET, value = "/contacts")
    public Iterable<Contact> contact() {
        return contactService.findAll();
    }

    @RequestMapping(method = RequestMethod.POST, value = "/contacts")
    public Contact save(@RequestBody Contact contact) {
        return contactService.save(contact);
    }
}