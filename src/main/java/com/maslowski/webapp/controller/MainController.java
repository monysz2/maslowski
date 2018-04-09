package com.maslowski.webapp.controller;

import com.maslowski.webapp.model.Person;
import com.maslowski.webapp.service.PersonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by oro-6 on 3/26/2018.
 */
@Controller
public class MainController {

    private PersonService personService;

    public MainController(PersonService personService) {
        this.personService = personService;
    }

    private static List<Person> persons = new ArrayList<Person>();

    static {
        persons.add(new Person("Bill", "Gates"));
        persons.add(new Person("Steve", "Jobs"));
    }

    @RequestMapping(value = { "/", "/index" }, method = RequestMethod.GET)
    public String index(Model model) {

        String message = "Hello Spring Boot + JSP";

        model.addAttribute("message", message);

        return "index";
    }

    @RequestMapping(value = { "/personList" }, method = RequestMethod.GET)
    public String viewPersonList(Model model) {

        model.addAttribute("persons", persons);

        return "personList";
    }

    @RequestMapping(value = "/newUser",method = RequestMethod.POST)
    public String newUser(@ModelAttribute("newPerson")Person person, ModelMap model)
    {


        personService.addUser(person);

        return "newUsers";
    }

    @RequestMapping(value = "/newUsers", method = RequestMethod.GET)
    public ModelAndView person(){
        return new ModelAndView("newUser","command", new Person());

    }
}
