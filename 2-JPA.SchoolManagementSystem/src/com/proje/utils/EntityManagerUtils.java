package com.proje.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public final class EntityManagerUtils {

    static EntityManagerFactory emf = null;
    static EntityManager em = null;

    private EntityManagerUtils(){}

    public static EntityManager getEntityManager(String persistenceUnitName){
        if (emf != null){
            return em;
        }
        emf = Persistence.createEntityManagerFactory(persistenceUnitName);
        return emf.createEntityManager();
    }

    public static void closeEntityManager(EntityManager em){
        em.clear();
        em.close();
        emf.close();
    }

}
