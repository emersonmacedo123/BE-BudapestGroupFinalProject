DROP TABLE IF EXISTS users;
CREATE TABLE users(id serial PRIMARY KEY, firstName VARCHAR(255), lastName VARCHAR(255), emailAddress VARCHAR(255),
address VARCHAR(255), phoneNumber VARCHAR(100), birthDate date, username VARCHAR(255), password VARCHAR(255), averageRating integer, verified boolean, role VARCHAR(255));

DROP TABLE IF EXISTS sitter_requests;
CREATE TABLE sitter_requests(id serial PRIMARY KEY, requesterId integer,
    district integer, address VARCHAR(255), type VARCHAR(100),
    date date, start_time time, num_hours integer, fee float4, title VARCHAR(255), message VARCHAR(255));

