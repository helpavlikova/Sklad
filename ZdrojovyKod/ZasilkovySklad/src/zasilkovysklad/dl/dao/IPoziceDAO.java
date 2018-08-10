package zasilkovysklad.dl.dao;

import java.util.List;
import zasilkovysklad.dl.entity.Pozice;

/**
 *
 * Interface DAO tridy, ktera se stara o persistenci dat tabulky Pozice
 * 
 * @author Mira
 */
public interface IPoziceDAO {
    
    /**
    * Najde vsechny pozice ve sklade.
    * 
    * @return Seznam vsech pozic ve sklade.
    * 
    */
    public List<Pozice> getAll();

    /**
    * Najde vsechny volne pozice ve sklade.
    * 
    * @return Seznam vsech volnych pozic ve sklade.
    * 
    */
    public List<Pozice> getAllEmpty();
    
    
    /**
    * Ke konkretni pozici priradi konkretni zasilku.
    * 
    * @return True pokud je prirazeni uspesne, False jinak
    * 
    * @param poziceID ID pozice, na kterou se zasilka priradi
    * @param zasilkaID ID zasilky, ktera bude na pozici prirazena
    */
    public boolean assignPackage(String poziceID, int zasilkaID);
}
