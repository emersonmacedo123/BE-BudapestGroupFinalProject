DROP TABLE IF EXISTS users;
CREATE TABLE users(id serial PRIMARY KEY, firstName VARCHAR(255), lastName VARCHAR(255), emailAddress VARCHAR(255),
username VARCHAR(255), password VARCHAR(255), averageRating integer, verified boolean, role VARCHAR(255));

DROP TABLE IF EXISTS sitter_requests;
CREATE TABLE sitter_requests(id serial PRIMARY KEY, requesterId integer, message VARCHAR(255));

