package ca.sfu.cmpt213.webserver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import ca.sfu.cmpt213.webserver.controllers.PeopleListController;
import ca.sfu.cmpt213.webserver.models.Person;

@SpringBootTest
@AutoConfigureMockMvc
class TestingWebApplicationTest {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private PeopleListController controller;
	
	@Test
	void contextLoads() throws Exception{
		assertThat(controller).isNotNull();
	}

	@Test
	void shouldAddPerson() throws Exception {
		Person newObjectInstance = new Person("steve", 20);
		this.mockMvc.perform(post("/person")
			.content(asJsonString(newObjectInstance))
			.contentType(MediaType.APPLICATION_JSON)
			.accept(MediaType.APPLICATION_JSON))
			.andExpect(status().isCreated())
			.andExpect(content().json("{\"name\":\"steve\",\"age\":20}"));
		this.mockMvc.perform(get("/person")
			.param("uname", "steve")
			.param("uage", "20"))
			.andDo(print())
			.andExpect(status().isOk())
			.andExpect(content().json("[{\"name\":\"steve\",\"age\":20}]"));
	}

	public static String asJsonString(final Object obj) throws Exception {

		final ObjectMapper mapper = new ObjectMapper();
		final String jsonContent = mapper.writeValueAsString(obj);
		return jsonContent;
		
	}  
}
