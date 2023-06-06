package mauro.simoni.beu2w2d2;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
class Beu2w2d2ApplicationTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void tryInfoMsgEs() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/infoprenotazioni/es")).andExpect(status().is4xxClientError());
	}
}
