/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import com.proyecto.entidades.Pacientes;
import java.util.List;

/**
 *
 * @author DUALPC
 */
public interface IPacienteDao {
    
    void insertar(Pacientes p);
    void actualizar(Pacientes p);
    void eliminar(Pacientes p);
    List<Pacientes> getListaPacientes();
    
}
