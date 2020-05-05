-- Table: public.accountinfo

-- DROP TABLE public.accountinfo;

CREATE TABLE public.accountinfo
(
    id integer NOT NULL DEFAULT nextval('"AccountInfo_id_seq"'::regclass),
    accountid text COLLATE pg_catalog."default",
    password text COLLATE pg_catalog."default",
    isadmin numeric,
    isblocked numeric,
    CONSTRAINT "AccountInfo_pkey" PRIMARY KEY (id)
)
WITH (
    OIDS = FALSE
)
TABLESPACE pg_default;

ALTER TABLE public.accountinfo
    OWNER to postgres;

--Insert DB
select * from accountinfo;
insert into accountinfo (accountid, password,isadmin,isblocked) values('admin', 'admin', 1, 0);
insert into accountinfo (accountid, password,isadmin,isblocked) values('user','user', 0, 0);
