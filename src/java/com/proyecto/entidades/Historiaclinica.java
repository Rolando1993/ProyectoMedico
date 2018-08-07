/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entidades;

import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DUALPC
 */
@Entity
@Table(name = "historiaclinica")
@NamedQuery(name = "Historiaclinica.findAll", query = "SELECT h FROM Historiaclinica h")

public class Historiaclinica  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "historiaid")
    private Integer historiaid;
    
    @Column(name = "fechainicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechainicio;
    
    @Column(name = "fechafinal")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechafinal;
    
    @JoinColumn(name = "consultaid", referencedColumnName = "consultaid")
    @ManyToOne
    private Consultamedica consultaid;
    
    @JoinColumn(name = "fichamedica", referencedColumnName = "fichamedica")
    @ManyToOne
    private Fichamedica fichamedica;

    public Historiaclinica() {
    }

    public Historiaclinica(Integer historiaid) {
        this.historiaid = historiaid;
    }

    public Integer getHistoriaid() {
        return historiaid;
    }

    public void setHistoriaid(Integer historiaid) {
        this.historiaid = historiaid;
    }

    public Date getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(Date fechainicio) {
        this.fechainicio = fechainicio;
    }

    public Date getFechafinal() {
        return fechafinal;
    }

    public void setFechafinal(Date fechafinal) {
        this.fechafinal = fechafinal;
    }

    public Consultamedica getConsultaid() {
        return consultaid;
    }

    public void setConsultaid(Consultamedica consultaid) {
        this.consultaid = consultaid;
    }

    public Fichamedica getFichamedica() {
        return fichamedica;
    }

    public void setFichamedica(Fichamedica fichamedica) {
        this.fichamedica = fichamedica;
    }

    @Override
    public String toString() {
        return "Historiaclinica{" + "historiaid=" + historiaid + ", fechainicio=" + fechainicio 
                + ", fechafinal=" + fechafinal + ", consultaid=" + consultaid + ", fichamedica=" 
                + fichamedica + '}';
    }

   
}
