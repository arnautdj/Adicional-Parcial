CREATE TABLE IF NOT EXISTS Cliente (
    idClie INT AUTO_INCREMENT PRIMARY KEY,
    cedula VARCHAR(10) NOT NULL UNIQUE,
    nombres VARCHAR(50),
    apellidos VARCHAR(50)
);

CREATE TABLE IF NOT EXISTS Celular (
    idCel INT AUTO_INCREMENT PRIMARY KEY,
    numero VARCHAR(10) NOT NULL UNIQUE,
    estado INT NOT NULL,
    saldo INT DEFAULT 0,
    megas INT DEFAULT 0,
    idClie INT,
    FOREIGN KEY (idClie) REFERENCES Cliente(idClie)
);

CREATE TABLE IF NOT EXISTS Recarga (
    idReca INT AUTO_INCREMENT PRIMARY KEY,
    valor INT NOT NULL,
    saldo INT,
    megas INT,
    idCel INT,
    FOREIGN KEY (idCel) REFERENCES Celular(idCel)
);