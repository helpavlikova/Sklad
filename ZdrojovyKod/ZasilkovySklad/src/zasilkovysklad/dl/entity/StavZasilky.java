package zasilkovysklad.dl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * Trida reprezentujici konkretni instanci Stavu zasilky ( konkretni radek v tabulce StavZasilky ).
 * 
 * @author Bob
 */
@Entity
@Table(name="StavZasilky")
public class StavZasilky {
    /**
    * Jendoznacný identifikator stavu zasilky.
    */
    @Id
    @Column(name="STAV")
    private String stav;
    
    @Column(name="POPIS")
    private String popis;
    
    public StavZasilky() {
        
    }

    public StavZasilky(String stav, String popis) {
        this.stav = stav;
        this.popis = popis;
    }

    public String getStav() {
        return stav;
    }

    public void setStav(String stav) {
        this.stav = stav;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }
    
    @Override
    public String toString() {
        return "StavZasilky: '" + stav + "', popis: '" + popis + "'";
    }    
    
}
