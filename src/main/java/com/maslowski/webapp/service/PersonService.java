package com.maslowski.webapp.service;

import com.maslowski.webapp.model.Person;
import com.maslowski.webapp.repository.PersonRepository;
import org.springframework.stereotype.Service;

/**
 * Created by oro-6 on 4/9/2018.
 */
@Service
public class PersonService {
    private PersonRepository personRepository;

    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public void addUser(Person person)
    {
        personRepository.save(person);
    }
}
