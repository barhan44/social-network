-- ROLE
CREATE ROLE "user" WITH
  LOGIN
  PASSWORD 'password';

-- DATABASE
CREATE DATABASE social
    WITH 
    OWNER = "user"
    ENCODING = 'UTF8'
    CONNECTION LIMIT = -1;

-- PRIVILEGES
GRANT ALL PRIVILEGES ON DATABASE "social" to "user";

-- EDUCATION TABLE
CREATE TABLE education (
    id bigint NOT NULL,
    id_profile bigint NOT NULL,
    begin_year integer NOT NULL,
    finish_year integer,
    institution text NOT NULL,
    specialization character varying(255) NOT NULL
);


ALTER TABLE education OWNER TO "user";

CREATE SEQUENCE education_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE education_seq OWNER TO "user";

-- HOBBIES TABLE
CREATE TABLE hobby (
    id bigint NOT NULL,
    id_profile bigint NOT NULL,
    name character varying(30) NOT NULL
);


ALTER TABLE hobby OWNER TO "user";

CREATE SEQUENCE hobby_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE hobby_seq OWNER TO "user";

-- PROFILE TABLE (!!!---MAIN ENITITY---!!!)
CREATE TABLE profile (
    id bigint NOT NULL,
    uid character varying(100) NOT NULL,
    first_name character varying(50) NOT NULL,
    last_name character varying(50) NOT NULL,
    birth_day date,
    phone character varying(20),
    email character varying(100),
    country character varying(60),
    city character varying(100),
    large_photo character varying(255),
    small_photo character varying(255),
    password character varying(255) NOT NULL,
    completed boolean NOT NULL,
    created timestamp(0) without time zone DEFAULT now() NOT NULL
);


ALTER TABLE profile OWNER TO "user";

CREATE SEQUENCE profile_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE profile_seq OWNER TO "user";

-- SKILLS TABLE
CREATE TABLE skill (
    id bigint NOT NULL,
    id_profile bigint NOT NULL,
    category character varying(50) NOT NULL,
    value text NOT NULL
);


ALTER TABLE skill OWNER TO "user";

----------------------------------------------

CREATE TABLE skill_category (
    id bigint NOT NULL,
    category character varying(50) NOT NULL
);


ALTER TABLE skill_category OWNER TO "user";

CREATE SEQUENCE skill_seq
    START WITH 1
    INCREMENT BY 1
    NO MINVALUE
    NO MAXVALUE
    CACHE 1;


ALTER TABLE skill_seq OWNER TO "user";

-- SEQUENCES
SELECT pg_catalog.setval('education_seq', 1, false);
SELECT pg_catalog.setval('hobby_seq', 1, false);
SELECT pg_catalog.setval('profile_seq', 1, false);
SELECT pg_catalog.setval('skill_seq', 1, false);

-- CONSTRAINTS
ALTER TABLE ONLY education
    ADD CONSTRAINT education_pkey PRIMARY KEY (id);

ALTER TABLE ONLY hobby
    ADD CONSTRAINT hobbi_pkey PRIMARY KEY (id);

ALTER TABLE ONLY profile
    ADD CONSTRAINT profile_pkey PRIMARY KEY (id);

ALTER TABLE ONLY profile
    ADD CONSTRAINT profile_uid_key UNIQUE (uid);

ALTER TABLE ONLY profile
    ADD CONSTRAINT profile_email_key UNIQUE (email);

ALTER TABLE ONLY profile
    ADD CONSTRAINT profile_phone_key UNIQUE (phone);

ALTER TABLE ONLY skill_category
    ADD CONSTRAINT skill_category_category_key UNIQUE (category);

ALTER TABLE ONLY skill_category
    ADD CONSTRAINT skill_category_pkey PRIMARY KEY (id);

ALTER TABLE ONLY skill
    ADD CONSTRAINT skill_pkey PRIMARY KEY (id);

-- INDEXES
CREATE INDEX education_idx ON education USING btree (id_profile);
CREATE INDEX education_idx1 ON education USING btree (finish_year);
CREATE INDEX hobbi_idx ON hobby USING btree (id_profile);
CREATE INDEX skill_idx ON skill USING btree (id_profile);

-- FOREIGN KEYS
ALTER TABLE ONLY education
    ADD CONSTRAINT education_fk FOREIGN KEY (id_profile) REFERENCES profile(id) ON UPDATE CASCADE ON DELETE CASCADE;
ALTER TABLE ONLY hobby
    ADD CONSTRAINT hobby_fk FOREIGN KEY (id_profile) REFERENCES profile(id) ON UPDATE CASCADE ON DELETE CASCADE;
ALTER TABLE ONLY skill
    ADD CONSTRAINT skill_fk FOREIGN KEY (id_profile) REFERENCES profile(id) ON UPDATE CASCADE ON DELETE CASCADE;

