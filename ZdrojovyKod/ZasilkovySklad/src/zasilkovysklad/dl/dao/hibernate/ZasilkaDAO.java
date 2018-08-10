package zasilkovysklad.dl.dao.hibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import zasilkovysklad.dl.entity.Zasilka;
import zasilkovysklad.dl.dao.IZasilkaDAO;

/**
 *
 * Implementuje interface IZasilkaDAO a stara se o persistenci dat tabulky Zasilka.
 * 
 * @author Honza
 */
public class ZasilkaDAO implements IZasilkaDAO{
    
    private  SessionFactory factory;
    
    public void setfactory(SessionFactory sessionFactory) {
        this.factory = sessionFactory;
    }
    
    /**
     * 
     * @return seznam vsech zasilek
     */
    @Override
    public List<Zasilka> getAll(){
        
        Session session = factory.getCurrentSession();

        session.beginTransaction();

        List<Zasilka> tempList = session.createQuery("from Zasilka").list();
        
        session.close();
        
        return tempList;
    }

    /**
     * 
     * @return seznam vsech nezarazenych zasilek
     */
    @Override
    public List<Zasilka> getAllUnpositioned(){

        Session session = factory.getCurrentSession();

        session.beginTransaction();

        List<Zasilka> tempList = session.createQuery("from Zasilka as Z where Z.stavZasilky = 'Prijata'").list();
        
        session.close();
        
        return tempList;
    }
    
}
