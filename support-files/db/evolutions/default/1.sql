set ignorecase true;

# --- First database schema

# --- !Ups
create table vehicle
(
    sNo          bigint    auto_increment   not null,
    name         varchar(255) not null,
    year         bigint,
    manufacturer varchar(255) ,
    fuelType     varchar(255) ,
    transmission varchar(255) ,

    constraint pk_company primary key (sNo)
)
;




create table user
(
    username varchar(255) not null,
    password varchar(255) not null,
    userrole varchar(255) not null,
    constraint pk_user primary key (username)
)
;


# --- !Downs

drop table if exists user;

drop table if exists vehicle;