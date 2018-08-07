/* ---------------------------------------------------------------------- */
/* Script generated with: DeZign for Databases v6.2.1                     */
/* Target DBMS:           PostgreSQL 8.3                                  */
/* Project file:          MERMedico.dez                                   */
/* Project name:                                                          */
/* Author:                                                                */
/* Script type:           Database drop script                            */
/* Created on:            2018-07-21 10:07                                */
/* ---------------------------------------------------------------------- */


/* ---------------------------------------------------------------------- */
/* Drop foreign key constraints                                           */
/* ---------------------------------------------------------------------- */

ALTER TABLE FichaMedica DROP CONSTRAINT Pacientes_FichaMedica;

ALTER TABLE FichaMedica DROP CONSTRAINT CentroMedico_FichaMedica;

ALTER TABLE FichaMedica DROP CONSTRAINT SignosVitales_FichaMedica;

ALTER TABLE AntecedenteMedicoFichaMedica DROP CONSTRAINT AntecedenteMedico_AntecedenteMedico_FichaMedica;

ALTER TABLE AntecedenteMedicoFichaMedica DROP CONSTRAINT FichaMedica_AntecedenteMedico_FichaMedica;

ALTER TABLE MedicamentosTratamientos DROP CONSTRAINT Medicamentos_Medicamentos_Tratamientos;

ALTER TABLE MedicamentosTratamientos DROP CONSTRAINT Tratamientos_Medicamentos_Tratamientos;

ALTER TABLE ConsultaMedica DROP CONSTRAINT Doctores_ConsultaMedica;

ALTER TABLE ConsultaMedica DROP CONSTRAINT Tratamientos_ConsultaMedica;

ALTER TABLE MotivoConsultaMedica DROP CONSTRAINT Motivo_Motivo_ConsultaMedica;

ALTER TABLE MotivoConsultaMedica DROP CONSTRAINT ConsultaMedica_Motivo_ConsultaMedica;

ALTER TABLE HistoriaClinica DROP CONSTRAINT FichaMedica_HistoriaClinica;

ALTER TABLE HistoriaClinica DROP CONSTRAINT ConsultaMedica_HistoriaClinica;

/* ---------------------------------------------------------------------- */
/* Drop table "HistoriaClinica"                                           */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE HistoriaClinica DROP CONSTRAINT PK_HistoriaClinica;

/* Drop table */

DROP TABLE HistoriaClinica;

/* ---------------------------------------------------------------------- */
/* Drop table "AntecedenteMedicoFichaMedica"                              */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE AntecedenteMedicoFichaMedica DROP CONSTRAINT PK_AntecedenteMedico_FichaMedica;

/* Drop table */

DROP TABLE AntecedenteMedicoFichaMedica;

/* ---------------------------------------------------------------------- */
/* Drop table "FichaMedica"                                               */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE FichaMedica DROP CONSTRAINT PK_FichaMedica;

/* Drop table */

DROP TABLE FichaMedica;

/* ---------------------------------------------------------------------- */
/* Drop table "SignosVitales"                                             */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE SignosVitales DROP CONSTRAINT PK_SignosVitales;

/* Drop table */

DROP TABLE SignosVitales;

/* ---------------------------------------------------------------------- */
/* Drop table "MotivoConsultaMedica"                                      */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE MotivoConsultaMedica DROP CONSTRAINT PK_Motivo_ConsultaMedica;

/* Drop table */

DROP TABLE MotivoConsultaMedica;

/* ---------------------------------------------------------------------- */
/* Drop table "ConsultaMedica"                                            */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE ConsultaMedica DROP CONSTRAINT PK_ConsultaMedica;

/* Drop table */

DROP TABLE ConsultaMedica;

/* ---------------------------------------------------------------------- */
/* Drop table "Motivo"                                                    */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE Motivo DROP CONSTRAINT PK_Motivo;

/* Drop table */

DROP TABLE Motivo;

/* ---------------------------------------------------------------------- */
/* Drop table "MedicamentosTratamientos"                                  */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE MedicamentosTratamientos DROP CONSTRAINT PK_Medicamentos_Tratamientos;

/* Drop table */

DROP TABLE MedicamentosTratamientos;

/* ---------------------------------------------------------------------- */
/* Drop table "Medicamentos"                                              */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE Medicamentos DROP CONSTRAINT PK_Medicamentos;

/* Drop table */

DROP TABLE Medicamentos;

/* ---------------------------------------------------------------------- */
/* Drop table "Tratamientos"                                              */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE Tratamientos DROP CONSTRAINT PK_Tratamientos;

/* Drop table */

DROP TABLE Tratamientos;

/* ---------------------------------------------------------------------- */
/* Drop table "Doctores"                                                  */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE Doctores DROP CONSTRAINT PK_Doctores;

/* Drop table */

DROP TABLE Doctores;

/* ---------------------------------------------------------------------- */
/* Drop table "AntecedenteMedico"                                         */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE AntecedenteMedico DROP CONSTRAINT PK_AntecedenteMedico;

/* Drop table */

DROP TABLE AntecedenteMedico;

/* ---------------------------------------------------------------------- */
/* Drop table "ConsultorioMedico"                                         */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE ConsultorioMedico DROP CONSTRAINT PK_CentroMedico;

/* Drop table */

DROP TABLE ConsultorioMedico;

/* ---------------------------------------------------------------------- */
/* Drop table "Pacientes"                                                 */
/* ---------------------------------------------------------------------- */

/* Drop constraints */

ALTER TABLE Pacientes DROP CONSTRAINT PK_Pacientes;

/* Drop table */

DROP TABLE Pacientes;
