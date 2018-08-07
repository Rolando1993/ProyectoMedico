/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.proyecto.test;

import com.proyecto.entidades.Antecedentemedico;
import com.proyecto.entidades.Antecedentemedicofichamedica;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Bienvenido
 */
public class ManyToMany {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("CentroMedicoJPAPU");
        EntityManager em = emf.createEntityManager();

        em.getTransaction().begin();
        Query q = em.createQuery("SELECT a FROM Antecedentemedico a");
        List<Antecedentemedico> listaAntecedentes = q.getResultList();
        for (Antecedentemedico ant : listaAntecedentes) {
                System.out.println(ant.getAntecedentemedicoid() + " " + ant.getNombreantecedente() + " " + ant.getDescripcion());

        }
    }
}
