package net.comerge.codingday.backend.controllers;

import java.util.List;
import java.util.stream.Collectors;

import net.comerge.codingday.backend.dto.UserDTO;
import net.comerge.codingday.backend.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/public/users", method = RequestMethod.GET)
    public List<UserDTO> getAllUsers() {
        return userService
                .getAllUsers()
                .stream()
                .map(UserDTO::fromRecord)
                .collect(Collectors.toList());
    }

    // Implement me: GET /public/users/{id}
    // Expected output: a user object containing all fields in the database (id, first_name, last_name, email)

    // Implement me: POST /public/users
	// Expected input: first_name, last_name, email, password
	// Note: think about how you would store password in database (not yet included in the user table)
}
