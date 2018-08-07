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
@Table(name = "signosvitales")
@NamedQuery(name = "Signosvitales.findAll", query = "SELECT s FROM Signosvitales s")

public class Signosvitales{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "signosvitales")
    private Integer signosvitales;
    
    @Column(name = "masacorporal")
    private String masacorporal;
    
    @Column(name = "talla")
    private String talla;
    
    @Column(name = "peso")
    private String peso;
    
    @Column(name = "temperatura")
    private String temperatura;
    
    @Column(name = "presion")
    private String presion;
    
    @Column(name = "emergencia")
    private Boolean emergencia;
    
    @OneToMany(mappedBy = "signosvitales")
    private List<Fichamedica> fichamedicaList;

    public Signosvitales() {
    }

    public Signosvitales(Integer signosvitales) {
        this.signosvitales = signosvitales;
    }

    public Integer getSignosvitales() {
        return signosvitales;
    }

    public void setSignosvitales(Integer signosvitales) {
        this.signosvitales = signosvitales;
    }

    public String getMasacorporal() {
        return masacorporal;
    }

    public void setMasacorporal(String masacorporal) {
        this.masacorporal = masacorporal;
    }

    public String getTalla() {
        return talla;
    }

    public void setTalla(String talla) {
        this.talla = talla;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(String temperatura) {
        this.temperatura = temperatura;
    }

    public String getPresion() {
        return presion;
    }

    public void setPresion(String presion) {
        this.presion = presion;
    }

    public Boolean getEmergencia() {
        return emergencia;
    }

    public void setEmergencia(Boolean emergencia) {
        this.emergencia = emergencia;
    }

    public List<Fichamedica> getFichamedicaList() {
        return fichamedicaList;
    }

    public void setFichamedicaList(List<Fichamedica> fichamedicaList) {
        this.fichamedicaList = fichamedicaList;
    }

    @Override
    public String toString() {
        return "Signosvitales{" + "signosvitales=" + signosvitales + ", masacorporal=" 
                + masacorporal + ", talla=" + talla + ", peso=" + peso + ", temperatura=" 
                + temperatura + ", presion=" + presion + ", emergencia=" + emergencia 
                + ", fichamedicaList=" + fichamedicaList + '}';
    }

    
}
