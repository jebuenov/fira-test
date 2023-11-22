package com.demo;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootTest
@TestConfiguration
@ComponentScan("com.demo.repositories")
public class TestConfig {
    // Configuración adicional para las pruebas
}