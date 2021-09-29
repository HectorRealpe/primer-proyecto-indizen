INSERT INTO usuarios (id, nombre, apellido, password, enabled, nick, sexo, email, edad, banco, pelis) VALUES (1, 'Héctor', 'Realpe','$2a$10$O9wxmH/AeyZZzIS09Wp8YOEMvFnbRVJ8B4dmAMVSGloR62lj.yqXG',true, 'helui', 'masculino', 'hl.realpe@indizen.com', 38, 'BASD6464567', false);


INSERT INTO authorities (user_id, authority) VALUES (1,'ROLE_ADMIN');