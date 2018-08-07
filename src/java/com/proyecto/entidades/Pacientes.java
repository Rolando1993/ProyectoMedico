/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entidades;

import java.time.LocalDate;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author DUALPC
 */
@Entity
@Table(name = "pacientes")
@NamedQuery(name = "consultarPaciente", query = "SELECT p FROM Pacientes p")

public class Pacientes{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pacienteid")
    private Integer pacienteid;
    
    @Column(name = "cedula")
    private String cedula;
    
    @Column(name = "nombre")
    private String nombre;
    
    @Column(name = "telefono")
    private String telefono;
    
    @Column(name = "fechanacimiento")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fechanacimiento;
            
    @Column(name = "estadocivil")
    private String estadocivil;
    
    @Column(name = "direccion")
    private String direccion;
    
    @Column(name = "ocupacion")
    private String ocupacion;
    
    @Column(name = "sexo")
    private String sexo;
    
    @Column(name = "correo")
    private String correo;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "pacienteid")
    private List<Fichamedica> fichamedicaList;

    public Pacientes() {
    }

    public Pacientes(Integer pacienteid) {
        this.pacienteid = pacienteid;
    }

    public Integer getPacienteid() {
        return pacienteid;
    }

    public void setPacienteid(Integer pacienteid) {
        this.pacienteid = pacienteid;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }


    public String getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getOcupacion() {
        return ocupacion;
    }

    public void setOcupacion(String ocupacion) {
        this.ocupacion = ocupacion;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
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
        return "Pacientes{" + "pacienteid=" + pacienteid + ", cedula=" + cedula + ", nombre=" 
                + nombre + ", telefono=" + telefono + ", fechanacimiento=" + fechanacimiento 
                + ", estadocivil=" + estadocivil + ", direccion=" + direccion + ", ocupacion=" 
                + ocupacion + ", sexo=" + sexo + ", correo=" + correo + ", fichamedicaList=" 
                + fichamedicaList + '}';
    }

    
}
