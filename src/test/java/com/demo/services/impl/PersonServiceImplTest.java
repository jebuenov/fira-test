package com.demo.services.impl;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import com.demo.entity.Person;
import com.demo.services.PersonService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonServiceImplTest {

    @Autowired
    private PersonService personService;

    @Test
    void getListByNameTest() {
        // Test implementation
        String nameToSearch = "Juan";
        Collection<Person> result = personService.getListByName(nameToSearch);
        // Add assertions based on your test criteria
    }

    @Test
    void getIdListUsingLambdaTest() {
        // Test implementation
        Collection<Long> result = personService.getIdListUsingLambda();
        // Add assertions based on your test criteria
    }
}
