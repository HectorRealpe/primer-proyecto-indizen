INSERT INTO usuarios (id, nombre, apellido, nick, sexo, email, edad, banco, pelis) VALUES (1, 'Héctor', 'Realpe', 'helui', 'masculino', 'hl.realpe@indizen.com', 38, 'BASD6464567', false);
INSERT INTO usuarios (id, nombre, apellido, nick, sexo, email, edad, banco, pelis) VALUES (2, 'nombre2', 'apellido2', 'nickPrueba', 'femenino', 'prueba@indizen.com', 32, 'BASD6464567', false);








/* User y sus roles */
INSERT INTO users (username, password, enabled) VALUES ('hector','$2a$10$LH/ZMVGRddXrN3QuOgBGsO5RLPuMjSJEaHZe5VA6lNRolza2UukGO',true);
INSERT INTO users (username, password, enabled) VALUES ('admin','$2a$10$PEP543LVgaeEI03Zyo2FPe20IUcU31V6cMMO8opJBlpox0MhJesQe',true);

INSERT INTO authorities (user_id, authority) VALUES (1,'ROLE_USER');
INSERT INTO authorities (user_id, authority) VALUES (2,'ROLE_ADMIN');
INSERT INTO authorities (user_id, authority) VALUES (2,'ROLE_USER');