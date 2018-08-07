/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entidades;

import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author DUALPC
 */
@Entity
@Table(name = "motivo")
@NamedQuery(name = "Motivo.findAll", query = "SELECT m FROM Motivo m")

public class Motivo{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "motivoid")
    private Integer motivoid;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "motivoid")
    private List<Motivoconsultamedica> motivoconsultamedicaList;

    public Motivo() {
    }

    public Motivo(Integer motivoid) {
        this.motivoid = motivoid;
    }

    public Integer getMotivoid() {
        return motivoid;
    }

    public void setMotivoid(Integer motivoid) {
        this.motivoid = motivoid;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Motivoconsultamedica> getMotivoconsultamedicaList() {
        return motivoconsultamedicaList;
    }

    public void setMotivoconsultamedicaList(List<Motivoconsultamedica> motivoconsultamedicaList) {
        this.motivoconsultamedicaList = motivoconsultamedicaList;
    }

    @Override
    public String toString() {
        return "Motivo{" + "motivoid=" + motivoid + ", descripcion=" + descripcion 
                + ", motivoconsultamedicaList=" + motivoconsultamedicaList + '}';
    }

   
    
}
