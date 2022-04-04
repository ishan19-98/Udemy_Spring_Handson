create table Person(
id integer  not null,
name varchar(255) not null,
location varchar(255),
birthDate timestamp,
primary key(id) 
 );
 
Insert into Person (id,name,location,birthDate)
values(1,'Ishan','Nimach',Sysdate());
Insert into Person (id,name,location,birthDate)
values(2,'Ishan','Mumbai',Sysdate());
Insert into Person (id,name,location,birthDate)
values(3,'Ayush','USA',Sysdate());
