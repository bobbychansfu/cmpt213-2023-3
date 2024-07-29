package ca.cmpt213.webserver.controllers;

import ca.cmpt213.webserver.models.Person;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class PeopleListControllerTest {
    @Autowired
    private PeopleListController peopleListController;
    @Autowired
    private MockMvc mockMvc;

    @BeforeAll
    static void setUp() {
        System.out.println("Runs before all tests");
    }

    @Test
    void contextLoads() {
        assertThat(peopleListController).isNotNull();
    }

    @Test
    void testAddAndGetPeopleList() throws Exception {
        Person person = new Person("steve",20);
        Person person2 = new Person("john",20);
        this.mockMvc.perform(
                post("/person")
                        .content(new ObjectMapper().writeValueAsString(person))
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(content().json("{\"pid\":4,\"name\":\"steve\",\"age\":20}"));

        this.mockMvc.perform(
                        post("/person")
                                .content(new ObjectMapper().writeValueAsString(person2))
                                .contentType(MediaType.APPLICATION_JSON)
                                .accept(MediaType.APPLICATION_JSON))
                .andExpect(status().isCreated())
                .andExpect(content().json("{\"pid\":5,\"name\":\"john\",\"age\":20}"));
        this.mockMvc.perform(get("/person")
                        .param("name", "bobby")
                        .param("age", "44"))
                .andExpect(status().isOk());

    }

}