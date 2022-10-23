create database bd_imagen;
use bd_imagen;

create table fotos(
id_foto int auto_increment,
nombre varchar (90),
foto longblob,
primary key(id_foto)
);
select * from bd_imagen.fotos;

