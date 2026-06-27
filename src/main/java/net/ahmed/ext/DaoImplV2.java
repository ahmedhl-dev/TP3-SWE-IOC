package net.ahmed.ext;

import net.ahmed.dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData() {
        System.out.println("Sensors Version");
        return 12;
    }
}
