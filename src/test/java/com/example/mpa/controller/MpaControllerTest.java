package com.example.mpa.controller;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
public class MpaControllerTest {

    @Autowired
    private WebTestClient webClient;

    @Test
    public void testGetMapping() {

        // Petición GET al endpoint /prueba
        this.webClient.get().uri("/prueba")
                .exchange()
                // Validar el código de respuesta HTTP
                .expectStatus().isOk();
                // Validar el cuerpo de la respuesta
               // .expectBody(String.class).isEqualTo("¡Hola!");





    }
}