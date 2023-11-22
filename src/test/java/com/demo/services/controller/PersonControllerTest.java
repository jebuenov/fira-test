package com.demo.services.controller;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class PersonControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    void getListByNameControllerTest() throws Exception {
        // Test implementation using mockMvc
        mockMvc.perform(get("/persons/listByName").param("name", "Juan"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize( /* Expected size */ )));
        // Add more assertions based on your test criteria
    }
}