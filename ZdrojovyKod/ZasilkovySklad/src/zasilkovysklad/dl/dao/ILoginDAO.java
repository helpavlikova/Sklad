package zasilkovysklad.dl.dao;

import zasilkovysklad.dl.entity.Login;

/**
 *
 * Interface DAO tridy, ktera se stara o persistenci dat tabulky Login
 * 
 * @author Mira
 */
public interface ILoginDAO {

    /**
    * @param newLogin Nový login k ulozeni
    */
    public void saveLogin(Login newLogin);

    /**
    * Najde Login pro konkretni username.
    * 
    * @return tridu Login s prihlasovacimi udaji, null pokud username neexistuje
    * 
    * @param username Username pro ktery se vyhledava login
    * 
    */
    public Login getLoginByUsername(String username);

}
