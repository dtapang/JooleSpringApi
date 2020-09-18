package com.joole.api;

import com.joole.api.entity.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ApiApplicationTests {


    @Autowired
    private TestRestTemplate restTemplate;
    @LocalServerPort
    private int port;
    private String getRootUrl() {
        return "http://localhost:" + port;
    }

    @Test
    void contextLoads() {
    }


    @Test
    public void testCreateUser() {
        User user = new User();
        user.setUsernameEmail("admin@gmail.com");
        user.setRole("admin");
        user.setPassword("admin");
        ResponseEntity<User> postResponse = restTemplate.postForEntity(getRootUrl() + "/auth/signup", user, User.class);
        Assert.assertNotNull(postResponse);
        Assert.assertNotNull(postResponse.getBody());
    }

}
