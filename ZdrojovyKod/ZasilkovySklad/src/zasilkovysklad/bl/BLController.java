package zasilkovysklad.bl;

import org.hibernate.SessionFactory;
import zasilkovysklad.dl.dao.ILoginDAO;
import zasilkovysklad.dl.entity.Login;

/**
 * Trida implementuje interface IBLController
 * 
 * @author Mira
 */
public class BLController implements IBLController {

    /**
     * Rozhrani umoznujici persistentni ukladani loginu.
     */
    private ILoginDAO loginDAO;

    /**
     * Umoznuje nastavit tridu (Spring) implementujici rozhrani ILoginDAO
     *
     * @param loginDAO Instance tridy implementujici rozhrani ILoginDAO.
     */
    public void setLoginDAO(ILoginDAO loginDAO) {
        this.loginDAO = loginDAO;
    }

    private SessionFactory factory;

    public void SessionFactory(SessionFactory factory) {
        this.factory = factory;
    }

    /**
     *
     * Zkontrouje zda se uzivatel autentizoval spravnymi udaji.
     * 
     * @return 0 pokud uzivatel neexistuje, 1 pokud uzivatel existuje a zadal spravne heslo, -1 jinak
     */
    @Override
    public int autentization(String username, String password) {

        Login tempLogin = loginDAO.getLoginByUsername(username);

        if (tempLogin == null) {
            return 0;
        } else if (tempLogin.getPassword().equals(password)) {
            return 1;
        } else {
            return -1;
        }
    }



}
