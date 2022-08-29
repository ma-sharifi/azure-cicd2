package com.example.azurecicd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.*;

import javax.annotation.PostConstruct;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.hamcrest.Matchers.hasSize;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

/**
* @author Mahdi Sharifi
* @since 8/29/22
*/
@IntegrationTest
public class HelloControllerTest {

    @Autowired
    private MockMvc restHelloMockMvc;


   @PostConstruct
   public void init() {
   }

   @Test
   void contextLoads() throws Exception {
      
   }

   @Test
   void testToGetMessage() throws Exception {
       String message = "Hello World!";
 
       restHelloMockMvc
               .perform(
                       get(  "/"))
               .andExpect(status().isOk())
               .andExpect(content().string(org.hamcrest.Matchers.containsString(message))); 

   }
}
