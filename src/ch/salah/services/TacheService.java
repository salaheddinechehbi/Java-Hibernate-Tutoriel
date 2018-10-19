/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.salah.services;

import ch.salah.classes.Tache;
import ch.salah.dao.IDao;
import ch.salah.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author salah
 */
public class TacheService implements IDao<Tache> {

    @Override
    public Boolean create(Tache o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Boolean delete(Tache o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Boolean update(Tache o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public List<Tache> findAll() {
        List<Tache> taches = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        taches = session.createQuery("From User").list();
        session.getTransaction().commit();
        session.close();
        return taches;
    }

    @Override
    public Tache findById(int id) {
        Tache tache = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        tache = (Tache) session.get(Tache.class, id);
        session.getTransaction().commit();
        session.close();
        return tache;
    }

   
    
}

