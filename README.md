# Coding Day - Backend

This is a simple project to help you get going with the backend coding day.

It's a Spring Boot application with H2 database and jOOQ to access the database in a type safe way.

Development will happen in IntelliJ, the project is already added and can be easily run from there.

## Project structure

* Source code is located under `src/main/java`. Add your code there.
* Tests are located under `src/test/java`. Add your unit tests there.
* Running the application will create a file-based database (very simple DB with some tables)
* Database models are already generated by jOOQ and can be found in package `net.comerge.codingday.backend.database.models`.
* See controllers package (`net.comerge.codingday.backend.controllers`) to add new REST end-points.
* If you change the database schema and want to regenerate models with jOOQ: 
    * Start the project (`MainApplication`)
    * Stop the project
    * Then run `mvn jooq-codegen:generate` on the console or from the IntelliJ maven tab
* You can add additional dependencies to the `pom.xml` if you want to use some external library.

## Running the application

Running `MainApplication` is all you need.

Spring will then start an embedded Tomcat and deploy the application there.

There are two test REST endpoint which can be reached at http://localhost:8080/v1/test and http://localhost:8080/v1/public/users

### Running the unit tests

Right-click a test and select `Run ...` to execute a test.

## Assessment

Non exhaustive list of items that will be assessed:

* App architecture
* API consumption 
* Understanding of object-oriented programming principles
* Unit tests
* Code readability/correctness
* Time management
* ...

## Your tasks

Context: We received a request from one of our international clients that they need an app that shows company-internal 
news. The user should also be able to view different teams and their members. For this the backend needs to provide the 
necessary data.

You will implement the backend based on the design/data model present and the required endpoints.

Implement the following endpoints as far as the time allows:

1. `GET /public/users/{id}`
        Should deliver a JSON object of a single user with the given id (all fields).
2. `POST /public/users`
        Should create a new user. Note: the sample schema doesn't contain user credentials, think about how you would store it in the DB.
3. `GET /public/teams`
        Should deliver a list of teams with three fields per team: id, name and number of users in the team.
4. `GET /public/teams/{id}`
        Should deliver a JSON object of a single team with the given id (all fields) together with a list of users of the team.
5. `GET /public/news`
        Should deliver a list of news with all fields, sorted by created_at descending.
6. `GET /public/news/{id}`
        Should deliver a JSON object of a single news with the given id (all fields).
7. Extend the `GET /public/users`
        It should be possible to optionally filter the user list by username (or username parts).
8. Extend the `GET /public/news`
        It should be possible to optionally filter the news list by title or message (or parts of them) or by author id.

For each endpoint write integration tests. 


## Some helpful links

* https://spring.io/guides
* https://www.jooq.org/
* https://projectlombok.org/
* http://joel-costigliola.github.io/assertj/
