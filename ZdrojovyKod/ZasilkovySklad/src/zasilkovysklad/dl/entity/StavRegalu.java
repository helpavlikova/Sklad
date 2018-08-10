package zasilkovysklad.dl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * Trida reprezentujici konkretni instanci Stavu regalu ( konkretni radek v tabulce StavRegalu ).
 * 
 * @author Honza
 */
@Entity
@Table(name="StavRegalu")
public class StavRegalu {
    /**
    * Jendoznacný identifikator stavu regalu.
    */
    @Id
    @Column(name="STAV")
    private String stav;
    
    @Column(name="POPIS")
    private String popis;
    
    public StavRegalu() {
        
    }

    public StavRegalu(String stav, String popis) {
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
        return "StavRegalu: '" + stav + "', popis: '" + popis + "'";
    }    
    
}
