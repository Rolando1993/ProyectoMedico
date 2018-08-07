/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bean;

import com.proyecto.entidades.Pacientes;
import com.proyecto.negocio.IPacienteBL;
import com.proyecto.negocio.PacienteBL;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author DUALPC
 */
@ManagedBean
@ViewScoped
public class PacienteMB {

    private Pacientes paciente = new Pacientes();
    private List<Pacientes> listaPacientes;
    IPacienteBL pacienteBL = new PacienteBL();
    
    public PacienteMB() {
        paciente = new Pacientes();
    }

    public Pacientes getPaciente() {
        return paciente;
    }

    public void setPaciente(Pacientes paciente) {
        this.paciente = paciente;
    }

    public List<Pacientes> getListaPacientes() {
        listaPacientes = pacienteBL.consultarPaciente();
        return listaPacientes;
    }

    public void setListaPacientes(List<Pacientes> listaPacientes) {
        this.listaPacientes = listaPacientes;
    }
    
    public void prepararNuevoPaciente(){
        this.paciente = new Pacientes();
    }
    
    public void persist(){
        pacienteBL.save(paciente);
    }
    
    public void merge(){
        pacienteBL.update(paciente);
    }
     
    public void remove(){
        pacienteBL.delete(paciente);
    }
    
}
