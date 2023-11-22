package com.demo.controller;

import java.util.Collection;

import com.demo.entity.Person;
import com.demo.services.PersonService;

@RestController
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping("/listByName")
    public Collection<Person> getListByName(@RequestParam String name) {
        return personService.getListByName(name);
    }
}