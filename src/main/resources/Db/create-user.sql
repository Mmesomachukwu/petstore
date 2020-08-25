DROP USER IF EXISTS 'petuser'@'localhost';
Create USER 'petuser'@'localhost' IDENTIFIED BY 'petuser123';
GRANT ALL PRIVILEGES ON petstoredb.* To 'petuser'@'localhost';

FLUSH PRIViLEGES;

DROP DATABASE IF EXISTS petstoredb;
CREATE DATABASE petstoredb;
