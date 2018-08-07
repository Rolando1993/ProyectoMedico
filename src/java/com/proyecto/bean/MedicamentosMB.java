/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.bean;

import com.proyecto.dao.IMedicamentosDao;
import com.proyecto.entidades.Medicamentos;
import com.proyecto.negocio.IMedicamentosBL;
import com.proyecto.negocio.MedicamentosBL;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Bienvenido
 */
@ManagedBean
@ViewScoped
public class MedicamentosMB {

    private Medicamentos medicamento = new Medicamentos();
    private List<Medicamentos> listaMedicamentos;
    IMedicamentosBL medicamentoBL = new MedicamentosBL();

    public MedicamentosMB() {
        medicamento = new Medicamentos();

    }

    public Medicamentos getMedicamento() {
        return medicamento;
    }

    public void setMedicamento(Medicamentos medicamento) {
        this.medicamento = medicamento;
    }

    public List<Medicamentos> getListaMedicamentos() {
        listaMedicamentos = medicamentoBL.consultarMedicamentos();
        return listaMedicamentos;
    }

    public void setListaMedicamentos(List<Medicamentos> listaMedicamentos) {
        this.listaMedicamentos = listaMedicamentos;
    }

    public void prepararNuevoMedicamento() {
        this.medicamento = new Medicamentos();
    }

    public void persist() {
        medicamentoBL.save(medicamento);
    }

    public void merge() {
        medicamentoBL.update(medicamento);
    }

    public void remove() {
        medicamentoBL.delete(medicamento);
    }

}
