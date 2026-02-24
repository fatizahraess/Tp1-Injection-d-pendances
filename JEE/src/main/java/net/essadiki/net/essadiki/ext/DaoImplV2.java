package net.essadiki.net.essadiki.ext;

import net.essadiki.dao.IDao;

public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Version capteurs....");
        double t =12;
    return t;
    }
}
