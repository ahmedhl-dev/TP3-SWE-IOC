package net.ahmed.metier;

import net.ahmed.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

    private IDao dao;   // Couplage faible

    public MetierImpl(@Qualifier("dao2") IDao dao) {
        this.dao = dao;
    }

    @Override
    public double calcul() {
        double data = dao.getData();
        return data * 12 * Math.PI;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
