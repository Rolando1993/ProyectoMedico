/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import com.proyecto.entidades.Signosvitales;
import java.util.List;

/**
 *
 * @author GERMAN
 */
public interface ISignosVitalesDao {
    
    void insertar (Signosvitales sv);
    void actualizar (Signosvitales sv);
    void eliminar (Signosvitales sv);
    
    List<Signosvitales> getListaSignos();
}
