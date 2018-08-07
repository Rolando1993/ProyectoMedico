/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.entidades;

import java.math.BigInteger;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "fichamedica")
@NamedQuery(name = "Fichamedica.findAll", query = "SELECT f FROM Fichamedica f")

public class Fichamedica  {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "fichamedica")
    private Integer fichamedica;
    
    @Column(name = "fecharegistro")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecharegistro;
    
    @Column(name = "costo")
    private BigInteger costo;
    
    @Column(name = "abono")
    private BigInteger abono;
    
    @Column(name = "total")
    private BigInteger total;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "fichamedica")
    private List<Antecedentemedicofichamedica> antecedentemedicofichamedicaList;
    
    @OneToMany(mappedBy = "fichamedica")
    private List<Historiaclinica> historiaclinicaList;
    
    @JoinColumn(name = "centromedicoid", referencedColumnName = "consultorioid")
    @ManyToOne
    private Consultoriomedico centromedicoid;
    
    @JoinColumn(name = "pacienteid", referencedColumnName = "pacienteid")
    @ManyToOne(optional = false)
    private Pacientes pacienteid;
    
    @JoinColumn(name = "signosvitales", referencedColumnName = "signosvitales")
    @ManyToOne
    private Signosvitales signosvitales;

    public Fichamedica() {
    }

    public Fichamedica(Integer fichamedica) {
        this.fichamedica = fichamedica;
    }

    public Integer getFichamedica() {
        return fichamedica;
    }

    public void setFichamedica(Integer fichamedica) {
        this.fichamedica = fichamedica;
    }

    public Date getFecharegistro() {
        return fecharegistro;
    }

    public void setFecharegistro(Date fecharegistro) {
        this.fecharegistro = fecharegistro;
    }

    public BigInteger getCosto() {
        return costo;
    }

    public void setCosto(BigInteger costo) {
        this.costo = costo;
    }

    public BigInteger getAbono() {
        return abono;
    }

    public void setAbono(BigInteger abono) {
        this.abono = abono;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
    }
    
    public List<Antecedentemedicofichamedica> getAntecedentemedicofichamedicaList() {
        return antecedentemedicofichamedicaList;
    }

    public void setAntecedentemedicofichamedicaList(List<Antecedentemedicofichamedica> antecedentemedicofichamedicaList) {
        this.antecedentemedicofichamedicaList = antecedentemedicofichamedicaList;
    }

    public List<Historiaclinica> getHistoriaclinicaList() {
        return historiaclinicaList;
    }

    public void setHistoriaclinicaList(List<Historiaclinica> historiaclinicaList) {
        this.historiaclinicaList = historiaclinicaList;
    }

    public Consultoriomedico getCentromedicoid() {
        return centromedicoid;
    }

    public void setCentromedicoid(Consultoriomedico centromedicoid) {
        this.centromedicoid = centromedicoid;
    }

    public Pacientes getPacienteid() {
        return pacienteid;
    }

    public void setPacienteid(Pacientes pacienteid) {
        this.pacienteid = pacienteid;
    }

    public Signosvitales getSignosvitales() {
        return signosvitales;
    }

    public void setSignosvitales(Signosvitales signosvitales) {
        this.signosvitales = signosvitales;
    }

    @Override
    public String toString() {
        return "Fichamedica{" + "fichamedica=" + fichamedica + ", fecharegistro=" + fecharegistro 
                + ", costo=" + costo + ", abono=" + abono + ", total=" + total 
                + ", antecedentemedicofichamedicaList=" + antecedentemedicofichamedicaList 
                + ", historiaclinicaList=" + historiaclinicaList + ", centromedicoid=" 
                + centromedicoid + ", pacienteid=" + pacienteid + ", signosvitales=" + signosvitales + '}';
    }

    
}
