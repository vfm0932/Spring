create database persona;
create table persona(
id int  auto_increment unique not null , 
nombre varchar(40) ,
apellido varchar(40) ,
email varchar (40) ,
telefono varchar (40)
);
alter table persona auto_increment = 1;
select  * from persona;

insert into persona values (1,'pablo' , 'rafita' , 'rafii@gmail.com' , '662345677');



