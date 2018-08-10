package zasilkovysklad.dl.dao;

import java.util.List;
import zasilkovysklad.dl.entity.Zasilka;

/**
 *
 * Interface DAO tridy, ktera se stara o persistenci dat tabulky Zasilka
 * 
 * @author Mira
 */
public interface IZasilkaDAO {

    /**
    * Najde vsechny zasilky.
    * 
    * @return Seznam vsech zasilek.
    * 
    */
    public List<Zasilka> getAll();

    /**
    * Najde vsechny zasilky, ktere cekaji na prirazeni na pozice ve skladu.
    * 
    * @return Seznam vsech zasilek k prirazeni pozice ve skladu.
    * 
    */
    public List<Zasilka> getAllUnpositioned();
}
