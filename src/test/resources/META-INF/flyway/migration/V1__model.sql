CREATE SCHEMA TEST;

CREATE TABLE person (
  id          VARCHAR(30)   NOT NULL,
  name        VARCHAR(50)   NOT NULL,
  age         INTEGER,
  fk_address  INTEGER
);

CREATE TABLE address(
  id       INTEGER  NOT NULL,
  street   VARCHAR(50) NOT NULL,
  number   INTEGER
);
