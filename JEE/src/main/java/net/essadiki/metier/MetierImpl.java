package net.essadiki.metier;

import net.essadiki.dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("metier")
public class MetierImpl implements IMetier {

  @Autowired
  @Qualifier("d")

  private  IDao dao;



    public MetierImpl(IDao dao) {
        this.dao = dao;
    }
    public MetierImpl() {
    }
    @Override
    public double calcul() {
        double t = dao.getData();
        double res = t * 12 *Math.PI/2 * Math.cos(t);
        return res;
    }
    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
