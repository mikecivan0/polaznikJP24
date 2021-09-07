/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package polaznik.jp24;

import polaznik.jp24.util.HibernateSessionPocetniInsert;
import polaznik.jp24.util.HibernateUtil;


public class Start {
    public static void main(String[] args) {
       // HibernateSessionPocetniInsert.odradiPosao();
       HibernateUtil.getSession();
    }
}
