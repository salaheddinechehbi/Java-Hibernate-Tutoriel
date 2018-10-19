/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.salah.services;

import ch.salah.classes.Phase;
import ch.salah.dao.IDao;
import ch.salah.util.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author salah
 */
public class PhaseService implements IDao<Phase> {

    @Override
    public Boolean create(Phase o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Boolean delete(Phase o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.delete(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public Boolean update(Phase o) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        session.update(o);
        session.getTransaction().commit();
        session.close();
        return true;
    }

    @Override
    public List<Phase> findAll() {
        List<Phase> phases = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        phases = session.createQuery("From User").list();
        session.getTransaction().commit();
        session.close();
        return phases;
    }

    @Override
    public Phase findById(int id) {
        Phase phase = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        phase = (Phase) session.get(Phase.class, id);
        session.getTransaction().commit();
        session.close();
        return phase;
    }

   
    
}
