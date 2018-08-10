package zasilkovysklad.dl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * Trida reprezentujici zda je zasilka zahrnuta do urcite inventury ( konkretni radek v tabulce jeZahrnutaDo ).
 * 
 * @author Bob
 */
@Entity
@Table(name="jeZahrnutaDo")
public class JeZahrnutaDo {

    @OneToOne
    private Zasilka zasilkaID;
    
    @OneToOne
    private Inventura inventura;
    
    public JeZahrnutaDo() {
        
    }

    public JeZahrnutaDo(Zasilka zasilkaID, Inventura inventura) {
        this.zasilkaID = zasilkaID;
        this.inventura = inventura;
    }

    public Zasilka getZasilkaID() {
        return zasilkaID;
    }

    public void setZasilkaID(Zasilka zasilkaID) {
        this.zasilkaID = zasilkaID;
    }

    public Inventura getInventura() {
        return inventura;
    }

    public void setInventura(Inventura inventura) {
        this.inventura = inventura;
    }
    
    @Override
    public String toString() {
        return "zasilkaID: '" + zasilkaID + 
                "' je zahrnuta do inventury: '" + inventura + "'";
    }    
    
}
