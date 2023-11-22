package com.demo.services;

import java.util.Collection;

import com.demo.entity.Person;

public interface PersonService {
    Collection<Person> getListByName(String name);

    Collection<Long> getIdListUsingLambda();
}
