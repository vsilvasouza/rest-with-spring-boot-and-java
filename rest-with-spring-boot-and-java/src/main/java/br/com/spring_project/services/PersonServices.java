package br.com.spring_project.services;

import br.com.spring_project.exception.ResourceNotFoundException;
import br.com.spring_project.model.Person;
import br.com.spring_project.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class PersonServices {

    private final Logger logger = Logger.getLogger(PersonServices.class.getName());

    @Autowired
    PersonRepository personRepository;

    public Person findById(Long id){
        logger.info("Finding one person");

        return personRepository.findById(id)
                .orElseThrow(()-> new ResourceNotFoundException("No records found for this Id!"));

    }

    public void delete(Long id){
        logger.info("Deleting person");

        if(personRepository.existsById(id)){
            personRepository.deleteById(id);
        } else {
            throw new ResourceNotFoundException("No records found for this Id!");
        }

    }

    public Person create(Person person){
        logger.info("Creating a person");
        return personRepository.save(person);

    }

    public Person update(Person newPerson){
        logger.info("Updating a person");

        if(personRepository.existsById(newPerson.getId())){
            return personRepository.save(newPerson);
        } else {
            throw new ResourceNotFoundException("No records found for this Id!");
        }
    }

    public List<Person> findAll(){
        logger.info("Finding all people");

        return personRepository.findAll();
    }

}
