package com.demo.repository;

public interface PersonRepository extends JpaRepository<Person, Long> {
    List<Person> findByName(String name);
}
