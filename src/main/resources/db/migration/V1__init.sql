create table pessoa
(
	id serial not null
		constraint pessoa_pk
			primary key,
	nome text not null,
	idade integer not null
);

create table carro
(
    id serial not null
        constraint carro_pk
            primary key,
    modelo text not null,
    ano integer not null
)
