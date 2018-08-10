package zasilkovysklad.dl.entity;

import java.util.GregorianCalendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * Trida reprezentujici konkretni instanci Benefitu ( konkretni radek v tabulce Benefit ).
 * 
 * @author Bob
 */
@Entity
@Table(name="Benefit")
public class Benefit {
    /**
    * Jendoznacný identifikator benefitu.
    */
    @Id
    @Column(name="BENEFIT")
    private String benefit;
    
    @Column(name="POPIS")
    private String popis;
    
    @Column(name="PLATNOSTDO")
    private GregorianCalendar platnostdo;
    
    public Benefit() {
        
    }
    
    public Benefit(String popis, GregorianCalendar platnostdo) {
        this.popis = popis;
        this.platnostdo = platnostdo;
    }
    
    public String getBenefit() {
        return benefit;
    }
    
    public void setBenefit(String benefit) {
        this.benefit = benefit;
    }    
    
    public GregorianCalendar getPlatnostdo() {
        return platnostdo;
    }
    
    public void setPlatnostdo(GregorianCalendar platnostdo) {
        this.platnostdo = platnostdo;
    }
    
   public String getPopis() {
        return popis;
    }
    
    public void setPopis(String popis) {
        this.popis = popis;
    }
    
    @Override
    public String toString() {
        return "Benefit: '" + benefit + "', popis: '" + popis + 
                "', platnostdo: '"+ platnostdo + "'";
    } 
}
