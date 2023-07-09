-- public.tab_profissao definition

-- Drop table

-- DROP TABLE public.tab_profissao;

CREATE TABLE teste.tab_professor (
	id          int auto_increment,
	nome        varchar(255)    NOT NULL,
	dataNascimento date NOT NULL,
	cargaHoraria int NOT NULL,
	valorHora double NOT NULL,
	estrangeiro boolean NOT NULL,
	horasDisponiveis integer NOT NULL,
	biografia text NOT NULL,
	dataHoraCadastro datetime NOT NULL,

	PRIMARY KEY (id)
);

/* insert into tab_professor
(nome, dataNascimento, cargaHoraria, valorHora, estrangeiro, horasDisponiveis, biografia, dataHoraCadastro)
values ('INSTRUTOR', '1990-05-01');*/