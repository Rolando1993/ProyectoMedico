/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entidades;

import java.util.List;
import javax.persistence.Basic;
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
@Table(name = "consultoriomedico")
@NamedQuery(name = "Consultoriomedico.findAll", query = "SELECT c FROM Consultoriomedico c")

public class Consultoriomedico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "consultorioid")
    private Integer consultorioid;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "telefono")
    private String telefono;
    
    @Column(name = "correo")
    private String correo;
    
    @OneToMany(mappedBy = "centromedicoid")
    private List<Fichamedica> fichamedicaList;

    public Consultoriomedico() {
    }

    public Consultoriomedico(Integer consultorioid) {
        this.consultorioid = consultorioid;
    }

    public Integer getConsultorioid() {
        return consultorioid;
    }

    public void setConsultorioid(Integer consultorioid) {
        this.consultorioid = consultorioid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Fichamedica> getFichamedicaList() {
        return fichamedicaList;
    }

    public void setFichamedicaList(List<Fichamedica> fichamedicaList) {
        this.fichamedicaList = fichamedicaList;
    }

    @Override
    public String toString() {
        return "Consultoriomedico{" + "consultorioid=" + consultorioid + ", nombre=" + nombre 
                + ", direccion=" + direccion + ", telefono=" + telefono + ", correo=" + correo 
                + ", fichamedicaList=" + fichamedicaList + '}';
    }

    
}
