package zasilkovysklad.dl.dao.hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import zasilkovysklad.dl.entity.Adresa;
import zasilkovysklad.dl.entity.Krehkost;
import zasilkovysklad.dl.entity.Login;
import zasilkovysklad.dl.entity.Osoba;
import zasilkovysklad.dl.entity.Pozice;
import zasilkovysklad.dl.entity.Regal;
import zasilkovysklad.dl.entity.Sekce;
import zasilkovysklad.dl.entity.StavRegalu;
import zasilkovysklad.dl.entity.StavZasilky;
import zasilkovysklad.dl.entity.Zasilka;

/**
 *
 * Class starajici se o korektni navazani spojeni s DB a nasledne o jeho korektni ukonceni.
 * 
 * @author Honza
 */
public class HibernateUtil {

    private static SessionFactory factory;

    static {
        try {
            factory = new Configuration()
                     .configure("hibernate.cfg.xml")
                    .addAnnotatedClass(Login.class)
                    .addAnnotatedClass(Zasilka.class)
                    .addAnnotatedClass(Pozice.class)
                    .addAnnotatedClass(Regal.class)
                    .addAnnotatedClass(StavRegalu.class)
                    .addAnnotatedClass(Sekce.class)
                    .addAnnotatedClass(Krehkost.class)
                    .addAnnotatedClass(Osoba.class)
                    .addAnnotatedClass(StavZasilky.class)
                    .addAnnotatedClass(Adresa.class)
                    .buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Nelze pripojit k databazi! Initial SessionFactory creation failed." + ex);
        }
    }

    /**
    * @return SessionFactory objekt, ktery vytvari konkretni komunikacni spojeni s databazi.
    */
    public static SessionFactory getSessionFactory() {
        return factory;
    }

    /**
    * Zjisti, zda je vytvoreno pripojeni k databazi.
    * 
    * @return True pokud je pripojeni v poradku, False jinak.
    * 
    */
    public static boolean isDBConnected() {
        boolean isOpen = false;
        try {
            isOpen = factory.isOpen();
        } catch (Throwable ex) {
            System.err.println("Neni pripojeni k databazi! SessionFactory is not opend." + ex);
            return false;
        }
        return isOpen;
    }

    
    /**
     * Zavre spojeni s databazi.
     */
    public static void close() {
        factory.close();
    }

}
