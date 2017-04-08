package com.actif8.controller;

import com.actif8.model.request.PersonRequest;
import com.actif8.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.actif8.repo.PersonRepo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kenny on 4/8/2017.
 */

@RestController
public class PersonController {

    @Autowired
    private PersonRepo personRepo;


    @RequestMapping(method = RequestMethod.GET, path = "/test1")
    public List<Person> findAllPerson(){
        List<Person> persons = new ArrayList<>();
        persons = personRepo.findAll();
        return persons;

    }

    @RequestMapping(method = RequestMethod.POST, path = "/test2")
    public void addPerson(@RequestBody PersonRequest personRequest){
        Person p = new Person();
        p.setFirstname(personRequest.getFirstname());
        p.setEmail(personRequest.getEmail());
        personRepo.save(p);
    }
}
