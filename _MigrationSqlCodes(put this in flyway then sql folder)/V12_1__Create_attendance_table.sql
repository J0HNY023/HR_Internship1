CREATE TABLE attendance_table (
  id INT NOT NULL AUTO_INCREMENT,
  IDNumber INT NOT NULL,
  name VARCHAR(45) NULL,
  timein_date VARCHAR(45) NULL,
  timein_time VARCHAR(45) NULL,
  timeout_date VARCHAR(45) NULL,
  timeout_time VARCHAR(45) NULL,
  status VARCHAR(45) NULL,
  hours VARCHAR(45) NULL,
  PRIMARY KEY (id));