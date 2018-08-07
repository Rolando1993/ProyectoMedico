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
@Table(name = "doctores")
@NamedQuery(name = "Doctores.findAll", query = "SELECT d FROM Doctores d")

public class Doctores  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "doctorid")
    private Integer doctorid;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "apellido")
    private String apellido;
    
    @Column(name = "correo")
    private String correo;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "cedula")
    private String cedula;
    
    @Column(name = "especialidad")
    private String especialidad;
    
    @Column(name = "aniosexperiencia")
    private Integer aniosexperiencia;
    
    @Column(name = "sexo")
    private String sexo;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "doctorid")
    private List<Consultamedica> consultamedicaList;

    public Doctores() {
    }

    public Doctores(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public Integer getDoctorid() {
        return doctorid;
    }

    public void setDoctorid(Integer doctorid) {
        this.doctorid = doctorid;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public Integer getAniosexperiencia() {
        return aniosexperiencia;
    }

    public void setAniosexperiencia(Integer aniosexperiencia) {
        this.aniosexperiencia = aniosexperiencia;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public List<Consultamedica> getConsultamedicaList() {
        return consultamedicaList;
    }

    public void setConsultamedicaList(List<Consultamedica> consultamedicaList) {
        this.consultamedicaList = consultamedicaList;
    }

    @Override
    public String toString() {
        return "Doctores{" + "doctorid=" + doctorid + ", nombre=" + nombre + ", apellido=" 
                + apellido + ", correo=" + correo + ", direccion=" + direccion + ", cedula=" 
                + cedula + ", especialidad=" + especialidad + ", aniosexperiencia=" 
                + aniosexperiencia + ", sexo=" + sexo + ", consultamedicaList=" + consultamedicaList + '}';
    }

    

   
}
