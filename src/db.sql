create database MeetingRoomReservationSystem;
use MeetingRoomReservationSystem;

create table user(
userId int primary key auto_increment,
userName varchar(20) unique,
password varchar(20)
)Engine=InnoDB default charset=utf8;

create table administrator(
adminId int primary key auto_increment,
adminName varchar(20) unique,
password varchar(20)
)Engine=InnoDB default charset=utf8;

create table meetingRoom(
meetingNumber varchar(5) primary key,
capacity int,
area int,
)Engine=InnoDB default charset=utf8;

create table reservation_req(
r_id int primary key auto_increment,
userName varchar(20),
states varchar(20) default '未审批' not null,
capacity int,
area int,
function varchar(40),
reqTime datetime
)Engine=InnoDB default charset=utf8;

create table record(
r_id int,
userName varchar(20),
adminName int,
states varchar(20) not null,
approvalTime datetime,
primary key(r_id,userName,adminName),
foreign key(r_id) references reservation_req(r_id)
)Engine=InnoDB default charset=utf8;

insert into user values(114514,'zhangsan',123456);