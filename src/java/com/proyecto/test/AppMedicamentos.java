/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.test;

import com.proyecto.entidades.Medicamentos;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Bienvenido
 */
public class AppMedicamentos {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CentroMedicoJPAPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Medicamentos m = new Medicamentos();
        
        
        m.setNombremedicina("Paracetamol");
        m.setDescripcion("dolor de cabeza");
        
        
        em.persist(m);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
    
}
