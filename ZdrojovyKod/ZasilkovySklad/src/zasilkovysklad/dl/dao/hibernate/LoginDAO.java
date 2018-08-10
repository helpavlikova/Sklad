package zasilkovysklad.dl.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import zasilkovysklad.dl.dao.ILoginDAO;
import zasilkovysklad.dl.entity.Login;

/**
 *
 * Implementuje interface ILoginDAO a stara se o persistenci dat tabulky Login.
 * 
 * @author Honza
 */
public class LoginDAO implements ILoginDAO {

    private SessionFactory factory;


    public void setfactory(SessionFactory sessionFactory) {
        this.factory = sessionFactory;
    }

    /**
    * Zahaji komunikaci s DB.
    * 
    * @return Session objekt, který komunikuje s databazi.
    * 
    */
    private Session beginSession() {
        Session session = factory.getCurrentSession();
        session.beginTransaction();
        return session;
    }

    /**
    * Nahrani zmen do databaze a ukonceni komunikace.
    * 
    * @param session Session objekt, ktery komunikuje s databazi.
    * 
    */
    private void commitAndCloseSession(Session session) {
        session.getTransaction().commit();
        session.close();
    }
    /**
     * 
     * @param newLogin 
     */
    @Override
    public void saveLogin(Login newLogin) {

        Session session = beginSession();

        session.save(newLogin);
        System.out.println("Ukladam Login objekt.");

        commitAndCloseSession(session);
        System.out.println("Login objekt uspesne nahran do databaze.");
    }

    /**
     * 
     * @param username
     * @return 
     */
    @Override
    public Login getLoginByUsername(String username) {

        Session session = factory.getCurrentSession();

        session.beginTransaction();

        Login tempLogin = session.get(Login.class, username);

        session.close();
        return tempLogin;
    }
    /**
     * 
     * @return vyjimka
     */
    public int numberOfUsers() {
        throw new UnsupportedOperationException("Tato metoda jeste nebyla implementovana");
    }

}
