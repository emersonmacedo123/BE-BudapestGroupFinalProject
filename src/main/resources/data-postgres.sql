INSERT INTO users(firstName, lastName, emailaddress, address, phoneNumber, birthdate, username, password, averagerating, verified, role)
VALUES ('Emerson', 'Macedo', 'emersonwantsanewjob@gmail.com', '7 Parliament Street','+2345559999',current_date,'emersonM','$2a$12$6eAOna2/bxVnaB8krWDcSOCgRMMXdQVguxL.vT0iwWe6nFQvytRnK', 3, false, 'USER');
INSERT INTO users(firstName, lastName, emailaddress, address, phoneNumber, birthdate, username, password, averagerating, verified, role)
VALUES ('Stevan', 'Samardzic', 'stevanwantsanewjob@gmail.com', '79 Andrassy Ut','+8657309',current_date,'stevans','$2a$12$6eAOna2/bxVnaB8krWDcSOCgRMMXdQVguxL.vT0iwWe6nFQvytRnK', 5, false, 'ADMIN');
INSERT INTO users(firstName, lastName, emailaddress, address, phoneNumber, birthdate, username, password, averagerating, verified, role)
VALUES ('Holden', 'Hartsoe', 'holdenhasanewjob@gmail.com', '79 Andrassy Ut','+36203125994',current_date, 'holdenh', '$2a$12$6eAOna2/bxVnaB8krWDcSOCgRMMXdQVguxL.vT0iwWe6nFQvytRnK', 5, false, 'ADMIN');
INSERT INTO users(firstName, lastName, emailaddress, address, phoneNumber, birthdate, username, password, averagerating, verified, role)
VALUES ('Who', 'Doesnt', 'wantanewjob@gmail.com','89 Hold Utca','+87346934432',current_date,  'whowho', '$2a$12$6eAOna2/bxVnaB8krWDcSOCgRMMXdQVguxL.vT0iwWe6nFQvytRnK', 5, false, 'USER');
INSERT INTO users(firstName, lastName, emailaddress, address, phoneNumber, birthdate, username, password, averagerating, verified, role)
VALUES ('I', 'should', 'bemorecreativewithnames@gmail.com', '10 Tipsy Street','+983498365',current_date, 'namename','$2a$12$6eAOna2/bxVnaB8krWDcSOCgRMMXdQVguxL.vT0iwWe6nFQvytRnK', 5, false, 'USER');


INSERT INTO sitter_requests(requesterid, district, address, type, date, start_time, num_hours, fee, title, message)
VALUES (1234, 6, '79 Andrassy Ut.', 'pet', CURRENT_DATE, '08:00:00', 8, 7.99, 'Need plantSitter', 'HI, LOOKING FOR SOMEONE TO WATCH MY PET CACTUS');
INSERT INTO sitter_requests(requesterid, district, address, type, date, start_time, num_hours, fee, title, message)
VALUES (4567, 6, '70 Vaci Ut.', 'pet', CURRENT_DATE, '09:00:00', 6, 10.99, 'Need babySitter', 'HI, LOOKING FOR SOMEONE TO WATCH MY BABY');
INSERT INTO sitter_requests(requesterid, district, address, type, date, start_time, num_hours, fee, title, message)
VALUES (8910, 6, '89 Hold Ut.', 'pet', CURRENT_DATE, '06:00:00', 3, 14.99, 'Need petSitter', 'HI, LOOKING FOR SOMEONE TO WATCH MY PET IGUANA');
INSERT INTO sitter_requests(requesterid, district, address, type, date, start_time, num_hours, fee, title, message)
VALUES (1112, 6, '10 Laurelwood Ut.', 'pet', CURRENT_DATE, '12:00:00', 2, 3.99, 'Need RockSitter', 'HI, LOOKING FOR SOMEONE TO WATCH MY PET ROCK');
INSERT INTO sitter_requests(requesterid, district, address, type, date, start_time, num_hours, fee, title, message)
VALUES (1314, 6, '6 Hyundi Ut.', 'pet', CURRENT_DATE, '02:00:00', 8, 20.99, 'Need houseSitter', 'HI, LOOKING FOR SOMEONE TO WATCH MY HOUSE');
