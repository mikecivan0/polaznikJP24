/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polaznik.jp24.model;

import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity(name = "smjer")
public class Smjer extends Entitet{

    @Column(nullable = false)
    private String naziv;
    
    @Column(nullable = false)
    private Integer trajanje;
    
    private BigDecimal cijena;
    private boolean certifikat;

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }
    
    public Integer getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(Integer trajanje) {
        this.trajanje = trajanje;
    }

    public BigDecimal getCijena() {
        return cijena;
    }

    public void setCijena(BigDecimal cijena) {
        this.cijena = cijena;
    }

    public boolean isCertifikat() {
        return certifikat;
    }

    public void setCertifikat(boolean certifikat) {
        this.certifikat = certifikat;
    }
    
    
}
