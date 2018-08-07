/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.test;

import com.proyecto.entidades.Pacientes;
import java.sql.Date;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author DUALPC
 */
public class AppPaciente {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CentroMedicoJPAPU");
        EntityManager em = emf.createEntityManager();
        
        em.getTransaction().begin();
        Pacientes p = new Pacientes();
        
        p.setCedula("0930151592");
        p.setNombre("Elena");
        p.setTelefono("2617171");
        p.setFechanacimiento(new Timestamp(System.currentTimeMillis()));
        p.setEstadocivil("Soltera");
        p.setDireccion("Recreo 1era Etapa");
        p.setOcupacion("Estudiante");
        p.setSexo("Femenino");
        p.setCorreo("pihuavelaraelena@gmail.com");
        
        em.persist(p);
        em.getTransaction().commit();
        em.close();
        emf.close();
        
        
    }
    
}
