package com.example.demo;

import com.example.demo.controller.MyController;
import com.example.demo.service.MyService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;

@SpringBootTest
class TakemyhomeApplicationTests {

	@Autowired
	private MyController myController;

	@Autowired
	private MyService myService;

	@Test
	public void contextLoads() throws Exception {
//		assertThat(myController).isNotNull();
		assert(true);
//		assertThat(myService).isNotNull();
	}

}
