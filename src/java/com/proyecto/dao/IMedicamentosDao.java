/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import com.proyecto.entidades.Medicamentos;
import java.util.List;

/**
 *
 * @author Bienvenido
 */
public interface IMedicamentosDao {
    void insertar(Medicamentos m);
    void actualizar(Medicamentos m);
    void eliminar(Medicamentos m);
    List<Medicamentos> getListaMedicamentos();
    
    
}
