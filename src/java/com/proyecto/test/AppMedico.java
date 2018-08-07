/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.test;

import com.proyecto.entidades.Doctores;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Bienvenido
 */
public class AppMedico {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CentroMedicoJPAPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Doctores d = new Doctores();
        d.setNombre("Carlos");
        d.setApellido("Mero");
        d.setCorreo("Alan@gmail.com");
        d.setDireccion("duran");
        d.setCedula("0956376544");
        d.setEspecialidad("Otorrinolaringologia");
        d.setAniosexperiencia(3);
        d.setSexo("Masculino");
        
        em.persist(d);
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        
        
    }
    
}
