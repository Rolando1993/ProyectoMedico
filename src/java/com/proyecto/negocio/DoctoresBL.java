/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.negocio;

import com.proyecto.dao.DoctoresDao;
import com.proyecto.dao.IDoctoresDao;
import com.proyecto.entidades.Doctores;
import java.util.List;

/**
 *
 * @author Bienvenido
 */
public class DoctoresBL implements IDoctoresBL {

    IDoctoresDao doctoresdao = new DoctoresDao();

    @Override
    public void save(Doctores d) {
        this.doctoresdao.insertar(d);
    }

    @Override
    public void update(Doctores d) {
        this.doctoresdao.actualizar(d);
    }

    @Override
    public void delete(Doctores d) {
        this.doctoresdao.eliminar(d);
    }

    @Override
    public List<Doctores> consultarDoctores() {
        return this.doctoresdao.getListDoctores();
    }

}
