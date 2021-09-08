/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polaznik.jp24.model;

import com.sun.istack.NotNull;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

@Entity(name = "polaznik")
public class Polaznik extends Entitet{
    
    @OneToOne()
    @NotNull
    @JoinColumn(name = "osoba")
    private Osoba osoba;
    
    @ManyToMany(mappedBy = "polaznici")
    private Set<Grupa> grupe;
    
    @Column(name = "brojugovora")
    private String brojUgovora;

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }
    
    public String getBrojUgovora() {
        return brojUgovora;
    }

    public void setBrojUgovora(String brojUgovora) {
        this.brojUgovora = brojUgovora;
    }
    
    
}
