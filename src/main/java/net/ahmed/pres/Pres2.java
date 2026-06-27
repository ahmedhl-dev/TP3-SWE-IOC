package net.ahmed.pres;

import net.ahmed.dao.IDao;
import net.ahmed.metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class Pres2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("config.txt"));

        String daoClassName = scanner.nextLine();
        Class<?> cDao = Class.forName(daoClassName);
        IDao dao = (IDao) cDao.getDeclaredConstructor().newInstance();

        String metierClassName = scanner.nextLine();
        Class<?> cMetier = Class.forName(metierClassName);
        IMetier metier = (IMetier) cMetier.getDeclaredConstructor(IDao.class).newInstance(dao);

        /* Method setDao = cMetier.getDeclaredMethod("setDao", IDao.class);
         setDao.invoke(metier, dao); */

        System.out.println(metier.calcul());
    }
}
