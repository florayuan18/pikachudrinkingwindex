package com.example.sping_portfolio;


import com.example.sping_portfolio.SQL.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

// Built using article: https://docs.spring.io/spring-framework/docs/3.2.x/spring-framework-reference/html/mvc.html
// or similar: https://asbnotebook.com/2020/04/11/spring-boot-thymeleaf-form-validation-example/
@Controller
public class PersonSqlMvcController implements WebMvcConfigurer {

    // Autowired enables Control to connect HTML and POJO Object to Database easily for CRUD
    @Autowired
    private PersonSqlRepository repository;

    @GetMapping("/Database/person")
    public String person(Model model) {
        List<Person> list = repository.listAll();
        model.addAttribute("list", list);
        return "Database/person";
    }

    /*  The HTML template Forms and PersonForm attributes are bound
        @return - template for person form
        @param - Person Class
    */
    @GetMapping("/Database/personcreate")
    public String personAdd(Person person) {
        return "Database/personcreate";
    }

    /* Gathers the attributes filled out in the form, tests for and retrieves validation error
    @param - Person object with @Valid
    @param - BindingResult object
     */
    @PostMapping("/Database/personcreate")
    public String personSave(@Valid Person person, BindingResult bindingResult) {
        // Validation of Decorated PersonForm attributes
        if (bindingResult.hasErrors()) {
            return "Database/personcreate";
        }
        repository.save(person);
        // Redirect to next step
        return "redirect:/Database/person";
    }

    @GetMapping("/Database/personupdate/{id}")
    public String personUpdate(@PathVariable("id") int id, Model model) {
        model.addAttribute("person", repository.get(id));
        return "Database/personupdate";
    }

    @PostMapping("/Database/personupdate")
    public String personUpdateSave(@Valid Person person, BindingResult bindingResult) {
        // Validation of Decorated PersonForm attributes
        if (bindingResult.hasErrors()) {
            return "Database/personupdate";
        }
        repository.save(person);
        // Redirect to next step
        return "redirect:/Database/person";
    }

    @GetMapping("/Database/persondelete/{id}")
    public String personDelete(@PathVariable("id") long id) {
        repository.delete(id);
        return "redirect:/Database/person";
    }

    /*
    #### RESTful API section ####
    Resource: https://spring.io/guides/gs/rest-service/
    */

    /*
    GET List of People
     */
    @RequestMapping(value = "/api/people/get")
    public ResponseEntity<List<Person>> getPeople() {
        return new ResponseEntity<>( repository.listAll(), HttpStatus.OK);
    }

    /*
    GET individual Person using ID
     */
    @RequestMapping(value = "/api/person/get/{id}")
    public ResponseEntity<Person> getPerson(@PathVariable long id) {
        return new ResponseEntity<>( repository.get(id), HttpStatus.OK);
    }

    /*
    DELETE individual Person using ID
     */
    @RequestMapping(value = "/api/person/delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Object> deletePerson(@PathVariable long id) {
        repository.delete(id);
        return new ResponseEntity<>( ""+ id +" deleted", HttpStatus.OK);
    }


    /*
    POST Aa record by Requesting Parameters from URI
     */
    @RequestMapping(value = "/api/person/post", method = RequestMethod.POST)
    public ResponseEntity<Object> postPerson(@RequestParam("teacher_class") String teacher_class,
                                             @RequestParam("teacher_name") String teacher_name,
                                             @RequestParam("rating") String rating) {

        // A person object WITHOUT ID will create a new record
        Person person = new Person(teacher_class, teacher_name, rating);
        repository.save(person);
        return new ResponseEntity<>(teacher_class +" is created successfully", HttpStatus.CREATED);
    }

}