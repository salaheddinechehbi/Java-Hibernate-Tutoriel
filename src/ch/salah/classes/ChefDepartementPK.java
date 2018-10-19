/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.salah.classes;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Embeddable;

/**
 *
 * @author salah
 */
@Embeddable
public class ChefDepartementPK implements Serializable {
    
    private Date dateDebut;
    private int chef;
    private int departement;

    public ChefDepartementPK() {
    }

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public int getChef() {
        return chef;
    }

    public void setChef(int chef) {
        this.chef = chef;
    }

    public int getDepartement() {
        return departement;
    }

    public void setDepartement(int departement) {
        this.departement = departement;
    }
    
    
}
