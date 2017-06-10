//package com.swille;
//
//import org.junit.Test;
//import org.junit.runner.RunWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.boot.test.web.client.TestRestTemplate;
//import org.springframework.http.ResponseEntity;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import java.io.IOException;
//
//import static org.hamcrest.MatcherAssert.assertThat;
//import static org.hamcrest.core.Is.is;
//
//
//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
//public class HomeCtrlWebIntTest {
//
//    @Test
//    public void getHomeTest() throws IOException {
//        TestRestTemplate restTemplate = new TestRestTemplate();
//        ResponseEntity resp = restTemplate.getForEntity("http://localhost:8991/home", String.class);
//
//        System.out.println("\033[30;47m" +resp);
//        assertThat(resp.getBody(), is("kick ass!"));
//    }
//
//
//}
//
