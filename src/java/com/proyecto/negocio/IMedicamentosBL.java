/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.negocio;

import com.proyecto.entidades.Medicamentos;
import java.util.List;

/**
 *
 * @author Bienvenido
 */
public interface IMedicamentosBL {
    void save(Medicamentos m);
    void update(Medicamentos m);
    void delete(Medicamentos m);
    List<Medicamentos> consultarMedicamentos();
}
