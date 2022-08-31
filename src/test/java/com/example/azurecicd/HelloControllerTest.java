package com.example.azurecicd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.PostConstruct;

import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
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
   void testGetMessage() throws Exception {
       String message = "Hello World!";
 
       restHelloMockMvc
               .perform(
                       get(  "/"))
               .andExpect(status().isOk())
               .andExpect(content().string(org.hamcrest.Matchers.containsString(message))); 

   }
}
