package net.comerge.codingday.backend.controllers;

import net.comerge.codingday.backend.dto.UserDTO;
import net.comerge.codingday.backend.services.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    // We return all existing users as a list of UserDTO's
    @RequestMapping(value = "/public/users", method = RequestMethod.GET)
    public List<UserDTO> getAllUsers() {
        return userService
                .getAllUsers() // use the service to get all users
                .stream() // create a stream
                .map(UserDTO::fromRecord) // convert all UserRecord objects to UserDTO objects
                .collect(Collectors.toList()); // convert the stream to a list
    }

    // Implement me: GET /public/users/{id}
    // Expected output: a user object containing all fields in the database (id, first_name, last_name, email)
    //                  OR HttpStatus.NOT_FOUND if no user with the requested id exists
    @RequestMapping(value = "/public/users/{id}", method = RequestMethod.GET)
    public ResponseEntity<UserDTO> getUserById(@PathVariable("id") Long id) {
        final UserDTO dto = null;
        if (dto != null) {
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    // Implement me: POST /public/users
    // Expected input: first_name, last_name, email (the ID is generated by the database)
    // We can re-use the UserDTO here for the request body
    //    @RequestMapping(value = "/public/users", method = RequestMethod.POST)
    //    public void createUser(@RequestBody UserDTO newUser) {
    //        userService.createUser(...
    //    }
}
