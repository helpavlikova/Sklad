package zasilkovysklad.dl.dao;

import java.util.List;
import zasilkovysklad.dl.entity.Regal;

/**
 *
 * Interface DAO class, ktera se stara o persistenci dat tabulky Regal
 * 
 * @author Mira
 */
public interface IRegalDAO {

    /**
    * Najde vsechny regaly ve sklade.
    * 
    * @return Seznam vsech regalu ve sklade.
    * 
    */
    public List<Regal> getAll();
    
}
