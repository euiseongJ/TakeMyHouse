package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class TakemyhomeApplicationTests {

	@Autowired
	private MyController myController;

	@Autowired
	private MyService myService;

	@Test
	public void contextLoads() throws Exception {
		assertThat(myController).isNotNull();
		assertThat(myService).isNotNull();
	}

}
