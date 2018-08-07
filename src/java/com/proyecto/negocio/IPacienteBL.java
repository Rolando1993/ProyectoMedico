/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.negocio;

import com.proyecto.entidades.Pacientes;
import java.util.List;

/**
 *
 * @author DUALPC
 */
public interface IPacienteBL {
    
    void save(Pacientes p);
    void update(Pacientes p);
    void delete(Pacientes p);
    List<Pacientes> consultarPaciente();
}
