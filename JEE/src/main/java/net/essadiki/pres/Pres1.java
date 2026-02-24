package net.essadiki.pres;

import net.essadiki.dao.DaoImpl;
import net.essadiki.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {
        DaoImpl d = new DaoImpl();
        MetierImpl =new MetierImpl(d);
       metier.setDao(d);
        System.out.println("RES="+metier.calcul());
    }
}
