SET SCHEMA backend;

INSERT INTO user(id, first_name, last_name, email) VALUES (1, 'Rico', 'Schiekel', 'rico@test.com');
INSERT INTO user(id, first_name, last_name, email) VALUES (2, 'Dennis', 'Rietmann', 'dennis@test.com');
INSERT INTO user(id, first_name, last_name, email) VALUES (3, 'Till', 'Bay', 'till@test.com');
INSERT INTO user(id, first_name, last_name, email) VALUES (4, 'Peter', 'Hwang', 'peter@test.com');
INSERT INTO user(id, first_name, last_name, email) VALUES (5, 'Han Seng', 'Ng', 'carbon@test.com');

INSERT INTO team(id, name, description) VALUES (1, 'All', 'All people');
INSERT INTO team(id, name, description) VALUES (2, 'Team Zurich', 'Best team in Europe!');
INSERT INTO team(id, name, description) VALUES (3, 'Team Malaysia', 'Best team in Asia!');

INSERT INTO map_user_to_team(user, team) VALUES (1, 1);
INSERT INTO map_user_to_team(user, team) VALUES (2, 1);
INSERT INTO map_user_to_team(user, team) VALUES (3, 1);
INSERT INTO map_user_to_team(user, team) VALUES (4, 1);
INSERT INTO map_user_to_team(user, team) VALUES (5, 1);
INSERT INTO map_user_to_team(user, team) VALUES (1, 2);
INSERT INTO map_user_to_team(user, team) VALUES (2, 2);
INSERT INTO map_user_to_team(user, team) VALUES (3, 2);
INSERT INTO map_user_to_team(user, team) VALUES (4, 3);
INSERT INTO map_user_to_team(user, team) VALUES (5, 3);

INSERT INTO news(created_at, author, title, message) VALUES (parsedatetime('03-01-2018 18:47:52.690', 'dd-MM-yyyy hh:mm:ss.SS'), 1, 'FIRST!', 'The very first news post here! Wohooo! Welcome to our nice testing instance.');
INSERT INTO news(created_at, author, title, message) VALUES (parsedatetime('12-03-2018 09:01:32.010', 'dd-MM-yyyy hh:mm:ss.SS'), 2, 'New team members', 'Please welcome our new team members!');
INSERT INTO news(created_at, author, title, message) VALUES (parsedatetime('19-06-2018 16:51:11.320', 'dd-MM-yyyy hh:mm:ss.SS'), 3, 'Weekend excursion', 'Dont forget our weekend excursion. Bring warm clothes and something to eat and drink.');
