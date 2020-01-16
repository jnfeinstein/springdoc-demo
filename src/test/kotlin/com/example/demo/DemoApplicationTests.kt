package com.example.demo

import org.junit.jupiter.api.Test
import org.springdoc.core.Constants
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.web.reactive.server.WebTestClient

@SpringBootTest
@AutoConfigureWebTestClient
class DemoApplicationTests {

	@Autowired
	lateinit var webtTestClient: WebTestClient

	@Test
	fun contextLoads() {
		webtTestClient.get().uri(Constants.DEFAULT_API_DOCS_URL).exchange()
	}
}
