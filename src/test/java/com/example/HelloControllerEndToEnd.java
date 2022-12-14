package com.example;
import java.net.URL;

import javax.annotation.PostConstruct;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import com.example.azurecicd.AzureCicdApplication;


@SpringBootTest(classes= AzureCicdApplication.class,webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class HelloControllerEndToEnd {

    @LocalServerPort
    private int port;

    private URL base;

    @Autowired
    private TestRestTemplate template;

    @PostConstruct
    public void setUp() throws Exception {
        this.base = new URL("http://localhost:" + port + "/");
    }

    @Test
    public void getHello() throws Exception {
        ResponseEntity<String> response = template.getForEntity(base.toString(),
                String.class);
        assertEquals(response.getBody(), "Hello World!");
    }  
}
