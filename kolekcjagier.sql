--------------------------------------------------------
--  File created - œroda-czerwiec-05-2019   
--------------------------------------------------------
-- Unable to render SEQUENCE DDL for object STUDENT.ISEQ$$_92326 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_92326 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 1;
-- Unable to render SEQUENCE DDL for object STUDENT.ISEQ$$_92328 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_92328 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 1;
-- Unable to render SEQUENCE DDL for object STUDENT.ISEQ$$_92330 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_92330 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 1;
-- Unable to render SEQUENCE DDL for object STUDENT.ISEQ$$_92332 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_92332 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 1;
-- Unable to render SEQUENCE DDL for object STUDENT.ISEQ$$_92334 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_92334 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 1;
-- Unable to render SEQUENCE DDL for object STUDENT.ISEQ$$_92336 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_92336 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 1;
-- Unable to render SEQUENCE DDL for object STUDENT.ISEQ$$_92338 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_92338 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 1;
-- Unable to render SEQUENCE DDL for object STUDENT.ISEQ$$_92340 with DBMS_METADATA attempting internal generator.
CREATE SEQUENCE ISEQ$$_92340 INCREMENT BY 1 MAXVALUE 9999999999999999999999999999 MINVALUE 1 CACHE 1;
--------------------------------------------------------
--  DDL for Table GATUNEK
--------------------------------------------------------

  CREATE TABLE "STUDENT"."GATUNEK" 
   (	"GATUNEK_GRY" VARCHAR2(255 BYTE), 
	"ID_GATUNEK" NUMBER GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE 
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K" ;
--------------------------------------------------------
--  DDL for Table GRA
--------------------------------------------------------

  CREATE TABLE "STUDENT"."GRA" 
   (	"ID_REGIONGRY" NUMBER, 
	"ID_PRODGRY" NUMBER, 
	"ID_GATUNEK" NUMBER, 
	"NAZWA_GRY" VARCHAR2(255 BYTE), 
	"OPIS" VARCHAR2(255 BYTE), 
	"ROK_PRODUKCJI" NUMBER, 
	"CENA_NOWEJ_GRY" NUMBER, 
	"CENA_PELNA" NUMBER, 
	"CENA_SAMEJ_GRY" NUMBER, 
	"ID_GRA" NUMBER GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE 
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K" ;
--------------------------------------------------------
--  DDL for Table PRODUCENT_GRY
--------------------------------------------------------

  CREATE TABLE "STUDENT"."PRODUCENT_GRY" 
   (	"NAZWA_FIRMY" VARCHAR2(255 BYTE), 
	"ID_PRODGRY" NUMBER GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE 
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K" ;
--------------------------------------------------------
--  DDL for Table PRODUCENT_SPRZETU
--------------------------------------------------------

  CREATE TABLE "STUDENT"."PRODUCENT_SPRZETU" 
   (	"NAZWA_FIRMY" VARCHAR2(255 BYTE), 
	"ID_PRODSPRZETU" NUMBER GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE 
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K" ;
--------------------------------------------------------
--  DDL for Table REGION_GRY
--------------------------------------------------------

  CREATE TABLE "STUDENT"."REGION_GRY" 
   (	"REGION" VARCHAR2(255 BYTE), 
	"ID_REGIONGRY" NUMBER GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE 
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K" ;
--------------------------------------------------------
--  DDL for Table REGION_SPRZETU
--------------------------------------------------------

  CREATE TABLE "STUDENT"."REGION_SPRZETU" 
   (	"REGION" VARCHAR2(255 BYTE), 
	"ID_REGIONSPRZETU" NUMBER GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE 
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K" ;
--------------------------------------------------------
--  DDL for Table RODZAJ_SPRZETU
--------------------------------------------------------

  CREATE TABLE "STUDENT"."RODZAJ_SPRZETU" 
   (	"RODZAJ" VARCHAR2(255 BYTE), 
	"ID_RODZAJSPRZETU" NUMBER GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE 
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K" ;
--------------------------------------------------------
--  DDL for Table SPRZET
--------------------------------------------------------

  CREATE TABLE "STUDENT"."SPRZET" 
   (	"ID_REGIONSPRZETU" NUMBER, 
	"ID_PRODSPRZETU" NUMBER, 
	"ID_RODZAJSPRZETU" NUMBER, 
	"NAZWA" VARCHAR2(20 BYTE), 
	"CENA" NUMBER, 
	"SPECYFIKACJA" VARCHAR2(255 BYTE), 
	"GENERACJA" NUMBER, 
	"ROK_POCZATKU_PRODUKCJI" NUMBER, 
	"ROK_ZAKONCZENIA_PRODUKCJI" NUMBER, 
	"ID_SPRZET" NUMBER GENERATED ALWAYS AS IDENTITY MINVALUE 1 MAXVALUE 9999999999999999999999999999 INCREMENT BY 1 START WITH 1 CACHE 20 NOORDER  NOCYCLE 
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K" ;
--------------------------------------------------------
--  DDL for Table SPRZETGRA
--------------------------------------------------------

  CREATE TABLE "STUDENT"."SPRZETGRA" 
   (	"ID_GRY" NUMBER, 
	"ID_SPRZETU" NUMBER
   ) SEGMENT CREATION DEFERRED 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 
 NOCOMPRESS LOGGING
  STORAGE( MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K" ;
REM INSERTING into STUDENT.GATUNEK
SET DEFINE OFF;
REM INSERTING into STUDENT.GRA
SET DEFINE OFF;
REM INSERTING into STUDENT.PRODUCENT_GRY
SET DEFINE OFF;
REM INSERTING into STUDENT.PRODUCENT_SPRZETU
SET DEFINE OFF;
REM INSERTING into STUDENT.REGION_GRY
SET DEFINE OFF;
REM INSERTING into STUDENT.REGION_SPRZETU
SET DEFINE OFF;
REM INSERTING into STUDENT.RODZAJ_SPRZETU
SET DEFINE OFF;
REM INSERTING into STUDENT.SPRZET
SET DEFINE OFF;
REM INSERTING into STUDENT.SPRZETGRA
SET DEFINE OFF;
--------------------------------------------------------
--  DDL for Index ID_SPRZET_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "STUDENT"."ID_SPRZET_PK" ON "STUDENT"."SPRZET" ("ID_SPRZET") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K" ;
--------------------------------------------------------
--  DDL for Index ID_RODZAJSPRZETU_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "STUDENT"."ID_RODZAJSPRZETU_PK" ON "STUDENT"."RODZAJ_SPRZETU" ("ID_RODZAJSPRZETU") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K" ;
--------------------------------------------------------
--  DDL for Index ID_REGIONSPRZETU_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "STUDENT"."ID_REGIONSPRZETU_PK" ON "STUDENT"."REGION_SPRZETU" ("ID_REGIONSPRZETU") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K" ;
--------------------------------------------------------
--  DDL for Index SPRZETGRA_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "STUDENT"."SPRZETGRA_PK" ON "STUDENT"."SPRZETGRA" ("ID_SPRZETU", "ID_GRY") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE( MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K" ;
--------------------------------------------------------
--  DDL for Index ID_REGIONGRY_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "STUDENT"."ID_REGIONGRY_PK" ON "STUDENT"."REGION_GRY" ("ID_REGIONGRY") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K" ;
--------------------------------------------------------
--  DDL for Index ID_PRODSPRZETU_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "STUDENT"."ID_PRODSPRZETU_PK" ON "STUDENT"."PRODUCENT_SPRZETU" ("ID_PRODSPRZETU") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K" ;
--------------------------------------------------------
--  DDL for Index ID_GRA_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "STUDENT"."ID_GRA_PK" ON "STUDENT"."GRA" ("ID_GRA") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K" ;
--------------------------------------------------------
--  DDL for Index ID_PRODGRY_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "STUDENT"."ID_PRODGRY_PK" ON "STUDENT"."PRODUCENT_GRY" ("ID_PRODGRY") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K" ;
--------------------------------------------------------
--  DDL for Index ID_GATUNEK_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "STUDENT"."ID_GATUNEK_PK" ON "STUDENT"."GATUNEK" ("ID_GATUNEK") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K" ;
--------------------------------------------------------
--  Constraints for Table PRODUCENT_SPRZETU
--------------------------------------------------------

  ALTER TABLE "STUDENT"."PRODUCENT_SPRZETU" MODIFY ("NAZWA_FIRMY" NOT NULL ENABLE);
  ALTER TABLE "STUDENT"."PRODUCENT_SPRZETU" MODIFY ("ID_PRODSPRZETU" NOT NULL ENABLE);
  ALTER TABLE "STUDENT"."PRODUCENT_SPRZETU" ADD CONSTRAINT "ID_PRODSPRZETU_PK" PRIMARY KEY ("ID_PRODSPRZETU")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K"  ENABLE;
--------------------------------------------------------
--  Constraints for Table REGION_GRY
--------------------------------------------------------

  ALTER TABLE "STUDENT"."REGION_GRY" MODIFY ("ID_REGIONGRY" NOT NULL ENABLE);
  ALTER TABLE "STUDENT"."REGION_GRY" MODIFY ("REGION" NOT NULL ENABLE);
  ALTER TABLE "STUDENT"."REGION_GRY" ADD CONSTRAINT "ID_REGIONGRY_PK" PRIMARY KEY ("ID_REGIONGRY")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K"  ENABLE;
--------------------------------------------------------
--  Constraints for Table SPRZET
--------------------------------------------------------

  ALTER TABLE "STUDENT"."SPRZET" MODIFY ("ID_SPRZET" NOT NULL ENABLE);
  ALTER TABLE "STUDENT"."SPRZET" MODIFY ("NAZWA" NOT NULL ENABLE);
  ALTER TABLE "STUDENT"."SPRZET" ADD CONSTRAINT "ID_SPRZET_PK" PRIMARY KEY ("ID_SPRZET")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K"  ENABLE;
--------------------------------------------------------
--  Constraints for Table SPRZETGRA
--------------------------------------------------------

  ALTER TABLE "STUDENT"."SPRZETGRA" MODIFY ("ID_GRY" NOT NULL ENABLE);
  ALTER TABLE "STUDENT"."SPRZETGRA" MODIFY ("ID_SPRZETU" NOT NULL ENABLE);
  ALTER TABLE "STUDENT"."SPRZETGRA" ADD CONSTRAINT "SPRZETGRA_PK" PRIMARY KEY ("ID_SPRZETU", "ID_GRY")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE( MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K"  ENABLE;
--------------------------------------------------------
--  Constraints for Table REGION_SPRZETU
--------------------------------------------------------

  ALTER TABLE "STUDENT"."REGION_SPRZETU" MODIFY ("ID_REGIONSPRZETU" NOT NULL ENABLE);
  ALTER TABLE "STUDENT"."REGION_SPRZETU" MODIFY ("REGION" NOT NULL ENABLE);
  ALTER TABLE "STUDENT"."REGION_SPRZETU" ADD CONSTRAINT "ID_REGIONSPRZETU_PK" PRIMARY KEY ("ID_REGIONSPRZETU")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K"  ENABLE;
--------------------------------------------------------
--  Constraints for Table RODZAJ_SPRZETU
--------------------------------------------------------

  ALTER TABLE "STUDENT"."RODZAJ_SPRZETU" MODIFY ("ID_RODZAJSPRZETU" NOT NULL ENABLE);
  ALTER TABLE "STUDENT"."RODZAJ_SPRZETU" MODIFY ("RODZAJ" NOT NULL ENABLE);
  ALTER TABLE "STUDENT"."RODZAJ_SPRZETU" ADD CONSTRAINT "ID_RODZAJSPRZETU_PK" PRIMARY KEY ("ID_RODZAJSPRZETU")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K"  ENABLE;
--------------------------------------------------------
--  Constraints for Table PRODUCENT_GRY
--------------------------------------------------------

  ALTER TABLE "STUDENT"."PRODUCENT_GRY" ADD CONSTRAINT "ID_PRODGRY_PK" PRIMARY KEY ("ID_PRODGRY")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K"  ENABLE;
  ALTER TABLE "STUDENT"."PRODUCENT_GRY" MODIFY ("ID_PRODGRY" NOT NULL ENABLE);
  ALTER TABLE "STUDENT"."PRODUCENT_GRY" MODIFY ("NAZWA_FIRMY" NOT NULL ENABLE);
--------------------------------------------------------
--  Constraints for Table GATUNEK
--------------------------------------------------------

  ALTER TABLE "STUDENT"."GATUNEK" MODIFY ("ID_GATUNEK" NOT NULL ENABLE);
  ALTER TABLE "STUDENT"."GATUNEK" MODIFY ("GATUNEK_GRY" NOT NULL ENABLE);
  ALTER TABLE "STUDENT"."GATUNEK" ADD CONSTRAINT "ID_GATUNEK_PK" PRIMARY KEY ("ID_GATUNEK")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K"  ENABLE;
--------------------------------------------------------
--  Constraints for Table GRA
--------------------------------------------------------

  ALTER TABLE "STUDENT"."GRA" MODIFY ("NAZWA_GRY" NOT NULL ENABLE);
  ALTER TABLE "STUDENT"."GRA" MODIFY ("ID_GRA" NOT NULL ENABLE);
  ALTER TABLE "STUDENT"."GRA" ADD CONSTRAINT "ID_GRA_PK" PRIMARY KEY ("ID_GRA")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 COMPUTE STATISTICS 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1
  BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "TMP_2K"  ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table GRA
--------------------------------------------------------

  ALTER TABLE "STUDENT"."GRA" ADD CONSTRAINT "ID_GATUNEK_FK" FOREIGN KEY ("ID_GATUNEK")
	  REFERENCES "STUDENT"."GATUNEK" ("ID_GATUNEK") ENABLE;
  ALTER TABLE "STUDENT"."GRA" ADD CONSTRAINT "ID_PRODGRY_FK" FOREIGN KEY ("ID_PRODGRY")
	  REFERENCES "STUDENT"."PRODUCENT_GRY" ("ID_PRODGRY") ENABLE;
  ALTER TABLE "STUDENT"."GRA" ADD CONSTRAINT "ID_REGIONGRY_FK" FOREIGN KEY ("ID_REGIONGRY")
	  REFERENCES "STUDENT"."REGION_GRY" ("ID_REGIONGRY") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table SPRZET
--------------------------------------------------------

  ALTER TABLE "STUDENT"."SPRZET" ADD CONSTRAINT "ID_PRODSPRZETU_FK" FOREIGN KEY ("ID_PRODSPRZETU")
	  REFERENCES "STUDENT"."PRODUCENT_SPRZETU" ("ID_PRODSPRZETU") ENABLE;
  ALTER TABLE "STUDENT"."SPRZET" ADD CONSTRAINT "ID_REGIONSPRZETU_FK" FOREIGN KEY ("ID_REGIONSPRZETU")
	  REFERENCES "STUDENT"."REGION_SPRZETU" ("ID_REGIONSPRZETU") ENABLE;
  ALTER TABLE "STUDENT"."SPRZET" ADD CONSTRAINT "ID_RODZAJSPRZETU_FK" FOREIGN KEY ("ID_RODZAJSPRZETU")
	  REFERENCES "STUDENT"."RODZAJ_SPRZETU" ("ID_RODZAJSPRZETU") ENABLE;
--------------------------------------------------------
--  Ref Constraints for Table SPRZETGRA
--------------------------------------------------------

  ALTER TABLE "STUDENT"."SPRZETGRA" ADD CONSTRAINT "ID_GRASPRZET_FK" FOREIGN KEY ("ID_GRY")
	  REFERENCES "STUDENT"."GRA" ("ID_GRA") ENABLE;
  ALTER TABLE "STUDENT"."SPRZETGRA" ADD CONSTRAINT "ID_SPRZETGRA_FK" FOREIGN KEY ("ID_SPRZETU")
	  REFERENCES "STUDENT"."SPRZET" ("ID_SPRZET") ENABLE;
--------------------------------------------------------
--  DDL for Procedure DELETE_GATUNEK
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."DELETE_GATUNEK" 
(  
  gat IN gatunek.gatunek_gry%TYPE
) AS 
BEGIN
  delete Gatunek where gatunek_gry = gat;
  COMMIT;
END DELETE_GATUNEK;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_GRA
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."DELETE_GRA" 
(  
  idg IN gra.id_gra%TYPE
) AS 
BEGIN
  delete Gra where id_gra = idg;
  COMMIT;
END DELETE_GRA;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_PRODUCENT_GRY
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."DELETE_PRODUCENT_GRY" 
(  
  naz IN producent_gry.nazwa_firmy%TYPE
) AS 
BEGIN
  delete Producent_gry where nazwa_firmy = naz;
  COMMIT;
END DELETE_PRODUCENT_GRY;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_PRODUCENT_SPRZETU
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."DELETE_PRODUCENT_SPRZETU" 
(  
  naz IN producent_sprzetu.nazwa_firmy%TYPE
) AS 
BEGIN
  delete Producent_sprzetu where nazwa_firmy = naz;
  COMMIT;
END DELETE_PRODUCENT_SPRZETU;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_REGION_GRY
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."DELETE_REGION_GRY" 
(  
  reg IN region_gry.region%TYPE
) AS 
BEGIN
  delete Region_gry where region = reg;
  COMMIT;
END DELETE_REGION_GRY;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_REGION_SPRZETU
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."DELETE_REGION_SPRZETU" 
(  
  reg IN region_sprzetu.region%TYPE
) AS 
BEGIN
  delete Region_sprzetu where region = reg;
  COMMIT;
END DELETE_REGION_SPRZETU;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_RODZAJ_SPRZETU
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."DELETE_RODZAJ_SPRZETU" 
(  
  rodz IN rodzaj_sprzetu.rodzaj%TYPE
) AS 
BEGIN
  delete Rodzaj_sprzetu where rodzaj = rodz;
  COMMIT;
END DELETE_RODZAJ_SPRZETU;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_SPRZET
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."DELETE_SPRZET" 
(  
  ids IN sprzet.id_sprzet%TYPE
) AS 
BEGIN
  delete Sprzet where id_sprzet = ids;
  COMMIT;
END DELETE_SPRZET;

/
--------------------------------------------------------
--  DDL for Procedure DELETE_SPRZETGRA
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."DELETE_SPRZETGRA" 
(  
  ids IN sprzetgra.id_sprzetu%TYPE
, idg IN sprzetgra.id_gry%TYPE
) AS 
BEGIN
  delete Sprzetgra where id_sprzetu = ids and id_gry = idg;
  COMMIT;
END DELETE_SPRZETGRA;

/
--------------------------------------------------------
--  DDL for Procedure GET_GATUNEK
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."GET_GATUNEK" 
(  
  wynik OUT SYS_REFCURSOR
) AS 
BEGIN
  open wynik for
    select id_gatunek, gatunek_gry
    from Gatunek;
END GET_GATUNEK;

/
--------------------------------------------------------
--  DDL for Procedure GET_GRA
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."GET_GRA" 
(  
  wynik OUT SYS_REFCURSOR
) AS 
BEGIN
  open wynik for
    select g.id_gra, rg.id_regiongry, rg.region, pg.id_prodgry, pg.nazwa_firmy, gg.id_gatunek, gg.gatunek_gry, g.nazwa_gry, g.opis, g.rok_produkcji, g.cena_nowej_gry, g.cena_pelna, g.cena_samej_gry
    from Gra g, Region_gry rg, Producent_gry pg, Gatunek gg
    where g.id_regiongry = rg.id_regiongry and g.id_prodgry = pg.id_prodgry and g.id_gatunek = gg.id_gatunek;
END GET_GRA;

/
--------------------------------------------------------
--  DDL for Procedure GET_GRA_ID
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."GET_GRA_ID" 
(
  id_gra IN gra.id_gra%TYPE
, wynik OUT SYS_REFCURSOR
) AS 
BEGIN
  open wynik for
    select g.id_gra, rg.id_regiongry, rg.region, pg.id_prodgry, pg.nazwa_firmy, gg.id_gatunek, gg.gatunek_gry, g.nazwa_gry, g.opis, g.rok_produkcji, g.cena_nowej_gry, g.cena_pelna, g.cena_samej_gry
    from Gra g, Region_gry rg, Producent_gry pg, Gatunek gg
    where g.id_regiongry = rg.id_regiongry and g.id_prodgry = pg.id_prodgry and g.id_gatunek = gg.id_gatunek and id_gra = id_gra;
END GET_GRA_ID;

/
--------------------------------------------------------
--  DDL for Procedure GET_GRA_NAZWA
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."GET_GRA_NAZWA" 
(  
  nazwa_gry IN gra.nazwa_gry%TYPE
, wynik OUT SYS_REFCURSOR
) AS 
BEGIN
  open wynik for
    select g.id_gra, rg.id_regiongry, rg.region, pg.id_prodgry, pg.nazwa_firmy, gg.id_gatunek, gg.gatunek_gry, g.nazwa_gry, g.opis, g.rok_produkcji, g.cena_nowej_gry, g.cena_pelna, g.cena_samej_gry
    from Gra g, Region_gry rg, Producent_gry pg, Gatunek gg
    where g.id_regiongry = rg.id_regiongry and g.id_prodgry = pg.id_prodgry and g.id_gatunek = gg.id_gatunek and nazwa_gry = nazwa_gry;
END GET_GRA_NAZWA;

/
--------------------------------------------------------
--  DDL for Procedure GET_PRODUCENT_GRY
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."GET_PRODUCENT_GRY" 
(  
  wynik OUT SYS_REFCURSOR
) AS 
BEGIN
  open wynik for
    select id_prodgry, nazwa_firmy
    from Producent_gry;
END GET_PRODUCENT_GRY;

/
--------------------------------------------------------
--  DDL for Procedure GET_PRODUCENT_SPRZETU
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."GET_PRODUCENT_SPRZETU" 
(  
  wynik OUT SYS_REFCURSOR
) AS 
BEGIN
  open wynik for
    select id_prodsprzetu, nazwa_firmy
    from Producent_sprzetu;
END GET_PRODUCENT_SPRZETU;

/
--------------------------------------------------------
--  DDL for Procedure GET_REGION_GRY
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."GET_REGION_GRY" 
(  
  wynik OUT SYS_REFCURSOR
) AS 
BEGIN
  open wynik for
    select id_regiongry, region
    from Region_gry;
END GET_REGION_GRY;

/
--------------------------------------------------------
--  DDL for Procedure GET_REGION_SPRZETU
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."GET_REGION_SPRZETU" 
(  
  wynik OUT SYS_REFCURSOR
) AS 
BEGIN
  open wynik for
    select id_regionsprzetu, region
    from Region_sprzetu;
END GET_REGION_SPRZETU;

/
--------------------------------------------------------
--  DDL for Procedure GET_RODZAJ_SPRZETU
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."GET_RODZAJ_SPRZETU" 
(  
  wynik OUT SYS_REFCURSOR
) AS 
BEGIN
  open wynik for
    select id_rodzajsprzetu, rodzaj
    from Rodzaj_sprzetu;
END GET_RODZAJ_SPRZETU;

/
--------------------------------------------------------
--  DDL for Procedure GET_SPRZET
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."GET_SPRZET" 
(  
  wynik OUT SYS_REFCURSOR
) AS 
BEGIN
  open wynik for
    select s.id_sprzet, rs.id_regionsprzetu, rs.region, ps.id_prodsprzetu, ps.nazwa_firmy, r.id_rodzajsprzetu, r.rodzaj, s.nazwa, s.cena, s.specyfikacja, s.generacja, s.rok_poczatku_produkcji, s.rok_zakonczenia_produkcji
    from Sprzet s, Region_sprzetu rs, Producent_sprzetu ps, Rodzaj_sprzetu r
    where s.id_regionsprzetu = rs.id_regionsprzetu and s.id_prodsprzetu = ps.id_prodsprzetu and s.id_rodzajsprzetu = r.id_rodzajsprzetu;
END GET_SPRZET;

/
--------------------------------------------------------
--  DDL for Procedure GET_SPRZETGRA
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."GET_SPRZETGRA" 
(  
  wynik OUT SYS_REFCURSOR
) AS 
BEGIN
  open wynik for
    select id_gry, id_sprzetu
    from Sprzetgra;
END GET_SPRZETGRA;

/
--------------------------------------------------------
--  DDL for Procedure GET_SPRZET_ID
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."GET_SPRZET_ID" 
(  
  id_sprzet IN sprzet.id_sprzet%TYPE
, wynik OUT SYS_REFCURSOR
) AS 
BEGIN
  open wynik for
    select s.id_sprzet, rs.id_regionsprzetu, rs.region, ps.id_prodsprzetu, ps.nazwa_firmy, r.id_rodzajsprzetu, r.rodzaj, s.nazwa, s.cena, s.specyfikacja, s.generacja, s.rok_poczatku_produkcji, s.rok_zakonczenia_produkcji
    from Sprzet s, Region_sprzetu rs, Producent_sprzetu ps, Rodzaj_sprzetu r
    where s.id_regionsprzetu = rs.id_regionsprzetu and s.id_prodsprzetu = ps.id_prodsprzetu and s.id_rodzajsprzetu = r.id_rodzajsprzetu and id_sprzet = id_sprzet;
END GET_SPRZET_ID;

/
--------------------------------------------------------
--  DDL for Procedure GET_SPRZET_NAZWA
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."GET_SPRZET_NAZWA" 
(  
  nazwa IN sprzet.nazwa%TYPE
, wynik OUT SYS_REFCURSOR
) AS 
BEGIN
  open wynik for
    select s.id_sprzet, rs.id_regionsprzetu, rs.region, ps.id_prodsprzetu, ps.nazwa_firmy, r.id_rodzajsprzetu, r.rodzaj, s.nazwa, s.cena, s.specyfikacja, s.generacja, s.rok_poczatku_produkcji, s.rok_zakonczenia_produkcji
    from Sprzet s, Region_sprzetu rs, Producent_sprzetu ps, Rodzaj_sprzetu r
    where s.id_regionsprzetu = rs.id_regionsprzetu and s.id_prodsprzetu = ps.id_prodsprzetu and s.id_rodzajsprzetu = r.id_rodzajsprzetu and nazwa = nazwa;
END GET_SPRZET_NAZWA;

/
--------------------------------------------------------
--  DDL for Procedure INSERT_GATUNEK
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."INSERT_GATUNEK" 
(    
  gat IN gatunek.gatunek_gry%TYPE
) AS 
BEGIN
  insert into Gatunek(
    gatunek_gry)
  values(
    gat
  );
  COMMIT;
  END insert_gatunek;

/
--------------------------------------------------------
--  DDL for Procedure INSERT_GRA
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."INSERT_GRA" 
(  
  idr IN gra.id_regiongry%TYPE
, idp IN gra.id_prodgry%TYPE  
, idg IN gra.id_gatunek%TYPE  
, naz IN gra.nazwa_gry%TYPE  
, op IN gra.opis%TYPE  
, rp IN gra.rok_produkcji%TYPE  
, cn IN gra.cena_nowej_gry%TYPE  
, cp IN gra.cena_pelna%TYPE  
, cs IN gra.cena_samej_gry%TYPE  
) AS 
BEGIN
  insert into Gra(
    id_regiongry,
    id_prodgry,
    id_gatunek,
    nazwa_gry,
    opis,
    rok_produkcji,
    cena_nowej_gry,
    cena_pelna,
    cena_samej_gry)
  values(idr, idp, idg, naz,
  op, rp, cn, cp, cs);
  COMMIT;
END INSERT_GRA;

/
--------------------------------------------------------
--  DDL for Procedure INSERT_PRODUCENT_GRY
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."INSERT_PRODUCENT_GRY" 
(    
  naz IN producent_gry.nazwa_firmy%TYPE
) AS 
BEGIN
  insert into Producent_gry(
    nazwa_firmy)
  values(
    naz
  );
  COMMIT;
END INSERT_PRODUCENT_GRY;

/
--------------------------------------------------------
--  DDL for Procedure INSERT_PRODUCENT_SPRZETU
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."INSERT_PRODUCENT_SPRZETU" 
(    
  naz IN producent_sprzetu.nazwa_firmy%TYPE
) AS 
BEGIN
  insert into Producent_sprzetu(
    nazwa_firmy)
  values(
    naz
  );
  COMMIT;
END INSERT_PRODUCENT_SPRZETU;

/
--------------------------------------------------------
--  DDL for Procedure INSERT_REGION_GRY
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."INSERT_REGION_GRY" 
(    
  reg IN region_gry.region%TYPE
) AS 
BEGIN
  insert into Region_gry(
    region)
  values(
    reg
  );
  COMMIT;
END INSERT_REGION_GRY;

/
--------------------------------------------------------
--  DDL for Procedure INSERT_REGION_SPRZETU
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."INSERT_REGION_SPRZETU" 
(    
  reg IN region_sprzetu.region%TYPE
) AS 
BEGIN
  insert into Region_sprzetu(
    region)
  values(
    reg
  );
  COMMIT;
END INSERT_REGION_SPRZETU;

/
--------------------------------------------------------
--  DDL for Procedure INSERT_RODZAJ_SPRZETU
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."INSERT_RODZAJ_SPRZETU" 
(    
  rodz IN rodzaj_sprzetu.rodzaj%TYPE
) AS 
BEGIN
  insert into Rodzaj_sprzetu(
    rodzaj)
  values(
    rodz
  );
  COMMIT;
END INSERT_RODZAJ_SPRZETU;

/
--------------------------------------------------------
--  DDL for Procedure INSERT_SPRZET
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."INSERT_SPRZET" 
(  
  idr IN sprzet.id_regionsprzetu%TYPE
, idp IN sprzet.id_prodsprzetu%TYPE  
, idro IN sprzet.id_rodzajsprzetu%TYPE  
, naz IN sprzet.nazwa%TYPE  
, ce IN sprzet.cena%TYPE  
, spec IN sprzet.specyfikacja%TYPE  
, gen IN sprzet.generacja%TYPE  
, rp IN sprzet.rok_poczatku_produkcji%TYPE  
, rk IN sprzet.rok_zakonczenia_produkcji%TYPE  
) AS 
BEGIN
  insert into Sprzet(
    id_regionsprzetu,
    id_prodsprzetu,
    id_rodzajsprzetu,
    nazwa,
    cena,
    specyfikacja,
    generacja,
    rok_poczatku_produkcji,
    rok_zakonczenia_produkcji)
  values(idr, idp, idro, naz,
  ce, spec, gen, rp, rk);
  COMMIT;
END INSERT_SPRZET;

/
--------------------------------------------------------
--  DDL for Procedure INSERT_SPRZETGRA
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."INSERT_SPRZETGRA" 
(    
  idg IN sprzetgra.id_gry%TYPE
, ids IN sprzetgra.id_sprzetu%TYPE
) AS 
BEGIN
  insert into Sprzetgra(
    id_gry,
    id_sprzetu)
  values(
    idg,
    ids
  );
  COMMIT;
END INSERT_SPRZETGRA;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_GATUNEK
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."UPDATE_GATUNEK" 
(  
  gat IN gatunek.gatunek_gry%TYPE
, gat2 IN gatunek.gatunek_gry%TYPE
) AS 
BEGIN
  update Gatunek set
  gatunek_gry = gat2
  where gatunek_gry = gat;
  COMMIT;
END UPDATE_GATUNEK;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_GRA
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."UPDATE_GRA" 
(  
  idgr IN gra.id_gra%TYPE
, idr IN gra.id_regiongry%TYPE
, idp IN gra.id_prodgry%TYPE  
, idg IN gra.id_gatunek%TYPE  
, naz IN gra.nazwa_gry%TYPE  
, op IN gra.opis%TYPE  
, rp IN gra.rok_produkcji%TYPE  
, cn IN gra.cena_nowej_gry%TYPE  
, cp IN gra.cena_pelna%TYPE  
, cs IN gra.cena_samej_gry%TYPE  
) AS 
BEGIN
  update Gra set
  id_regiongry = idr,
  id_prodgry = idp,
  id_gatunek = idg,
  nazwa_gry = naz,
  opis = op,
  rok_produkcji = rp,
  cena_nowej_gry = cn,
  cena_pelna = cp,
  cena_samej_gry = cs
  where id_gra = idgr;
  COMMIT;
END UPDATE_GRA;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_PRODUCENT_GRY
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."UPDATE_PRODUCENT_GRY" 
(  
  naz IN producent_gry.nazwa_firmy%TYPE
, naz2 IN producent_gry.nazwa_firmy%TYPE
) AS 
BEGIN
  update Producent_gry set
  nazwa_firmy = naz2
  where nazwa_firmy = naz;
  COMMIT;
END UPDATE_PRODUCENT_GRY;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_PRODUCENT_SPRZETU
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."UPDATE_PRODUCENT_SPRZETU" 
(  
  naz IN producent_sprzetu.nazwa_firmy%TYPE
, naz2 IN producent_sprzetu.nazwa_firmy%TYPE
) AS 
BEGIN
  update Producent_sprzetu set
  nazwa_firmy = naz2
  where nazwa_firmy = naz;
  COMMIT;
END UPDATE_PRODUCENT_SPRZETU;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_REGION_GRY
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."UPDATE_REGION_GRY" 
(  
  reg IN region_gry.region%TYPE
, reg2 IN region_gry.region%TYPE
) AS 
BEGIN
  update Region_gry set
  region = reg2
  where region = reg;
  COMMIT;
END UPDATE_REGION_GRY;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_REGION_SPRZETU
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."UPDATE_REGION_SPRZETU" 
(  
  reg IN region_sprzetu.region%TYPE
, reg2 IN region_sprzetu.region%TYPE
) AS 
BEGIN
  update Region_sprzetu set
  region = reg2
  where region = reg;
  COMMIT;
END UPDATE_REGION_SPRZETU;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_RODZAJ_SPRZETU
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."UPDATE_RODZAJ_SPRZETU" 
(  
  rodz IN rodzaj_sprzetu.rodzaj%TYPE
, rodz2 IN rodzaj_sprzetu.rodzaj%TYPE
) AS 
BEGIN
  update Rodzaj_sprzetu set
  rodzaj = rodz2
  where rodzaj = rodz;
  COMMIT;
END UPDATE_RODZAJ_SPRZETU;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_SPRZET
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."UPDATE_SPRZET" 
(  
  ids IN sprzet.id_sprzet%TYPE
, idr IN sprzet.id_regionsprzetu%TYPE
, idp IN sprzet.id_prodsprzetu%TYPE  
, idro IN sprzet.id_rodzajsprzetu%TYPE  
, naz IN sprzet.nazwa%TYPE  
, ce IN sprzet.cena%TYPE  
, spec IN sprzet.specyfikacja%TYPE  
, gen IN sprzet.generacja%TYPE  
, rp IN sprzet.rok_poczatku_produkcji%TYPE  
, rk IN sprzet.rok_zakonczenia_produkcji%TYPE  
) AS 
BEGIN
  update Sprzet set
  id_regionsprzetu = idr,
  id_prodsprzetu = idp,
  id_rodzajsprzetu = idro,
  nazwa = naz,
  cena = ce,
  specyfikacja = spec,
  generacja = gen,
  rok_poczatku_produkcji = rp,
  rok_zakonczenia_produkcji = rk
  where id_sprzet = ids;
  COMMIT;
END UPDATE_SPRZET;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_SPRZETGRA
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."UPDATE_SPRZETGRA" 
(  
  idg IN sprzetgra.id_gry%TYPE
, ids IN sprzetgra.id_sprzetu%TYPE
) AS 
BEGIN
  update Sprzetgra set
  id_sprzetu = ids
  where id_gry = idg;
  COMMIT;
END UPDATE_SPRZETGRA;

/
--------------------------------------------------------
--  DDL for Procedure UPDATE_SPRZETGRA2
--------------------------------------------------------
set define off;

  CREATE OR REPLACE EDITIONABLE PROCEDURE "STUDENT"."UPDATE_SPRZETGRA2" 
(  
  idg IN sprzetgra.id_gry%TYPE
, ids IN sprzetgra.id_sprzetu%TYPE
) AS 
BEGIN
  update Sprzetgra set
  id_gry = idg
  where id_sprzetu = ids;
  COMMIT;
END UPDATE_SPRZETGRA2;

/
