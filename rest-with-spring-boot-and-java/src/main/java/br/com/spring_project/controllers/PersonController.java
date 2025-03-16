package br.com.spring_project.controllers;

import br.com.spring_project.model.Person;
import br.com.spring_project.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    PersonServices personServices;

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Person findByid(@PathVariable("id") String id){
        return personServices.findById(id);
    }

    @GetMapping(value = "/all", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Person> findAll(){
        return personServices.findAll();
    }
}
