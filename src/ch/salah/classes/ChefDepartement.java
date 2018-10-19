/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch.salah.classes;

import java.util.Date;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

/**
 *
 * @author salah
 */
@Entity
public class ChefDepartement {
    
    @EmbeddedId
    private ChefDepartementPK id;
    @ManyToOne
    @JoinColumn(name = "chef_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Chef chef;
    @ManyToOne
    @JoinColumn(name = "departement_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Departement departement;
    private Date dateFin;

    public ChefDepartement() {
    }

    public ChefDepartementPK getId() {
        return id;
    }

    public void setId(ChefDepartementPK id) {
        this.id = id;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public Departement getDepartement() {
        return departement;
    }

    public void setDepartement(Departement departement) {
        this.departement = departement;
    }

    public Date getDateFin() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }
    
    
}
