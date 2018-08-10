delete from `jeZahrnutaDo`;
delete from `Pozice`;
delete from `Regal`;
delete from `Sekce`;
delete from `StavRegalu`;
delete from `Zakaznik`;
delete from `Zamestnanec`;
delete from `PoziceZamestnance`;
delete from `Zasilka`;
delete from `Inventura`;
delete from `Login`;
delete from `Osoba`;
delete from `Adresa`;
delete from `Benefit`;
delete from `Krehkost`;
delete from `StavZasilky`;

INSERT INTO Benefit VALUES ('Default', 'V�choz� tarif poskytuj�c� slevu 2% na v�echny odeslan� z�silky', STR_TO_DATE('1-01-2020', '%d-%m-%Y') );
INSERT INTO Benefit VALUES ('Bronze', 'Tarif bronzov�ho klienta poskytuj�c� slevu 8% na v�echny odeslan� z�silky', STR_TO_DATE('1-01-2020', '%d-%m-%Y') );
INSERT INTO Benefit VALUES ('Silver', 'Tarif st��brn�ho klienta poskytuj�c� slevu 15% na v�echny odeslan� z�silky', STR_TO_DATE('1-01-2020', '%d-%m-%Y') );
INSERT INTO Benefit VALUES ('Gold', 'Tarif zlat�ho klienta poskytuj�c� slevu 25% na v�echny odeslan� z�silky', STR_TO_DATE('1-01-2020', '%d-%m-%Y') );

INSERT INTO Adresa VALUES (6, 'Praha', 11000, 'Pod mostem', 1);
INSERT INTO Adresa VALUES (8, 'Brno', 60200, 'U metra', 2);
INSERT INTO Adresa VALUES (3, 'Praha', 16000, 'Slep�', 3);
INSERT INTO Adresa VALUES (6, 'Plze�', 30100, 'Pr�vnick�', 4);

INSERT INTO Osoba VALUES (STR_TO_DATE('1-01-1960', '%d-%m-%Y'), 'Josef', 'Vysko�', 1001011201,1, 1);
INSERT INTO Osoba VALUES (STR_TO_DATE('1-01-1950', '%d-%m-%Y'), 'Anna', 'Dlanov�', 1051011202,2, 2);
INSERT INTO Osoba VALUES (STR_TO_DATE('1-01-1980', '%d-%m-%Y'), 'Tom�', 'Jedno', 1001011203,3, 3);
INSERT INTO Osoba VALUES (STR_TO_DATE('1-01-1970', '%d-%m-%Y'), 'Ji��', 'Sko�dopole', 1001011204, 4, 4);
INSERT INTO Osoba VALUES (STR_TO_DATE('1-01-1970', '%d-%m-%Y'), 'Marta', 'Vysko�ov�', 1051011205, 5, 1);

INSERT INTO Zakaznik VALUES ('Gold', 'josef.vyskoc@gmail.com', 1234567890,502478965, 1, 1);
INSERT INTO Zakaznik VALUES ('Default', 'anna.dlanova@gmail.com', NULL,905478965, 2, 2);
INSERT INTO Zakaznik VALUES ('Bronze', 'tomas.jedno@yahoo.com', NULL,605478965, 3, 3);

INSERT INTO PoziceZamestnance VALUES ('Manager', 'Vedouc� pracovn�k v managementu');
INSERT INTO PoziceZamestnance VALUES ('Skladnik', 'Oper�tor skladov�ch prostor');
INSERT INTO PoziceZamestnance VALUES ('Sekretarka', 'Pracovn�k za p�ep�kou');

INSERT INTO Login VALUES ('skocdjir', 'heslo1234');
INSERT INTO Login VALUES ('vyskomar', 'heslo1234');
INSERT INTO Login VALUES ('jednotom', 'heslo1234');
INSERT INTO Login VALUES ('kubatja3', 'heslo456');

INSERT INTO Zamestnanec VALUES ('skocdjir@sklad.cz', 'Manager', 789654123, 'skocdjir', 4, 1);
INSERT INTO Zamestnanec VALUES ('vyskomar@sklad.cz', 'Sekretarka', 789123654, 'vyskomar', 5, 2);
INSERT INTO Zamestnanec VALUES ('jednotom@sklad.cz', 'Skladnik', 654789123, 'jednotom', 3, 3);

INSERT INTO Krehkost VALUES ('Default', 'V�choz� stav z�silky, nem� ur�enou k�ehkost');
INSERT INTO Krehkost VALUES ('Fragile', 'K�ehk� z�silka');

INSERT INTO Inventura VALUES (STR_TO_DATE('1-01-1917', '%d-%m-%Y'), STR_TO_DATE('1-01-1970', '%d-%m-%Y'), STR_TO_DATE('1-01-2016', '%d-%m-%Y'), 1, 'Prvn� inventura');
INSERT INTO Inventura VALUES (STR_TO_DATE('1-01-2017', '%d-%m-%Y'), STR_TO_DATE('1-01-2016', '%d-%m-%Y'), STR_TO_DATE('1-01-2017', '%d-%m-%Y'), 2, 'Druh� inventura');


INSERT INTO StavZasilky VALUES ('Prijata', 'P�ijat� z�silka, jest� nen� um�st�na ve skladu.');
INSERT INTO StavZasilky VALUES ('Odeslana', 'Odeslan� adres�tovi.');
INSERT INTO StavZasilky VALUES ('Uskladnena', 'P�ijat� z�silka um�st�na na konkr�tn�m m�st� ve skladu.');

INSERT INTO Zasilka VALUES (STR_TO_DATE('1-01-2016', '%d-%m-%Y'), STR_TO_DATE('1-02-2016', '%d-%m-%Y'), 20, 'A-51-1-5A-1','Default', 1, 1, 3, 'Odeslana');
INSERT INTO Zasilka VALUES (STR_TO_DATE('1-11-2017', '%d-%m-%Y'), NULL, 0.020, 'A-51-1-5A-2','Default', 2, 1, 3, 'Prijata');
INSERT INTO Zasilka VALUES (STR_TO_DATE('1-11-2017', '%d-%m-%Y'), NULL, 1, 'A-51-1-5B-3','Default', 3, 1, 3, 'Prijata');

INSERT INTO jeZahrnutaDo VALUES (1, 1);
INSERT INTO jeZahrnutaDo VALUES (2, 1);
INSERT INTO jeZahrnutaDo VALUES (2, 2);

INSERT INTO StavRegalu VALUES ('OK', 'V�choz� stav, funk�n�');
INSERT INTO StavRegalu VALUES ('Bad', 'Rozbit�');

INSERT INTO Sekce VALUES ('A-51', '1 sektor',1);
INSERT INTO Sekce VALUES ('A-52', NULL, 2);

INSERT INTO Regal VALUES (100.5, 'A-51-1', 1, 1, 'OK',null);
INSERT INTO Regal VALUES (100.5, 'A-51-2', 2, 1, 'OK',null);
INSERT INTO Regal VALUES (100.5, 'A-52-1', 3, 2, 'OK',null);
INSERT INTO Regal VALUES (100.5, 'A-52-2', 4, 2, 'Bad',null);

INSERT INTO Pozice VALUES (5, 'A', 2, 1, 'A-51-1-5A');
INSERT INTO Pozice VALUES (5, 'B', 3, 1, 'A-51-1-5B');
INSERT INTO Pozice VALUES (4, 'A', NULL, 1, 'A-51-1-4A');
INSERT INTO Pozice VALUES (3, 'A', NULL, 1, 'A-51-1-3A');
INSERT INTO Pozice VALUES (2, 'A', NULL, 1, 'A-51-1-2A');