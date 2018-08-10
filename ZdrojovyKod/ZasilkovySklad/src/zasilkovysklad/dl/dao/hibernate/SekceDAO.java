package zasilkovysklad.dl.dao.hibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import zasilkovysklad.dl.entity.Sekce;
import zasilkovysklad.dl.dao.ISekceDAO;

/**
 *
 * Implementuje interface ISekceDAO a stara se o persistenci dat tabulky Sekce.
 * 
 * @author Honza
 */
public class SekceDAO implements ISekceDAO{
    
    private  SessionFactory factory;
    
    public void setfactory(SessionFactory sessionFactory) {
        this.factory = sessionFactory;
    }
    
    /**
     * 
     * @return seznam vsech sekci
     */
    @Override
    public List<Sekce> getAll(){

        Session session = factory.getCurrentSession();

        session.beginTransaction();

        List<Sekce> tempList = session.createQuery("from Sekce").list();
        
        session.close();
        
        return tempList;
    }
       
}
