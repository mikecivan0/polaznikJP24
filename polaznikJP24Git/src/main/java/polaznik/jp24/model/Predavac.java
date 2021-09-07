/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polaznik.jp24.model;

import com.sun.istack.NotNull;
import javax.persistence.Entity;
import javax.persistence.OneToOne;


@Entity(name = "predavac")
public class Predavac extends Entitet{

    public Predavac() {
    }

    public Predavac(Osoba osoba, String iban) {
        this.osoba = osoba;
        this.iban = iban;
    }
    
    @OneToOne()
    @NotNull
    private Osoba osoba;
    
    private String iban;

    public Osoba getOsoba() {
        return osoba;
    }

    public void setOsoba(Osoba osoba) {
        this.osoba = osoba;
    }
    
    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }
    
    
}
