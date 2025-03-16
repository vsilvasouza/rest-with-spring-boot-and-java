package br.com.spring_project.services;

import br.com.spring_project.model.Person;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private AtomicLong counter = new AtomicLong();

    private Logger logger = Logger.getLogger(PersonServices.class.getName());

    public Person findById(String Id){
        logger.info("Finding one person");

        Person person = new Person();

        person.setId(counter.incrementAndGet());
        person.setFirstName("Roberto");
        person.setLastName("Firmino");
        person.setAddress("291 Viela Isabella, Castilho, BA 57132-197");
        person.setGender("Male");

        return person;

    }
}
