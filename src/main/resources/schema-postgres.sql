DROP TABLE IF EXISTS users;
CREATE TABLE users(id serial PRIMARY KEY, firstName VARCHAR(255), lastName VARCHAR(255), emailAddress VARCHAR(255), averageRating integer, verified boolean);

