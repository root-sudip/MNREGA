create database MNREGA;
create table project_by_BDO(
	SLN int primary key not null auto_increment,
	Project_Name varchar(255),
	Signed_BDO_Name varchar(255),
	Date_Of_Issue date,
	Panchayat_Name varchar(255),
	Recived_Panchayat_member_name varchar(255),
	Money double,
	Duration varchar(255)
);

