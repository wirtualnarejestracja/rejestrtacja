CREATE TABLE 'tabela' (
        'id' int(3) NOT NULL,
        'marka' varchar(20) DEFAULT NULL,
        'kolor' varchar(20) DEFAULT NULL,
        'silnik' varchar(20) DEFAULT NULL,
        'imie' varchar(20) DEFAULT NULL,
        PRIMARY KEY ('id')
        ) 
        ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
SELECT * FROM demo.tabela;