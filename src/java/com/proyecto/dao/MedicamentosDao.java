/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import com.proyecto.entidades.Medicamentos;
import com.proyecto.listener.EMF;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bienvenido
 */
public class MedicamentosDao implements IMedicamentosDao {

    @Override
    public void insertar(Medicamentos m) {
        EntityManager em = EMF.crearEntityManager();
        em.getTransaction().begin();
        em.persist(m);
        em.getTransaction().commit();

    }

    @Override
    public void actualizar(Medicamentos m) {
        EntityManager em = EMF.crearEntityManager();
        Medicamentos m1 = em.find(Medicamentos.class, m.getMedicamentoid());
        em.getTransaction().begin();
        if (em.contains(m1)) {
            em.merge(m);
        } else {
            System.out.println("No Se Pudo Actualizar Los Medicamentos......");
        }
        em.getTransaction().commit();
        em.close();

    }

    @Override
    public void eliminar(Medicamentos m) {
        EntityManager em = EMF.crearEntityManager();
        Medicamentos m1 = em.find(Medicamentos.class, m.getMedicamentoid());
        em.getTransaction().begin();
        if (em.contains(m1)) {
            em.remove(m1);
        } else {
            System.out.println("No Se Pudo Eliminar Los Medicamentos......");
        }
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Medicamentos> getListaMedicamentos() {
        List<Medicamentos> listaMedicamentos = new ArrayList<>();
        EntityManager em = EMF.crearEntityManager();
        em.getTransaction().begin();
        Query q = em.createNamedQuery("consultarMedicamentos");
        listaMedicamentos = q.getResultList();
        em.getTransaction().commit();
        em.close();
        return listaMedicamentos;
    }

}
