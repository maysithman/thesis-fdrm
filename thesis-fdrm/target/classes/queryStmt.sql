select * from time_period;

update time_period set name='t2' where id=2;


CREATE TABLE users(
id Serial PRIMARY KEY,
name VARCHAR(100) NOT NULL,
password VARCHAR(200) NOT NULL,
siteId INT NOT NULL,
FOREIGN KEY (siteId) REFERENCES site(id)
);
