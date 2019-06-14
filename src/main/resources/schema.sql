create table student
(
   id INT NOT NULL,
   name varchar(255) not null,
   passport_number varchar(255) not null,
   primary key(id)
);

CREATE TABLE inquiry
(
   id INT NOT NULL AUTO_INCREMENT,
   name VARCHAR(100) NOT NULL,
   email VARCHAR(100) NOT NULL,
   contents VARCHAR(500) NOT NULL,
   created DATETIME NOT NULL,
   PRIMARY KEY(id)
);

CREATE TABLE survey
(
   id INT NOT NULL AUTO_INCREMENT,
   age INT NOT NULL,
   satisfaction INT NOT NULL,
   comment VARCHAR(100),
   created DATETIME NOT NULL,
   PRIMARY KEY(id)
);

CREATE TABLE profile
(
   id INT NOT NULL AUTO_INCREMENT,
   profile_id VARCHAR(8) NOT NULL,
   profile_name VARCHAR(50) NOT NULL,
   image_name VARCHAR(100),
   created DATETIME NOT NULL,
   PRIMARY KEY(id)
);