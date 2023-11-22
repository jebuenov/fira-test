package com.demo.services.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.Collection;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import com.demo.entity.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
@Transactional
@ComponentScan("com.demo.repositories")
public class PersonServiceImplTest {

    @Autowired
    private PersonServiceImpl personService;

    @Test
    void getListByNameTest() {
        // Datos de prueba
        String nameToSearch = "Juan";

        // Llamada al método del servicio
        Collection<Person> result = personService.getListByName(nameToSearch);

        // Verificación de resultados
        assertNotNull(result);
        // Puedes agregar más aserciones según tus necesidades
    }

    @Test
    void getIdListUsingLambdaTest() {
        // Llamada al método del servicio
        Collection<Long> result = personService.getIdListUsingLambda();

        // Verificación de resultados
        assertNotNull(result);
        // Puedes agregar más aserciones según tus necesidades
    }
}
