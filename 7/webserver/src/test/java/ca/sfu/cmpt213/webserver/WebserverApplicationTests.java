package ca.sfu.cmpt213.webserver;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;

import ca.sfu.cmpt213.webserver.controllers.PeopleListController;
import ca.sfu.cmpt213.webserver.models.Person;

@SpringBootTest
@AutoConfigureMockMvc
class WebserverApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private PeopleListController controller;

	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}


	public static String asJsonString(final Object obj) throws Exception {
		final ObjectMapper mapper = new ObjectMapper();
		final String jsonContent = mapper.writeValueAsString(obj);
		return jsonContent;
	} 

}
