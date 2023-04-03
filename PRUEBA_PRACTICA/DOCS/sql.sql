CREATE DATABASE `telconet` /*!40100 DEFAULT CHARACTER SET utf8mb4 */;


CREATE TABLE `usuario` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombres` varchar(600) NOT NULL,
  `correo` varchar(80) NOT NULL,
  `contrasena` varchar(80) NOT NULL,
  `areaestudio` varchar(100) NOT NULL,
  `especialidad` varchar(100) NOT NULL,
  `tipousuario` varchar(50) NOT NULL,
  `nivelacademico` varchar(100) NOT NULL,
  `motivoregistro` varchar(800) NOT NULL,
  `prioridad` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4;


CREATE TABLE `curso` (
  `idCurso` int(11) NOT NULL AUTO_INCREMENT,
  `nombrecurso` varchar(400) NOT NULL,
  `documentacionteorica` varchar(400) NOT NULL,
  `duracion` int(11) NOT NULL,
  `cantidadmaxima` int(11) NOT NULL,
  `idProfesor` int(11) NOT NULL,
  PRIMARY KEY (`idCurso`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;