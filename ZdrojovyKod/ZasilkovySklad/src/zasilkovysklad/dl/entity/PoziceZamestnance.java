package zasilkovysklad.dl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * Trida reprezentujici konkretni instanci Pozice zamestnance ( konkretni radek v tabulce PoziceZamestnance ).
 * 
 * @author Bob
 */
@Entity
@Table(name="PoziceZamestnance")
public class PoziceZamestnance {
    
    @Id
    @Column(name="POZICE")
    private String pozice;

    @Column(name="POPIS")
    private String popis;
    
    public PoziceZamestnance() {
        
    }
    
    public PoziceZamestnance(String pozice, String popis) {
        this.pozice = pozice;
        this.popis = popis;
    }
      
    public String getPozice() {
        return pozice;
    }
    
    public void setPozice(String pozice) {
        this.pozice = pozice;
    }

    public String getPopis() {
        return popis;
    }
    
    public void setPopis(String popis) {
        this.popis = popis;
    }
    
    @Override
    public String toString() {
        return "PoziceZamestnance: '" + pozice + "', password: '" +
                popis + "'";
    }
    
    
}
