/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polaznik.jp24.model;

import com.sun.istack.NotNull;
import java.io.Serializable;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Embeddable
public class ClanPK implements Serializable{
    @ManyToOne
    @NotNull
    @JoinColumn(name = "grupa")
    private Grupa grupa;
    
    @ManyToOne
    @NotNull
    @JoinColumn(name = "polaznik")
    private Polaznik polaznik;

    public Grupa getGrupa() {
        return grupa;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
    }

    public Polaznik getPolaznik() {
        return polaznik;
    }

    public void setPolaznik(Polaznik polaznik) {
        this.polaznik = polaznik;
    }
    
}