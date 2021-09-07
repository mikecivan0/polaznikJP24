/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polaznik.jp24.model;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity(name = "polaznik")
public class Polaznik extends Entitet{
    
    @OneToOne()
    @NotNull
    private Osoba osoba;
    
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