/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.salah.services;

import ch.salah.classes.Voiture;
import ch.salah.dao.IDao;
import ch.salah.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author salah
 */
public class VoitureService implements IDao<Voiture> {

    @Override
    public Boolean create(Voiture o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Boolean delete(Voiture o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Boolean update(Voiture o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public List<Voiture> findAll() {
        List<Voiture> voitures = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        voitures = session.createQuery("From User").list();
        session.getTransaction().commit();
        session.close();
        return voitures;
    }

    @Override
    public Voiture findById(int id) {
        Voiture voiture = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        voiture = (Voiture) session.get(Voiture.class, id);
        session.getTransaction().commit();
        session.close();
        return voiture;
    }

   
    
}
