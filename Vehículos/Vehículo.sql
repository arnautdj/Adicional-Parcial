CREATE TABLE Propietario (
    idProp INT PRIMARY KEY AUTO_INCREMENT,
    cedula VARCHAR(10) NOT NULL UNIQUE,
    apellido VARCHAR(50),
    nombre VARCHAR(50)
);

CREATE TABLE Vehiculo (
    idVehi INT PRIMARY KEY AUTO_INCREMENT,
    placa VARCHAR(10) NOT NULL UNIQUE,
    marca VARCHAR(50),
    estado INT,
    idProp INT,
    FOREIGN KEY (idProp) REFERENCES Propietario(idProp)
);

CREATE TABLE Turno (
    idTurn INT PRIMARY KEY AUTO_INCREMENT,
    anden INT,
    dia DATE,
    hora TIME,
    idVehi INT,
    FOREIGN KEY (idVehi) REFERENCES Vehiculo(idVehi)
);
