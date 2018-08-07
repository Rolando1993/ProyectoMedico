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
@Table(name = "medicamentostratamientos")
@NamedQuery(name = "Medicamentostratamientos.findAll", query = "SELECT m FROM Medicamentostratamientos m")

public class Medicamentostratamientos{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "medicina_tratamiento")
    private Integer medicinaTratamiento;
    
    @JoinColumn(name = "medicamentoid", referencedColumnName = "medicamentoid")
    @ManyToOne(optional = false)
    private Medicamentos medicamentoid;
    
    @JoinColumn(name = "tratamientoid", referencedColumnName = "tratamientoid")
    @ManyToOne(optional = false)
    private Tratamientos tratamientoid;

    public Medicamentostratamientos() {
    }

    public Medicamentostratamientos(Integer medicinaTratamiento) {
        this.medicinaTratamiento = medicinaTratamiento;
    }

    public Integer getMedicinaTratamiento() {
        return medicinaTratamiento;
    }

    public void setMedicinaTratamiento(Integer medicinaTratamiento) {
        this.medicinaTratamiento = medicinaTratamiento;
    }

    public Medicamentos getMedicamentoid() {
        return medicamentoid;
    }

    public void setMedicamentoid(Medicamentos medicamentoid) {
        this.medicamentoid = medicamentoid;
    }

    public Tratamientos getTratamientoid() {
        return tratamientoid;
    }

    public void setTratamientoid(Tratamientos tratamientoid) {
        this.tratamientoid = tratamientoid;
    }

    @Override
    public String toString() {
        return "Medicamentostratamientos{" + "medicinaTratamiento=" + medicinaTratamiento 
                + ", medicamentoid=" + medicamentoid + ", tratamientoid=" + tratamientoid + '}';
    }

   
}
