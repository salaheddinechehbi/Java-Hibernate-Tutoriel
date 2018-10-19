
package ch.salah.classes;

import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

/**
 *
 * @author salah
 */
@Entity
@Table(name="Employe_Details")
@NamedQueries({
        @NamedQuery(name = "getAll", query = "From Employe"),
        @NamedQuery(name = "findByDateNaissance", query = "From Employe where date_naissance = :dateN"),
        @NamedQuery(name = "findBetweenDate", query = "From Employe where date_naissance between :fromDateN and :toDateN"),
})
public class Employe extends Personne {
    @Column(unique = true)
    private String email;
    private String tel;
    @ManyToMany
    @JoinTable(name = "Employe_Tache")
    @NotFound(action = NotFoundAction.IGNORE)
    private List<Tache> taches;

    public Employe() {
        super();
    }

    public List<Tache> getTaches() {
        return taches;
    }

    public void setTaches(List<Tache> taches) {
        this.taches = taches;
    }

   
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }
    
    
    
}
