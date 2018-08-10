package zasilkovysklad.dl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * Trida reprezentujici konkretni instanci Pozice balicku ( konkretni radek v tabulce Pozice ).
 * 
 * @author Honza
 */
@Entity
@Table(name="Pozice")
public class Pozice {
    /**
    * Jendoznacný identifikator pozice.
    */
    @Id
    @Column(name="POZICEID")
    private String poziceID;
    
    @Column(name="Patro")
    private String patro;
    
    @Column(name="Sektor")
    private String sektor;
    
    /**
    * Zasilka umistena na teto pozici.
    */
    @OneToOne
    @JoinColumn(name="ZasilkaID")
    private Zasilka zasilka;
    
    /**
    * Regal, ve kterem je tato pozice.
    */
    @ManyToOne
    @JoinColumn(name="RegalID")
    private Regal regal;
    
    public Pozice() {
        
    }

    public Pozice(String patro, String sektor, Zasilka zasilka, Regal regal) {
        this.patro = patro;
        this.sektor = sektor;
        this.zasilka = zasilka;
        this.regal = regal;
    }

    public String getPoziceID() {
        return poziceID;
    }

    public void setPoziceID(String poziceID) {
        this.poziceID = poziceID;
    }

    public String getPatro() {
        return patro;
    }

    public void setPatro(String patro) {
        this.patro = patro;
    }

    public String getSektor() {
        return sektor;
    }

    public void setSektor(String sektor) {
        this.sektor = sektor;
    }

    public Zasilka getZasilka() {
        return zasilka;
    }

    public void setZasilka(Zasilka zasilka) {
        this.zasilka = zasilka;
    }
    
    public Regal getRegal() {
        return regal;
    }

    public void setRegal(Regal regal) {
        this.regal = regal;
    }

    @Override
    public String toString() {
        int zasID;
        try{
            zasID = zasilka.getZasilkaID();
        }
        catch(Exception exc){
            zasID=0;
        }
        
        return "Pozice '" + poziceID + "' => sekce: '" + regal.getSekce().getSekceID() + "', regal: '" + regal.getRegalID()
                + "', sektor: '" + sektor + "', patro: '" + patro + "'" ;
    }
    
    
   
}
