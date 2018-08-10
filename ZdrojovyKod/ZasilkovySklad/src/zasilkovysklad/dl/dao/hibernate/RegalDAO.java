package zasilkovysklad.dl.dao.hibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import zasilkovysklad.dl.entity.Regal;
import zasilkovysklad.dl.dao.IRegalDAO;

/**
 *
 * Implementuje interface IRegalDAO a stara se o persistenci dat tabulky Regal.
 * 
 * @author Honza
 */
public class RegalDAO implements IRegalDAO{
   
    private  SessionFactory factory;
    
    public void setfactory(SessionFactory sessionFactory) {
        this.factory = sessionFactory;
    }
    /**
     * 
     * @return seznam vsech regalu
     */
    @Override
    public List<Regal> getAll(){

        Session session = factory.getCurrentSession();

        session.beginTransaction();

        List<Regal> tempList = session.createQuery("from Regal").list();
        
        session.close();
        
        return tempList;
    }
}
