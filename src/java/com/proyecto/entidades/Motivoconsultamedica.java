/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entidades;

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

/**
 *
 * @author DUALPC
 */
@Entity
@Table(name = "motivoconsultamedica")
@NamedQuery(name = "Motivoconsultamedica.findAll", query = "SELECT m FROM Motivoconsultamedica m")

public class Motivoconsultamedica{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "motivo_consulta")
    private Integer motivoConsulta;
    
    @JoinColumn(name = "consultaid", referencedColumnName = "consultaid")
    @ManyToOne(optional = false)
    private Consultamedica consultaid;
    
    @JoinColumn(name = "motivoid", referencedColumnName = "motivoid")
    @ManyToOne(optional = false)
    private Motivo motivoid;

    public Motivoconsultamedica() {
    }

    public Motivoconsultamedica(Integer motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public Integer getMotivoConsulta() {
        return motivoConsulta;
    }

    public void setMotivoConsulta(Integer motivoConsulta) {
        this.motivoConsulta = motivoConsulta;
    }

    public Consultamedica getConsultaid() {
        return consultaid;
    }

    public void setConsultaid(Consultamedica consultaid) {
        this.consultaid = consultaid;
    }

    public Motivo getMotivoid() {
        return motivoid;
    }

    public void setMotivoid(Motivo motivoid) {
        this.motivoid = motivoid;
    }

    @Override
    public String toString() {
        return "Motivoconsultamedica{" + "motivoConsulta=" + motivoConsulta + ", consultaid=" 
                + consultaid + ", motivoid=" + motivoid + '}';
    }

    
    
}
