CREATE TABLE cars
(
    id         SERIAL PRIMARY KEY,
    brand      VARCHAR(100) NOT NULL,
    model      VARCHAR(100) NOT NULL,
    year       INT NOT NULL
);

INSERT INTO cars (brand, model, year)
VALUES ('Toyota', 'Corolla', 2020),
       ('Honda', 'Civic', 2019),
       ('Ford', 'Focus', 2018);