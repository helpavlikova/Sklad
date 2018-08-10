package zasilkovysklad.dl.dao.hibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import zasilkovysklad.dl.entity.Pozice;
import zasilkovysklad.dl.dao.IPoziceDAO;
import zasilkovysklad.dl.entity.StavZasilky;
import zasilkovysklad.dl.entity.Zasilka;

/**
 *
 * Implementuje interface IPoziceDAO a stara se o persistenci dat tabulky Pozice.
 * 
 * @author Honza
 */
public class PoziceDAO implements IPoziceDAO{
    
    private  SessionFactory factory;
    
    public void setfactory(SessionFactory sessionFactory) {
        this.factory = sessionFactory;
    }
    /**
     * 
     * @return seznam vsech pozic 
     */
    @Override
    public List<Pozice> getAll(){

        Session session = factory.getCurrentSession();

        session.beginTransaction();

        List<Pozice> tempList = session.createQuery("from Pozice").list();
        
        session.close();
        
        return tempList;
    }
    
    /**
     * 
     * @return Seznam vsech volnych pozic.
     */
    @Override
    public List<Pozice> getAllEmpty(){

        Session session = factory.getCurrentSession();

        session.beginTransaction();

        List<Pozice> tempList = session.createQuery("from Pozice as P where P.zasilka = null").list();
        
        session.close();
        
        return tempList;
    }
    
    /**
     * Priradi zasilku na danou pozici
     * @param poziceID
     * @param zasilkaID
     * @return 
     */
    @Override
    public boolean assignPackage(String poziceID, int zasilkaID){
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        
        Pozice tempPozice = session.get(Pozice.class, poziceID);
        Zasilka tempZasilka = session.get(Zasilka.class, zasilkaID);
        StavZasilky tempStavZasilky = session.get(StavZasilky.class, "Uskladnena");
                
        if ( tempPozice == null || tempZasilka == null )
        {
            session.close();
            return false;
        }
        
        if ( tempPozice.getZasilka() != null )
        {
            session.close();
            return false;
        }
        if ( !"Prijata".equals(tempZasilka.getStavZasilky().getStav()) )
        {
            session.close();
            return false;
        }
        
        tempPozice.setZasilka(tempZasilka);
        tempZasilka.setStavZasilky(tempStavZasilky);
        
        session.update(tempPozice);
        session.update(tempZasilka);
        
        session.getTransaction().commit();
        session.close();
        return true;
    }
       
}
