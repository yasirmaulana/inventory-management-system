package com.yasirmaulana.ims;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class InventoryManagementSystemV1ApplicationTests {

	private ApplicationContext applicationContext;
	@Test
	void contextLoads() {
		assertNotNull(applicationContext);
	}

}
