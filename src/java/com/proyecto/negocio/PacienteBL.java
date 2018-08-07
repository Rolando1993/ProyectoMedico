/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.negocio;

import com.proyecto.dao.IPacienteDao;
import com.proyecto.dao.PacienteDao;
import com.proyecto.entidades.Pacientes;
import java.util.List;

/**
 *
 * @author DUALPC
 */
public class PacienteBL implements IPacienteBL{

    IPacienteDao pacienteDao = new PacienteDao();
    
    @Override
    public void save(Pacientes p) {
        this.pacienteDao.insertar(p);
    }

    @Override
    public void update(Pacientes p) {
        this.pacienteDao.actualizar(p);
    }

    @Override
    public void delete(Pacientes p) {
        this.pacienteDao.eliminar(p);
    }

    @Override
    public List<Pacientes> consultarPaciente() {
        return this.pacienteDao.getListaPacientes();
    }
    
}
