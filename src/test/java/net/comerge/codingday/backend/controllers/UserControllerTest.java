package net.comerge.codingday.backend.controllers;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import net.comerge.codingday.backend.dto.UserDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class UserControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGetAllUsers() {
        final ResponseEntity<List<UserDTO>> response = restTemplate.exchange(
                "http://localhost:8080/v1/public/users",
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<UserDTO>>(){}); // special treatment for lists

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

        final List<UserDTO> users = response.getBody();
        assertThat(users).hasSize(5);
        assertThat(users.stream().map(UserDTO::getFirstName)).containsExactlyInAnyOrder("Rico", "Dennis", "Till", "Peter", "Han Seng");
        // ...
    }
}
