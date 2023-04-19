DROP TABLE IF EXISTS usuario_grupo;
DROP TABLE IF EXISTS mensajes;
DROP TABLE IF EXISTS grupos;
DROP TABLE IF EXISTS juegos;
DROP TABLE IF EXISTS usuarios;

CREATE TABLE usuarios (
	id int NOT NULL AUTO_INCREMENT,
	nombre_apel varchar(100) DEFAULT NULL,
    username varchar(100) DEFAULT NULL,
    contrasena varchar(100) DEFAULT NULL,
    email varchar(100) DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE juegos (
	id int NOT NULL AUTO_INCREMENT,
	nombre varchar(100) DEFAULT NULL,
    descripcion varchar(300) DEFAULT NULL,
    imagen_URL varchar(100) DEFAULT NULL,
    PRIMARY KEY (id)
);

CREATE TABLE grupos (
	id int NOT NULL AUTO_INCREMENT,
	nombre varchar(100) DEFAULT NULL,
    descripcion varchar(300) DEFAULT NULL,
    imagen_URL varchar(100) DEFAULT NULL,
    creador_id int DEFAULT NULL,
    juego_id int DEFAULT NULL,
    PRIMARY KEY (id),
	CONSTRAINT grupos_FK1 FOREIGN KEY (creador_id) REFERENCES usuarios (id),
    CONSTRAINT grupos_FK2 FOREIGN KEY (juego_id) REFERENCES juegos (id)
    ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE mensajes (
	id int NOT NULL AUTO_INCREMENT,
	contenido varchar(250) DEFAULT NULL,
    usuario_id int DEFAULT NULL,
    juego_id int DEFAULT NULL,
    grupo_id int DEFAULT NULL,
    PRIMARY KEY (id),
	CONSTRAINT mensajes_FK1 FOREIGN KEY (usuario_id) REFERENCES usuarios (id),
    CONSTRAINT mensajes_FK2 FOREIGN KEY (grupo_id) REFERENCES grupos (id)
    ON UPDATE CASCADE ON DELETE CASCADE
);

CREATE TABLE usuario_grupo (
	id int NOT NULL AUTO_INCREMENT,
    usuario_id int DEFAULT NULL,
	grupo_id int DEFAULT NULL,
	PRIMARY KEY (id),
	CONSTRAINT usuario_grupos_FK1 FOREIGN KEY (usuario_id) REFERENCES usuarios (id),
    CONSTRAINT usuario_grupo_FK2 FOREIGN KEY (grupo_id) REFERENCES grupos (id)
    ON UPDATE CASCADE ON DELETE CASCADE
);

INSERT INTO usuarios (nombre_apel, username, contrasena, email) VALUES 
('Roger Gibert', 'Rigoberto', 'bfjhsbjfq112', 'rogergibert@email.com'),
('Pedro Pascal', 'DinDjarin', 'fdkjsujkjui001', 'pedropascal@email.com'),
('Temuera Morrison', 'BobaFett', 'erwrew999', 'temueramorrison@email.com'),
('Rosario Dawson', 'AhsokaTano', '213nkhi32', 'rosariodawson@email.com'),
('Giancarlo Esposito', 'MoffGideon', 'fbhdjbj1231', 'giancarloesposito@email.com');

INSERT INTO juegos (nombre) VALUES 
('Counter Strike'),
('Rocket League'),
('Star Wars Battlefront 2'),
('Assetto Corsa');

INSERT INTO grupos (nombre, creador_id, juego_id) VALUES 
('Unos battlefronts?', 2, 3),
('Vamos al Rocket', 5, 2),
('Counter de chill', 3, 1);

INSERT INTO mensajes (contenido, usuario_id, grupo_id) VALUES
('Hola, hay alguien?', 1, 1),
('Solo tu y yo de momento', 5, 1),
('Uno mas para jugar', 2, 1),
('El ultimo como siempre...', 3, 1);

INSERT INTO usuario_grupo (usuario_id, grupo_id) VALUES
(1, 1),
(2, 1),
(3, 1),
(4, 1),
(5, 1);