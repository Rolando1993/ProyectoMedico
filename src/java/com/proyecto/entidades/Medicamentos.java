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
@Table(name = "medicamentos")
@NamedQuery(name = "consultarMedicamentos", query = "SELECT m FROM Medicamentos m")

public class Medicamentos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "medicamentoid")
    private Integer medicamentoid;
    
    @Column(name = "nombremedicina")
    private String nombremedicina;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "medicamentoid")
    private List<Medicamentostratamientos> medicamentostratamientosList;

    public Medicamentos() {
    }

    public Medicamentos(Integer medicamentoid) {
        this.medicamentoid = medicamentoid;
    }

    public Integer getMedicamentoid() {
        return medicamentoid;
    }

    public void setMedicamentoid(Integer medicamentoid) {
        this.medicamentoid = medicamentoid;
    }

    public String getNombremedicina() {
        return nombremedicina;
    }

    public void setNombremedicina(String nombremedicina) {
        this.nombremedicina = nombremedicina;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Medicamentostratamientos> getMedicamentostratamientosList() {
        return medicamentostratamientosList;
    }

    public void setMedicamentostratamientosList(List<Medicamentostratamientos> medicamentostratamientosList) {
        this.medicamentostratamientosList = medicamentostratamientosList;
    }

    @Override
    public String toString() {
        return "Medicamentos{" + "medicamentoid=" + medicamentoid + ", nombremedicina=" 
                + nombremedicina + ", descripcion=" + descripcion + ", medicamentostratamientosList=" 
                + medicamentostratamientosList + '}';
    }

    
}
