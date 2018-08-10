package zasilkovysklad.dl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * Trida reprezentujici konkretni instanci Adresy ( konkretni radek v tabulce Adresa ).
 * 
 * @author Bob
 */
@Entity
@Table(name="Adresa")
public class Adresa {
    /**
    * Jendoznacný identifikator adresy.
    */
    @Id
    @Column(name="AdresaID")
    private int adresaID;
    
    @Column(name="Obec")
    private String obec;
    
    @Column(name="Ulice")
    private String ulice;
    
    @Column(name="PSC")
    private int psc;
    
    @Column(name="Cislopopisne")
    private int cislopopisne;
    
    
    public Adresa() {
        
    }

    public Adresa(int adresaID, String obec, String ulice, int psc, int cislopopisne) {
        this.adresaID = adresaID;
        this.obec = obec;
        this.ulice = ulice;
        this.psc = psc;
        this.cislopopisne = cislopopisne;
    }

    public int getAdresaID() {
        return adresaID;
    }

    public void setAdresaID(int adresaID) {
        this.adresaID = adresaID;
    }

    public String getObec() {
        return obec;
    }

    public void setObec(String obec) {
        this.obec = obec;
    }
    
    public String getUlice() {
        return ulice;
    }

    public void setUlice(String ulice) {
        this.ulice = ulice;
    }
    
    public int getPSC() {
        return psc;
    }

    public void setPSC(int psc) {
        this.psc = psc;
    }
    
    public int getCislopopisne() {
        return cislopopisne;
    }

    public void setCislopopisne(int cislopopisne) {
        this.cislopopisne = cislopopisne;
    }
    
    @Override
    public String toString() {
        return "Adresa: '" + adresaID + "', Obec: '" + obec + 
                 "', ulice: '" + ulice +  "', psc: '" + psc + 
                 "', cislopopisne: '" + cislopopisne + "'";
    }    
    
}
