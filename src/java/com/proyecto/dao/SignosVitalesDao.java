/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.dao;

import com.proyecto.entidades.Signosvitales;
import com.proyecto.listener.EMF;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author GERMAN
 */
public class SignosVitalesDao implements ISignosVitalesDao{

    @Override
    public void insertar(Signosvitales sv) {
        EntityManager em = EMF.crearEntityManager();
        em.getTransaction().begin();
        em.persist(sv);
        em.getTransaction().commit();  
    }

    @Override
    public void actualizar(Signosvitales sv) {
         EntityManager em = EMF.crearEntityManager();
        Signosvitales v1 = em.find(Signosvitales.class, sv.getSignosvitales());
        em.getTransaction().begin();
        if(em.contains(v1)){
            em.merge(sv);
        }else{
            System.out.println("No Se Pudo Actualizar El Signo......");
        }
        em.getTransaction().commit();
        em.close();  
    }

    @Override
    public void eliminar(Signosvitales sv) {
         EntityManager em = EMF.crearEntityManager();
        Signosvitales v1 = em.find(Signosvitales.class, sv.getSignosvitales());
        em.getTransaction().begin();
        if(em.contains(v1)){
            em.remove(v1);
        }else{
            System.out.println("No Se Pudo Eliminar El Signo......");
        }
        em.getTransaction().commit();
        em.close();  
    }

    @Override
    public List<Signosvitales> getListaSignos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
