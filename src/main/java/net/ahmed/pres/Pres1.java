package net.ahmed.pres;

import net.ahmed.dao.DaoImpl;
import net.ahmed.ext.DaoImplV2;
import net.ahmed.metier.MetierImpl;

public class Pres1 {
    public static void main(String[] args) {

        DaoImplV2 dao = new DaoImplV2();
        MetierImpl metier = new MetierImpl(dao);

//        metier.setDao(dao); // Injection via setter

        System.out.println(metier.calcul());
    }
}
