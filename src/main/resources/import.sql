INSERT INTO usuarios (id, nombre, apellido, nick, sexo, email, edad, banco, pelis) VALUES (3, 'nombre3', 'apellido3', 'nickPrueba', 'masculino', 'prueba@indizen.com', 32, 'BASD6464567', false);
INSERT INTO usuarios (id, nombre, apellido, nick, sexo, email, edad, banco, pelis) VALUES (4, 'nombre4', 'apellido4', 'nickPrueba', 'femenino', 'prueba@indizen.com', 32, 'BASD6464567', false);
INSERT INTO usuarios (id, nombre, apellido, nick, sexo, email, edad, banco, pelis) VALUES (5, 'nombre5', 'apellido5', 'nickPrueba', 'masculino', 'prueba@indizen.com', 32, 'BASD6464567', false);
INSERT INTO usuarios (id, nombre, apellido, nick, sexo, email, edad, banco, pelis) VALUES (6, 'nombre6', 'apellido6', 'nickPrueba', 'femenino', 'prueba@indizen.com', 32, 'BASD6464567', false);
INSERT INTO usuarios (id, nombre, apellido, nick, sexo, email, edad, banco, pelis) VALUES (7, 'nombre7', 'apellido7', 'nickPrueba', 'masculino', 'prueba@indizen.com', 32, 'BASD6464567', false);
INSERT INTO usuarios (id, nombre, apellido, nick, sexo, email, edad, banco, pelis) VALUES (8, 'nombre8', 'apellido8', 'nickPrueba', 'femenino', 'prueba@indizen.com', 32, 'BASD6464567', false);
INSERT INTO usuarios (id, nombre, apellido, nick, sexo, email, edad, banco, pelis) VALUES (9, 'nombre9', 'apellido9', 'nickPrueba', 'masculino', 'prueba@indizen.com', 32, 'BASD6464567', false);
INSERT INTO usuarios (id, nombre, apellido, nick, sexo, email, edad, banco, pelis) VALUES (10, 'nombre10', 'apellido10', 'nickPrueba', 'femenino', 'prueba@indizen.com', 32, 'BASD6464567', false);







/* User y sus roles */
INSERT INTO users (username, password, enabled) VALUES ('hector','$2a$10$LH/ZMVGRddXrN3QuOgBGsO5RLPuMjSJEaHZe5VA6lNRolza2UukGO',true);
INSERT INTO users (username, password, enabled) VALUES ('admin','$2a$10$PEP543LVgaeEI03Zyo2FPe20IUcU31V6cMMO8opJBlpox0MhJesQe',true);

INSERT INTO authorities (user_id, authority) VALUES (1,'ROLE_USER');
INSERT INTO authorities (user_id, authority) VALUES (2,'ROLE_ADMIN');
INSERT INTO authorities (user_id, authority) VALUES (2,'ROLE_USER');
