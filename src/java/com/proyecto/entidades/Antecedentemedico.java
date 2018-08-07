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
@Table(name = "antecedentemedico")
@NamedQuery(name = "Antecedentemedico.findAll", query = "SELECT a FROM Antecedentemedico a")
 
public class Antecedentemedico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "antecedentemedicoid")
    private Integer antecedentemedicoid;
    
    @Column(name = "nombreantecedente")
    private String nombreantecedente;
    
    @Column(name = "descripcion")
    private String descripcion;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "antecedentemedicoid")
    private List<Antecedentemedicofichamedica> antecedentemedicofichamedicaList;

    public Antecedentemedico() {
    }

    public Antecedentemedico(Integer antecedentemedicoid) {
        this.antecedentemedicoid = antecedentemedicoid;
    }

    public Integer getAntecedentemedicoid() {
        return antecedentemedicoid;
    }

    public void setAntecedentemedicoid(Integer antecedentemedicoid) {
        this.antecedentemedicoid = antecedentemedicoid;
    }

    public String getNombreantecedente() {
        return nombreantecedente;
    }

    public void setNombreantecedente(String nombreantecedente) {
        this.nombreantecedente = nombreantecedente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Antecedentemedicofichamedica> getAntecedentemedicofichamedicaList() {
        return antecedentemedicofichamedicaList;
    }

    public void setAntecedentemedicofichamedicaList(List<Antecedentemedicofichamedica> antecedentemedicofichamedicaList) {
        this.antecedentemedicofichamedicaList = antecedentemedicofichamedicaList;
    }

    @Override
    public String toString() {
        return "Antecedentemedico{" + "antecedentemedicoid=" + antecedentemedicoid 
                + ", nombreantecedente=" + nombreantecedente + ", descripcion=" + descripcion 
                + ", antecedentemedicofichamedicaList=" + antecedentemedicofichamedicaList + '}';
    }

   
    
}
