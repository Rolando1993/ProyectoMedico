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
@Table(name = "antecedentemedicofichamedica")
@NamedQuery(name = "Antecedentemedicofichamedica.findAll", query = "SELECT a FROM Antecedentemedicofichamedica a")

public class Antecedentemedicofichamedica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "antecedentefichamedica")
    private Integer antecedentefichamedica;
    
    @JoinColumn(name = "antecedentemedicoid", referencedColumnName = "antecedentemedicoid")
    @ManyToOne(optional = false)
    private Antecedentemedico antecedentemedicoid;
    
    @JoinColumn(name = "fichamedica", referencedColumnName = "fichamedica")
    @ManyToOne(optional = false)
    private Fichamedica fichamedica;

    public Antecedentemedicofichamedica() {
    }

    public Antecedentemedicofichamedica(Integer antecedentefichamedica) {
        this.antecedentefichamedica = antecedentefichamedica;
    }

    public Integer getAntecedentefichamedica() {
        return antecedentefichamedica;
    }

    public void setAntecedentefichamedica(Integer antecedentefichamedica) {
        this.antecedentefichamedica = antecedentefichamedica;
    }

    public Antecedentemedico getAntecedentemedicoid() {
        return antecedentemedicoid;
    }

    public void setAntecedentemedicoid(Antecedentemedico antecedentemedicoid) {
        this.antecedentemedicoid = antecedentemedicoid;
    }

    public Fichamedica getFichamedica() {
        return fichamedica;
    }

    public void setFichamedica(Fichamedica fichamedica) {
        this.fichamedica = fichamedica;
    }

    @Override
    public String toString() {
        return "Antecedentemedicofichamedica{" + "antecedentefichamedica=" + antecedentefichamedica 
                + ", antecedentemedicoid=" + antecedentemedicoid + ", fichamedica=" + fichamedica + '}';
    }

    
    
}
