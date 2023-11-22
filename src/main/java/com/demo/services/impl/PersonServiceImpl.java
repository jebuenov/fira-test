package com.demo.services.impl;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entity.Person;
import com.demo.repository.PersonRepository;
import com.demo.services.PersonService;

@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Collection<Person> getListByName(String name) {
        return personRepository.findByName(name);
    }

    @Override
    public Collection<Long> getIdListUsingLambda() {
        List<Person> personList = personRepository.findAll();
        return personList.stream().map(Person::getId).collect(Collectors.toList());
    }
}