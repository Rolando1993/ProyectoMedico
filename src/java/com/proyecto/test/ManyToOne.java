/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.test;

import com.proyecto.entidades.Consultamedica;
import com.proyecto.entidades.Doctores;
import com.proyecto.entidades.Tratamientos;
import java.math.BigInteger;
import java.sql.Timestamp;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Propietario
 */
public class ManyToOne {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CentroMedicoJPAPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        
        Tratamientos t = new Tratamientos();
        t.setDescripcion("Respiracion");
        t.setCosto(new BigInteger("10000"));
        
        Doctores d = new Doctores();
        d.setNombre("Rolando");
        d.setApellido("Palma");
        d.setCorreo("rolando.palmat@ug.edu.ec");
        d.setDireccion("17 y portete");
        d.setCedula("0930151592");
        d.setEspecialidad("Programador Junior De Software");
        d.setAniosexperiencia(10);
        d.setSexo("Masculino");
        em.persist(t);
        em.persist(d);
        
        Consultamedica cm = new Consultamedica();
        cm.setFechaconsulta(new Timestamp(System.currentTimeMillis()));
        cm.setTratamientoid(t);
        cm.setDoctorid(d);
        
        em.persist(cm);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
