
package ch.salah.classes;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

/**
 *
 * @author salah
 */
@Entity
@Table(name="Projet_Details")
public class Projet {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String intitule;
    @Lob
    private String description;
    //@OneToMany(mappedBy = "projet",fetch = FetchType.EAGER,cascade = CascadeType.PERSIST)
    @OneToMany(mappedBy = "projet",fetch = FetchType.EAGER)
    @NotFound(action = NotFoundAction.IGNORE)
    private List<Phase> phase;

    public List<Phase> getPhase() {
        return phase;
    }

    public void setPhase(List<Phase> phase) {
        this.phase = phase;
    }

    public Projet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntitule() {
        return intitule;
    }

    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
    
}
