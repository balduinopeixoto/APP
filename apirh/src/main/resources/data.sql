insert into FUNCIONARIO (
DATA_NASCIMENTO,NACIONALIDADE,NOME_COMPLETO,NUMERODOC,SEXO,TIPODOCUMENTO) values(
'1993-04-25','Angolana','Domingos Garcia','000101029292','Masculino','BI');


insert into FUNCIONARIO (
DATA_NASCIMENTO,NACIONALIDADE,NOME_COMPLETO,NUMERODOC,SEXO,TIPODOCUMENTO) values(
'1993-04-25','Angolana','Ernesto Tadeu','000101029292','Masculino','BI');


insert into contacto (contacto,tipo,funcionario_id) values('949913452', 'Telefone', 1);
insert into contacto (contacto,tipo,funcionario_id) values('949913677', 'Telefone', 2);

insert into endereco(bairro,pais,provincia,rua,idfuncionario_id) values('Viana','Angola','Luanda','Mulenvos',2);
insert into endereco(bairro,pais,provincia,rua,idfuncionario_id) values('Chongoroi','Angola','Benguela','Paraiso',2);

insert into TIPODE_CONTRATO (activo,descricao) values('true','Contrato Bilionario');
insert into TIPODE_CONTRATO (activo,descricao) values('true','Contrato Muito mau');

insert into FUNCIONARIO_CONTRATO (activo,datafim,datainicio,motivocancelamento,idfuncionario_id,tipodecontrato_id)values('True','2021-04-03','2021-04-03','Ainda não se cancelou',2,1);

insert into FUNCIONARIO_CONTRATO (activo,datafim,datainicio,motivocancelamento,idfuncionario_id,tipodecontrato_id)values('True','2021-04-03','2021-04-03','Ainda não se cancelou',1,1);

insert into FUNCIONARIO_HORISTA (salariohora,id)values(30000000,1);


insert into FUNCIONARIO_MENSALISTA (bonospormes,isentodeponto,salariomes,id) values(50000,'true',30000000,2);


insert into PARAMETRIZACAO_PONTO (horaentrada,horasaida,qtdhorasdias) values('08:00','17:46',9);
insert into PARAMETRIZACAO_PONTO (horaentrada,horasaida,qtdhorasdias) values('08:00','17:46',9);

insert into  PONTO (data,horaentrada,horasaida,PARAMETRIZACAO_PONTO_ID,funcionario_id) values('2021-03-18','08:00','17:30',2,1);
insert into  PONTO (data,horaentrada,horasaida,PARAMETRIZACAO_PONTO_ID,funcionario_id) values('2021-03-18','08:00','17:30',1,2);



insert into PROCESSAMENTO_SALARIO (dataprocessamento,exercicio,mes,funcionariocontrato_id) values('2021-03-27',2021,3,1);
insert into PROCESSAMENTO_SALARIO (dataprocessamento,exercicio,mes,funcionariocontrato_id) values('2021-03-27',2021,3,2);
