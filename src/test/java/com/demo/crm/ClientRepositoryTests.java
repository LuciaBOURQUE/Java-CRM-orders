package com.demo.crm;

import com.demo.crm.repositories.ClientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ClientRepositoryTests {
	@Autowired
	ClientRepository clientDatabase;

	@Test
	void getClient() {
		clientDatabase.findById(2);
	}

}
