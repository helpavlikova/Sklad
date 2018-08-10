package zasilkovysklad.dl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * Trida reprezentujici konkretni instanci Krehkosti zasilky ( konkretni radek v tabulce Krehkost ).
 * 
 * @author Bob
 */
@Entity
@Table(name="Krehkost")
public class Krehkost {
    /**
    * Jendoznacný identifikator krehkosti.
    */
    @Id
    @Column(name="KREHKOST")
    private String krehkost;
    
    @Column(name="POPIS")
    private String popis;
    
    public Krehkost() {
        
    }

    public Krehkost(String krehkost, String popis) {
        this.krehkost = krehkost;
        this.popis = popis;
    }

    public String getKrehkost() {
        return krehkost;
    }

    public void setKrehkost(String krehkost) {
        this.krehkost = krehkost;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }
    
    @Override
    public String toString() {
        return "Krehkost: '" + krehkost + "', popis: '" + popis + "'";
    }    
    
}
