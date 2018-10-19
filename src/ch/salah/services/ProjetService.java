/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.salah.services;

import ch.salah.classes.Projet;
import ch.salah.dao.IDao;
import ch.salah.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author salah
 */
public class ProjetService implements IDao<Projet> {

    @Override
    public Boolean create(Projet o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Boolean delete(Projet o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Boolean update(Projet o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public List<Projet> findAll() {
        List<Projet> projets = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        projets = session.createQuery("From User").list();
        session.getTransaction().commit();
        session.close();
        return projets;
    }

    @Override
    public Projet findById(int id) {
        Projet projet = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        projet = (Projet) session.get(Projet.class, id);
        session.getTransaction().commit();
        session.close();
        return projet;
    }

   
    
}
