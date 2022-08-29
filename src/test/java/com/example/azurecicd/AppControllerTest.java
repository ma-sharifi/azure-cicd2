//package com.example.azurecicd;
//
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.boot.web.server.LocalServerPort;
//import org.springframework.http.*;
//
//import javax.annotation.PostConstruct;
//import java.util.Collections;
//
//import static org.assertj.core.api.Assertions.assertThat;
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
///**
// * @author Mahdi Sharifi
// * @since 8/29/22
// */
//@IntegrationTest
//@AutoConfigureMockMvc
//public class AppControllerTest {
//    private String uri;
//
//    @LocalServerPort
////    @Value("${local.server.port}")
//    private int port;
//
//    @Autowired
//    private HelloController helloController;
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @PostConstruct
//    public void init() {
//        uri = "http://localhost:" + port;
//    }
//
//    @Test
//    void contextLoads() throws Exception {
//        assertThat(helloController).isNotNull();
//    }
//
//    @Test
//    void sayHello() {
//        System.out.println("#############MAHDI SHARIFI");
//        String resourceUrl = uri + "/";
//        HttpHeaders headers = new HttpHeaders();
//        headers.setAccept(Collections.singletonList(MediaType.TEXT_PLAIN));
//        HttpEntity<String> entity = new HttpEntity<>("body", headers);
//        ResponseEntity<String> responseEntity = this.restTemplate.exchange(resourceUrl, HttpMethod.GET, entity, String.class);
//        String helloExpected = responseEntity.getBody();
//        assertEquals(helloExpected, "Hello World!");
//    }
//}
