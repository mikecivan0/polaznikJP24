/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polaznik.jp24.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity(name = "clan")
public class Clan { 
    @EmbeddedId
    private ClanPK id;

    public ClanPK getId() {
        return id;
    }

    public void setId(ClanPK id) {
        this.id = id;
    }
        
}