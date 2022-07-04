DROP TABLE IF EXISTS client;

CREATE TABLE client (
  id int NOT NULL AUTO_INCREMENT,
  dni int NOT NULL,
  name varchar(255) NOT NULL,
  lastname varchar(255) NOT NULL,
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS product;

CREATE TABLE product (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(255) NOT NULL,
  description varchar(255) NOT NULL,
  price int,
  stock int,
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS sales;

CREATE TABLE sales (
  id int NOT NULL AUTO_INCREMENT,
  description varchar(255) NOT NULL,
  price int,
  code int,
  quantity int,
  PRIMARY KEY (id)
);

DROP TABLE IF EXISTS sales.priduct;

CREATE TABLE sales (
  id int NOT NULL AUTO_INCREMENT,
  clientid int,
  date datetime,
  quantity int,
  PRIMARY KEY (id)
);
