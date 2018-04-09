package com.maslowski.webapp.repository;

import com.maslowski.webapp.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by oro-6 on 4/9/2018.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Integer>{
}
