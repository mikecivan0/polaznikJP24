/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polaznik.jp24.model;

import com.sun.istack.NotNull;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity(name = "grupa")
public class Grupa extends Entitet{
    
    @Column(nullable = false)
    private String naziv;
    
    @ManyToOne   
    @NotNull
    @JoinColumn(name = "smjer")
    private Smjer smjer;
    
    @ManyToOne
    @JoinColumn(name = "predavac")
    private Predavac predavac;
    
    @Column(name = "datumpocetka")
    private Date datumPocetka;
    
    @ManyToMany
    @JoinTable(
            name = "clan",
            joinColumns = @JoinColumn(name = "grupa"),
            inverseJoinColumns = @JoinColumn(name = "polaznik")
    )    
    private Set<Polaznik> polaznici;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Smjer getSmjer() {
        return smjer;
    }

    public void setSmjer(Smjer smjer) {
        this.smjer = smjer;
    }

    public Predavac getPredavac() {
        return predavac;
    }

    public void setPredavac(Predavac predavac) {
        this.predavac = predavac;
    }

    public Date getDatumPocetka() {
        return datumPocetka;
    }

    public void setDatumPocetka(Date datumPocetka) {
        this.datumPocetka = datumPocetka;
    }
    
    
    public Set<Polaznik> getPolaznici() {
        return polaznici;
    }

    public void setPolaznici(Set<Polaznik> polaznici) {
        this.polaznici = polaznici;
    }
    
}
