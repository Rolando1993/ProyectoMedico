/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.test;


import com.proyecto.entidades.Consultamedica;
import com.proyecto.entidades.Consultoriomedico;
import com.proyecto.entidades.Fichamedica;
import com.proyecto.entidades.Pacientes;
import com.proyecto.entidades.Signosvitales;
import java.math.BigInteger;
import java.sql.Timestamp;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Propietario
 */
public class OneToMany {
    
    public static void main(String[] args) {
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CentroMedicoJPAPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        
        Consultoriomedico cm = new Consultoriomedico();
        cm.setNombre("Consultorio Medico Las Acacias");
        cm.setDireccion("29 y Cuenca");
        cm.setTelefono("123456789");
        cm.setCorreo("consultorio.lasacacias@gmail.com");
        
        Pacientes p = new Pacientes();
        p.setCedula("090963755");
        p.setNombre("Rolando");
        p.setTelefono("0991052528");
        p.setFechanacimiento(new Timestamp(System.currentTimeMillis()));
        p.setEstadocivil("Unido");
        p.setDireccion("17 y chembers");
        p.setOcupacion("Guardia de Seguridad");
        p.setSexo("Masculino");
        p.setCorreo("cosabella.1997@hotmail.com");
        
        Signosvitales sv = new Signosvitales();
        sv.setMasacorporal("40 kg");
        sv.setTalla("170 mtrs");
        sv.setPeso("60 libras");
        sv.setTemperatura("60 grados");
        sv.setPresion("Alta");
        sv.setEmergencia(true);
        
        em.persist(cm);
        em.persist(p);
        em.persist(sv);
        
        Fichamedica fm = new Fichamedica();
        fm.setPacienteid(p);
        fm.setCentromedicoid(cm);
        fm.setSignosvitales(sv);
        fm.setFecharegistro(new Timestamp(System.currentTimeMillis()));
        fm.setCosto(new BigInteger("100"));
        fm.setAbono(new BigInteger("50"));
        fm.setTotal(new BigInteger("150"));
        
        em.persist(fm);
        em.getTransaction().commit();
        em.close();
        emf.close();
    }
}
