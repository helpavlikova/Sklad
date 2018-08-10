package zasilkovysklad.dl.dao;

import java.util.List;
import zasilkovysklad.dl.entity.Sekce;

/**
 *
 * Interface DAO tridy, ktera se stara o persistenci dat tabulky Sekce
 * 
 * @author Mira
 */
public interface ISekceDAO {

    /**
    * Najde vsechny sekce ve sklade.
    * 
    * @return Seznam vsech sekci ve sklade.
    * 
    */
    public List<Sekce> getAll();
    
}
