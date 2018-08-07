/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import com.proyecto.entidades.Pacientes;
import com.proyecto.listener.EMF;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author DUALPC
 */
public class PacienteDao implements IPacienteDao{

    @Override
    public void insertar(Pacientes p) {
        EntityManager em = EMF.crearEntityManager();
        em.getTransaction().begin();
        em.persist(p);
        em.getTransaction().commit();
    }

    @Override
    public void actualizar(Pacientes p) {
        EntityManager em = EMF.crearEntityManager();
        Pacientes p1 = em.find(Pacientes.class, p.getPacienteid());
        em.getTransaction().begin();
        if(em.contains(p1)){
            em.merge(p);
        }else{
            System.out.println("No Se Pudo Actualizar El Paciente......");
        }
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public void eliminar(Pacientes p) {
        EntityManager em = EMF.crearEntityManager();
        Pacientes p1 = em.find(Pacientes.class, p.getPacienteid());
        em.getTransaction().begin();
        if(em.contains(p1)){
            em.remove(p1);
        }else{
            System.out.println("No Se Pudo Eliminar El Paciente......");
        }
        em.getTransaction().commit();
        em.close();
    }

    @Override
    public List<Pacientes> getListaPacientes() {
        List<Pacientes> listaPaciente = new ArrayList<>();
        EntityManager em = EMF.crearEntityManager();
        em.getTransaction().begin();
        Query q = em.createNamedQuery("consultarPaciente");
        listaPaciente = q.getResultList();
        em.getTransaction().commit();
        em.close();
        return listaPaciente;
    }
    
}
