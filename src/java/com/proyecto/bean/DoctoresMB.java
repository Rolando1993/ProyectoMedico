/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bean;

import com.proyecto.entidades.Doctores;
import com.proyecto.negocio.DoctoresBL;
import com.proyecto.negocio.IDoctoresBL;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Bienvenido
 */
@ManagedBean
@ViewScoped
public class DoctoresMB {

    private Doctores doctor = new Doctores();
    private List<Doctores> listaDoctores;
    IDoctoresBL doctoresBL = new DoctoresBL();

    public DoctoresMB() {

        doctor = new Doctores();

    }

    public Doctores getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctores doctor) {
        this.doctor = doctor;
    }

    public List<Doctores> getListaDoctores() {
        listaDoctores = doctoresBL.consultarDoctores();
        return listaDoctores;
    }

    public void setListaDoctores(List<Doctores> listaDoctores) {
        this.listaDoctores = listaDoctores;
    }

    public void prepararNuevoDoctor() {
        this.doctor = new Doctores();
    }

    public void persist() {
        doctoresBL.save(doctor);
    }

    public void merge() {
        doctoresBL.update(doctor);
    }

    public void remove() {
        doctoresBL.delete(doctor);
    }

}
