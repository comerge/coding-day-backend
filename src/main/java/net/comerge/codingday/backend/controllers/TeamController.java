package net.comerge.codingday.backend.controllers;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamController {

    // private final TeamService teamService;
    // ...

    // Implement me: GET /public/teams
    // Expected output: list of teams, each containing fields id and name
    //                  and a field with the count of users in the team
    //    @RequestMapping(value = "/public/teams", method = RequestMethod.GET)
    //    public List<TeamDTO> getAllUsers() {
    //        return teamService.
    //                .getAllTeams() // use the service to get all team records
    //                .map(TeamDTO::fromRecord) // convert TeamRecord objects into TeamDTO objects
    //                .map(dto -> dto.set...(teamService.countUsers(dto.getId()))) // use the teamService to get the user count for a team and set it on the DTO
    //                ...
    //    }


    // Implement me: GET /public/teams/{id}
    // Expected output: a team object containing all fields in the database (id, name, description)
    //                  and a list of user objects of users in this particular team

}
