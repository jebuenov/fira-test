package com.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.entity.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByName(String name);
}
