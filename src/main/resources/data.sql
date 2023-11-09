DROP table IF EXISTS Fabricantes;
DROP table IF EXISTS Articulos;

CREATE TABLE IF NOT EXISTS Fabricantes (
    Codigo INT PRIMARY KEY AUTO_INCREMENT,
    Nombre NVARCHAR(100)
);

CREATE TABLE IF NOT EXISTS Articulos (
    Codigo INT PRIMARY KEY AUTO_INCREMENT,
    CodigoFabricante INT,
    Nombre NVARCHAR(100),
    Precio INT,
    Fabricante INT,
    FOREIGN KEY (CodigoFabricante)
        REFERENCES Fabricantes (Codigo)
        ON DELETE CASCADE ON UPDATE CASCADE
);

INSERT INTO Fabricantes (Nombre) VALUES ('Fabricante 1');
INSERT INTO Fabricantes (Nombre) VALUES ('Fabricante 2');
INSERT INTO Articulos (CodigoFabricante, Nombre, Precio) VALUES (1, 'Artículo 1', 100);
INSERT INTO Articulos (CodigoFabricante, Nombre, Precio) VALUES (2, 'Artículo 2', 150);