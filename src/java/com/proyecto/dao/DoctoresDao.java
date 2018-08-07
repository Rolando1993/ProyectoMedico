/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import com.proyecto.entidades.Doctores;
import com.proyecto.listener.EMF;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

/**
 *
 * @author Bienvenido
 */
public class DoctoresDao implements IDoctoresDao{ 
    
    @Override
    public void insertar(Doctores d) {
      EntityManager em = EMF.crearEntityManager();
        em.getTransaction().begin();
        em.persist(d);
        em.getTransaction().commit();   
    }

    @Override
    public void actualizar(Doctores d) 
    {
        EntityManager em = EMF.crearEntityManager();
        Doctores d1 = em.find(Doctores.class, d.getDoctorid());
        em.getTransaction().begin();
        if(em.contains(d1)){
            em.merge(d);
        }else{
            System.out.println("No Se Pudo Actualizar El Doctor......");
        }
        em.getTransaction().commit();
        em.close();  
    }

    @Override
    public void eliminar(Doctores d) {
    EntityManager em = EMF.crearEntityManager();
    Doctores d1 = em.find(Doctores.class,d.getDoctorid());
    em.getTransaction().begin();
        if(em.contains(d1)){
            em.remove(d1);
        }else{
            System.out.println("No Se Pudo Eliminar El Doctores......");
        }
        em.getTransaction().commit();
        em.close();
    }

    

    @Override
    public List<Doctores> getListDoctores() {
        List<Doctores> listaDoctores = new ArrayList<>();
        EntityManager em = EMF.crearEntityManager();
        em.getTransaction().begin();
        Query q = em.createNamedQuery("consultarDoctores");
        listaDoctores = q.getResultList();
        em.getTransaction().commit();
        em.close();
        return listaDoctores;
    }
    
}
