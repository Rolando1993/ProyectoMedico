/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.negocio;


import com.proyecto.dao.IMedicamentosDao;
import com.proyecto.dao.MedicamentosDao;
import com.proyecto.entidades.Medicamentos;
import java.util.List;

/**
 *
 * @author Bienvenido
 */
public class MedicamentosBL implements IMedicamentosBL{

    IMedicamentosDao medicamentosDao = new MedicamentosDao();

    @Override
    public void save(Medicamentos m) {
        this.medicamentosDao.insertar(m);
    }

    @Override
    public void update(Medicamentos m) {
        this.medicamentosDao.actualizar(m);
    }

    @Override
    public void delete(Medicamentos m) {
      this.medicamentosDao.eliminar(m);
    }

    @Override
    public List<Medicamentos> consultarMedicamentos() {
        return this.medicamentosDao.getListaMedicamentos();
    }
  
}
