--<ScriptOptions statementTerminator=";"/>

CREATE TABLE model_procjene (
		godina INT4 NOT NULL,
		opis VARCHAR(30)
	);

CREATE UNIQUE INDEX model_procjene_pkey ON model_procjene (godina ASC);

ALTER TABLE model_procjene ADD CONSTRAINT model_procjene_pkey PRIMARY KEY (godina);

