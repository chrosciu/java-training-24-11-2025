CREATE TABLE users
(
    id         SERIAL PRIMARY KEY,
    first_name VARCHAR(100) NOT NULL,
    last_name  VARCHAR(100) NOT NULL
);

INSERT INTO users (first_name, last_name)
VALUES ('Jan', 'Kowalski'),
       ('Anna', 'Nowak'),
       ('Piotr', 'Zieliński');