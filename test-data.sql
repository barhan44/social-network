INSERT INTO PROFILE (id, uid, first_name, last_name, birth_day, phone, email, country, city, password, completed, created)
VALUES (nextval('profile_seq'),'test-user', 'Ivan', 'Ivanov', '1999-01-08', '+7999-111-22-33', 'test@email.com', 'Russia', 'Moscow', 'hash_will_be_here', true, current_timestamp);

INSERT INTO EDUCATION (id, id_profile, begin_year, finish_year, institution, specialization)
VALUES (nextval('education_seq'), 1, 2000, 2005, 'MGU', 'Computer Science');

INSERT INTO HOBBY (id, id_profile, name)
VALUES (nextval('hobby_seq'), 1, 'programmin');
INSERT INTO HOBBY (id, id_profile, name)
VALUES (nextval('hobby_seq'), 1, 'cs');
INSERT INTO HOBBY (id, id_profile, name)
VALUES (nextval('hobby_seq'), 1, 'hockey');

INSERT INTO SKILL(id, id_profile, category, value)
VALUES (nextval('skill_seq'), 1, 'Programming Language', 'Java');
INSERT INTO SKILL(id, id_profile, category, value)
VALUES (nextval('skill_seq'), 1, 'Programming Language', 'JavaScript');
INSERT INTO SKILL(id, id_profile, category, value)
VALUES (nextval('skill_seq'), 1, 'RDBMS', 'Postgres, Oracle');

INSERT INTO SKILL_CATEGORY(id, category)
VALUES (1, 'Programming Language');
INSERT INTO SKILL_CATEGORY(id, category)
VALUES (2, 'RDBMS');