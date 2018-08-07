/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entidades;

import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DUALPC
 */
@Entity
@Table(name = "consultamedica")
@NamedQuery(name = "Consultamedica.findAll", query = "SELECT c FROM Consultamedica c")

public class Consultamedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "consultaid")
    private Integer consultaid;
    
    @Column(name = "fechaconsulta")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechaconsulta;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "consultaid")
    private List<Motivoconsultamedica> motivoconsultamedicaList;
    
    @JoinColumn(name = "doctorid", referencedColumnName = "doctorid")
    @ManyToOne(optional = false)
    private Doctores doctorid;
    
    @JoinColumn(name = "tratamientoid", referencedColumnName = "tratamientoid")
    @ManyToOne
    private Tratamientos tratamientoid;
    
    @OneToMany(mappedBy = "consultaid")
    private List<Historiaclinica> historiaclinicaList;

    public Consultamedica() {
    }

    public Consultamedica(Integer consultaid) {
        this.consultaid = consultaid;
    }

    public Integer getConsultaid() {
        return consultaid;
    }

    public void setConsultaid(Integer consultaid) {
        this.consultaid = consultaid;
    }

    public Date getFechaconsulta() {
        return fechaconsulta;
    }

    public void setFechaconsulta(Date fechaconsulta) {
        this.fechaconsulta = fechaconsulta;
    }

    public List<Motivoconsultamedica> getMotivoconsultamedicaList() {
        return motivoconsultamedicaList;
    }

    public void setMotivoconsultamedicaList(List<Motivoconsultamedica> motivoconsultamedicaList) {
        this.motivoconsultamedicaList = motivoconsultamedicaList;
    }

    public Doctores getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Doctores doctorid) {
        this.doctorid = doctorid;
    }

    public Tratamientos getTratamientoid() {
        return tratamientoid;
    }

    public void setTratamientoid(Tratamientos tratamientoid) {
        this.tratamientoid = tratamientoid;
    }

    public List<Historiaclinica> getHistoriaclinicaList() {
        return historiaclinicaList;
    }

    public void setHistoriaclinicaList(List<Historiaclinica> historiaclinicaList) {
        this.historiaclinicaList = historiaclinicaList;
    }

    @Override
    public String toString() {
        return "Consultamedica{" + "consultaid=" + consultaid + ", fechaconsulta=" + fechaconsulta 
                + ", motivoconsultamedicaList=" + motivoconsultamedicaList + ", doctorid=" + doctorid 
                + ", tratamientoid=" + tratamientoid + ", historiaclinicaList=" + historiaclinicaList + '}';
    }

    
    
}
