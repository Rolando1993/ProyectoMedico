/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.negocio;

import com.proyecto.entidades.Doctores;
import java.util.List;

/**
 *
 * @author Bienvenido
 */
public interface IDoctoresBL {
    
    void save(Doctores d);
    void update(Doctores d);
    void delete(Doctores d);
    
    List<Doctores>consultarDoctores(); 
    
}
