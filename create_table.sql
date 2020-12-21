create database electronicData;
use electronicData;

create table suppliers(
id int not null auto_increment primary key,
name nvarchar(255) not null,
address nvarchar(255) null,
phone varchar(50) null
)

create table categories(
id int not null primary key auto_increment,
name nvarchar(255) not null
)

CREATE TABLE products(
  id int NOT NULL PRIMARY KEY auto_increment,
  name NVARCHAR(255) NOT NULL,
  idSupplier int not null,
  idCategory int not null,
  description text null,
  image varchar(255) null,
  price double null,
  amount int null
  
);

ALTER TABLE products ADD CONSTRAINT fk_idSup FOREIGN KEY (idSupplier) REFERENCES suppliers(id);
ALTER TABLE products ADD CONSTRAINT fk_idCat FOREIGN KEY (idCategory) REFERENCES categories(id);

CREATE TABLE customers(
  id int NOT NULL PRIMARY KEY auto_increment,
  username VARCHAR(255) NOT NULL,
  password varchar(255) not null,
  fullname nvarchar(500) null,
  address nvarchar(500) null,
  phone varchar(50) null
);

CREATE TABLE cart(
  id int NOT NULL PRIMARY KEY auto_increment,
  idProduct int NOT NULL,
  idCustomer int not null,
  amount int default 1,
  price double null,
  total double null
);
ALTER TABLE cart ADD CONSTRAINT fk_idPro FOREIGN KEY (idProduct) REFERENCES products(id);
ALTER TABLE cart ADD CONSTRAINT fk_idCus FOREIGN KEY (idCustomer) REFERENCES customers(id);

CREATE TABLE billOrder(
  id int NOT NULL PRIMARY KEY auto_increment,
  idCustomer int not null,
  createdate varchar(255) null,
  total double null
);
ALTER TABLE billOrder ADD CONSTRAINT fk_idCusBill FOREIGN KEY (idCustomer) REFERENCES customers(id);

CREATE TABLE rating(
  id int NOT NULL PRIMARY KEY auto_increment,
  idOrder int not null,
  createdate varchar(255) null,
  content nvarchar(500) null
);
ALTER TABLE rating ADD CONSTRAINT fk_idOrd FOREIGN KEY (idOrder) REFERENCES billOrder(id);

CREATE TABLE role(
  id int NOT NULL PRIMARY KEY auto_increment,
  name varchar(50) not null
);

CREATE TABLE admin(
  id int NOT NULL PRIMARY KEY auto_increment,
  idRole int not null,
  createdate varchar(255) null,
  username varchar(255) not null,
  password varchar(255) not null,
  fullname nvarchar(800) null,
  address nvarchar(800) null,
  phone varchar(50) null,
  status varchar(10) default "1"
);
ALTER TABLE admin ADD CONSTRAINT fk_idRole FOREIGN KEY (idRole) REFERENCES role(id);

