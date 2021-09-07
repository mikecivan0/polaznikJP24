/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polaznik.jp24.util;

import com.github.javafaker.Faker;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hibernate.Session;
import polaznik.jp24.model.Grupa;
import polaznik.jp24.model.Polaznik;
import polaznik.jp24.model.Predavac;
import polaznik.jp24.model.Smjer;

public class HibernateSessionPocetniInsert {

    public static void odradiPosao() {
        Session s = HibernateUtil.getSession();

        s.beginTransaction();

        Smjer java = new Smjer();
        java.setNaziv("Java programiranje");
        s.save(java);

        Faker faker = new Faker();
        Predavac predavac = new Predavac();

        predavac.getOsoba().setIme(faker.name().firstName());
        predavac.getOsoba().setPrezime(faker.name().lastName());

        s.save(predavac);

        List<Polaznik> polaznici = new ArrayList<>();
        Polaznik polaznik;
        for (int i = 0; i < 1300; i++) {
            polaznik = new Polaznik();
            polaznik.getOsoba().setIme(faker.name().firstName());
            polaznik.getOsoba().setPrezime(faker.name().lastName());
            s.save(polaznik);
            if(i%100==0){
                polaznici.add(polaznik);
            }
        }

        Grupa grupa = new Grupa();
        grupa.setNaziv("JP24");
        grupa.setPredavac(predavac);
        grupa.setDatumPocetka(new Date());
       
        
        s.save(grupa);
        
        s.getTransaction().commit();
    }
}
