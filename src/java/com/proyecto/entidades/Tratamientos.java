/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entidades;

import java.math.BigInteger;
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
@Table(name = "tratamientos")
@NamedQuery(name = "Tratamientos.findAll", query = "SELECT t FROM Tratamientos t")

public class Tratamientos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "tratamientoid")
    private Integer tratamientoid;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @Column(name = "costo")
    private BigInteger costo;
    
    @OneToMany(mappedBy = "tratamientoid")
    private List<Consultamedica> consultamedicaList;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "tratamientoid")
    private List<Medicamentostratamientos> medicamentostratamientosList;

    public Tratamientos() {
    }

    public Tratamientos(Integer tratamientoid) {
        this.tratamientoid = tratamientoid;
    }

    public Integer getTratamientoid() {
        return tratamientoid;
    }

    public void setTratamientoid(Integer tratamientoid) {
        this.tratamientoid = tratamientoid;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigInteger getCosto() {
        return costo;
    }

    public void setCosto(BigInteger costo) {
        this.costo = costo;
    }

    public List<Consultamedica> getConsultamedicaList() {
        return consultamedicaList;
    }

    public void setConsultamedicaList(List<Consultamedica> consultamedicaList) {
        this.consultamedicaList = consultamedicaList;
    }

    public List<Medicamentostratamientos> getMedicamentostratamientosList() {
        return medicamentostratamientosList;
    }

    public void setMedicamentostratamientosList(List<Medicamentostratamientos> medicamentostratamientosList) {
        this.medicamentostratamientosList = medicamentostratamientosList;
    }

    @Override
    public String toString() {
        return "Tratamientos{" + "tratamientoid=" + tratamientoid + ", descripcion=" 
                + descripcion + ", costo=" + costo + ", consultamedicaList=" + consultamedicaList
                + ", medicamentostratamientosList=" + medicamentostratamientosList + '}';
    }

    
}
