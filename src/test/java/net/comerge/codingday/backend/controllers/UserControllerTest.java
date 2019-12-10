package net.comerge.codingday.backend.controllers;

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

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class UserControllerTest {

    private static final String PUBLIC_USERS = "http://localhost:8080/v1/public/users";

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGetAllUsers() {
        final ResponseEntity<List<UserDTO>> response = restTemplate.exchange(
                PUBLIC_USERS,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<List<UserDTO>>() {
                }); // special treatment for lists

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);

        final List<UserDTO> users = response.getBody();
        assertThat(users).hasSize(5);
        assertThat(users.stream().map(UserDTO::getFirstName)).containsExactlyInAnyOrder("Rico", "Dennis", "Till", "Peter", "Han Seng");
        // ...
    }

    @Test
    public void testGetUserById() {
        final int userId = 1;
        final ResponseEntity<UserDTO> response = restTemplate.getForEntity(PUBLIC_USERS + "/" + userId, UserDTO.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody()).isNotNull();
        assertThat(response.getBody().getId()).isEqualTo(userId);
        assertThat(response.getBody().getFirstName()).isEqualTo("Rico");
    }

    @Test
    public void testGetNonExistingUser_shouldReturnNotFound() {
        final int userId = 120398;
        final ResponseEntity<UserDTO> response = restTemplate.getForEntity(PUBLIC_USERS + "/" + userId, UserDTO.class);

        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }
}
