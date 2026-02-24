package net.essadiki.pres;

import net.essadiki.dao.DaoImpl;
import net.essadiki.metier.MetierImpl;
import net.essadiki.net.essadiki.ext.DaoImplV2;

public class Pres1 {
    public static void main(String[] args) {
        DaoImplV2 d = new DaoImplV2();
        MetierImpl metier =new MetierImpl(d);

        System.out.println("RES="+metier.calcul());
    }
}
