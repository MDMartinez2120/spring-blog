CREATE DATABASE IF NOT EXISTS spring_blog_db;

USE spring_blog_db;

INSERT INTO users(email, password, username)
VALUES ('chris@email.com', 'password', 'crispy'),
       ('oscar@email.com', 'password', 'o-man'),
       ('justin@codeup.com', 'password', 'j-bomb');

INSERT INTO posts(title, description, user_id)
VALUES ('Test', 'This is just a test.', 1),
       ('Another Test', 'Yet another test.', 2),
       ('Third Test', 'You know the drill.', 3);

INSERT INTO details(isAwesome, historyOfPost, topicDescription)
VALUES ('yes', '1st', 'testing'),
       ('no', '2nd', 'testing 2'),
       ('yes', '3rd', 'test 3')