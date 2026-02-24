package net.essadiki.pres;

import net.essadiki.dao.IDao;
import net.essadiki.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner=new Scanner(new File("config.txt"));
    String daoClassName = scanner.nextLine();
    Class cDao = Class.forName(daoClassName);
   IDao d=(IDao) cDao.newInstance();

        String metierClassName = scanner.nextLine();
        Class cMetier = Class.forName(metierClassName);
        IMetier metier=(IMetier) cDao.getConstructor(IDao.class).newInstance(d);

    }
}
