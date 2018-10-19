
package hibernategeneral;

import ch.salah.classes.Adresse;
import ch.salah.classes.Contact;
import ch.salah.classes.Employe;
import ch.salah.classes.Phase;
import ch.salah.classes.Projet;
import ch.salah.classes.Service;
import ch.salah.classes.Users;
import ch.salah.classes.Voiture;
import ch.salah.util.HibernateUtil;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

/**
 *
 * @author salah
 */
public class HibernateGeneral {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here
        //HibernateUtil.getSessionFactory().openSession();
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
        
//        //How To Use Criteria API For Fetching Data From Hibernate Class And Mysql
//        Criteria criteria = session.createCriteria(Employe.class);     
//        //here we work with && condition
//        criteria.add(Restrictions.eq("nom","kami"));//eq is ==, gt is >, lt is <.
//        criteria.add(Restrictions.eq("nom","salah")).add(Restrictions.gt("age",20));
//        criteria.add(Restrictions.like("nom","%salah")).add(Restrictions.between("age",20,30));//like(%sal%) contain sal in field
//        
//        //here we work with || condition
//        criteria.add(Restrictions.or(Restrictions.eq("nom","salah"), Restrictions.gt("age",20)));
//        
//        //in case we want towork with Projections
//        criteria.setProjection(Projections.property("nom"));//this return us only username 
//        criteria.setProjection(Projections.count("id"));//return us the count, we can use .max .min ...
//        criteria.addOrder(Order.desc("id"));//if we want to order our list
//        
//        //Query By Example with Criteria
//        Employe e = new Employe();//first we create an object that we make it like examlpe
//        e.setNom("salah");//then we give the properties the value that we locking for it in our list
//        e.setPrenom("said");//we can add as manu as we want and usually we use query by example in case we have to make test with a lot of properties
//        Example example = Example.create(e);//then we create example 
//        Example example1 = Example.create(e).excludeProperty("date");//here we can exclude the prperties that we dont want to add it to the test
//        e.setTel("0524%");//here if we want to find tel that start with 0524 and we have to enable like in Example
//        Example example2 = Example.create(e).enableLike();//enabling Like methode
//        Criteria criteria2 = session.createCriteria(Employe.class).add(example2);
//              
//        List<Employe> employes = criteria.list();
//        session.getTransaction().commit();
//        session.close();
//        for(Employe p : employes){System.out.println("    "+p.getPrenom());}

        
        //How To use HQL Hibernate Query Language
//        session.beginTransaction();
//        Query query = session.createQuery("From Employe");
//        query.setMaxResults(3);
//        query.setFirstResult(2);//Start from
//        List<Employe> employe = query.list();
        
//        Query query = session.createQuery("SELECT email From Employe");
//        List<String> employe = query.list();
        
//        Query query = session.createQuery("From Employe where id=:idd");
//        query.setParameter("idd", 4);
//        query.setParameter(0, value);//In casewe have use ? instead of :id in parameter 
//        List<Employe> employe = query.list();       
//        session.getTransaction().commit();
//        session.close();
//        System.out.println(""+employe.size());



        //We use it with onetomany relation to save multiple phase to a projet by iserting only projet in thetransaction by session.persist
//        Projet p = new Projet();
//        Phase f = new Phase();
//        f.setTitre("Gestion Categorie");
//        p.setIntitule("Gestion Voiture");
//        p.setDescription("hello from the other side what do you mean");
//        p.getPhase().add(f);
//        session.beginTransaction();
//        session.persist(p);
//        session.getTransaction().commit();
//        session.close();
        
        //Get Projet + Get Phase + Get Phase By Projet + Get Phase List From Projet Class
//        session.beginTransaction();
//        List<Projet> projets = session.createQuery("From Projet").list();
//        List<Phase> phases = session.createQuery("From Phase").list();
//        Projet projet_1 = (Projet) session.get(Projet.class,2);
//        List<Phase> projet_phases = projet_1.getPhase();
//        session.getTransaction().commit();
//        session.close();
//        for(Projet p : projets){
//            System.out.println(p.getIntitule());
//            System.out.println("==================");
//            for(Phase f : phases){
//                if(f.getProjet().getId() == p.getId()){
//                    System.out.println("    "+f.getTitre());
//                }
//            }
//        }
//        System.out.println("_________________________________");
//        for(Phase f : projet_phases){
//                System.out.println("    "+f.getTitre());
//        }
        


        //Insert Services + List Services
//        Service s = new Service();Service s1 = new Service();Service s2 = new Service();Service s3 = new Service();Service s0 = new Service();
//        s.setNom("Informatique");s0.setNom("Réseau");s1.setNom("Thechnique");s2.setNom("Management");s3.setNom("Direction");
//        session.save(s0);session.save(s);session.save(s1);session.save(s2);session.save(s3);
//        session.beginTransaction();
//        List<Service> services = session.createQuery("From Service").list();
//        session.getTransaction().commit();
              

        //Insert User With Adresse List + Contact Class
//        Users u = new Users();Adresse a = new Adresse();Adresse aa = new Adresse();Contact c = new Contact();
//        a.setCity("Taza");a.setStreet("Jabha");a.setPincode(40030);
//        aa.setCity("Tanger");aa.setStreet("Medina");aa.setPincode(40020);
//        c.setEmail("rami@gmail.com");c.setHome_number("0524431221");c.setMobile_number("0632548987");
//        u.setContact(c);u.setDate_embauche(new Date());u.setNom("Rami");u.setPrenom("imane");
//        u.getListOfAdresse().add(a);u.getListOfAdresse().add(aa);
//        u.setService(services.get(1)); 
//        session.beginTransaction();
//        session.save(u);
//        session.getTransaction().commit();
//        session.beginTransaction();
//        List<Users> users = session.createQuery("From Users").list();
//        session.getTransaction().commit();
//        session.close();
//        for(Users uu : users){System.out.println(""+uu.getNom());}  
        

          //Update User
        //List<Users> users = session.createQuery("From Users").list();
        
        //for(Service s : services){System.out.println(""+s.getNom());}
        //for(Users u : users){System.out.println(""+u.getNom());}
        //uu.setService(services.get(0));
//        Voiture v = new Voiture();
//        v.setNom("DACIA");
//        session.beginTransaction();
//        session.save(v);
        //Users u = (Users) session.get(Users.class, 1);
        //u.setVoiture(v);
        //session.update(u);
//        session.getTransaction().commit();
//        session.close();
        //System.out.println(u.getPrenom());

          //List Des Employes
//        session.beginTransaction();
//        List<Employe> employes = session.createQuery("From Employe").list();
//        session.getTransaction().commit();
//        session.close();


          //@NamedQueries getAll + By Date + Between Date
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
//        Date fromDate= format.parse("1991-10-18");
//        Date toDate= format.parse("1995-10-18");
//        session.beginTransaction();
//        List<Employe> employes0 = session.getNamedQuery("getAll").list();
//        List<Employe> employes1 = session.getNamedQuery("findByDateNaissance").setParameter("dateN",fromDate).list();
//        List<Employe> employes = session.getNamedQuery("findBetweenDate").setParameter("fromDateN",fromDate).setParameter("toDateN", toDate).list();
//        session.getTransaction().commit();
//        session.close();
//        for(Employe e : employes){System.out.println(""+e.getNom()+" "+e.getPrenom());}
    }
    
}
