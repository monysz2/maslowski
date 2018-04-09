package com.maslowski.webapp.model;

import javax.persistence.*;

/**
 * Created by oro-6 on 3/26/2018.
 */
@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "my_generator")
    @SequenceGenerator(name = "my_generator",sequenceName ="person_id_seq",initialValue = 1, allocationSize = 1)

    private int id;
    @Column(name="firstname")
    private String firstName;
    @Column(name="lastname")
    private String lastName;

    public Person() {

    }
    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getId() {return this.id;}
}
