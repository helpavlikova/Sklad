package zasilkovysklad.dl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * Trida reprezentujici konkretni instanci Regalu ( konkretni radek v tabulce Regal ).
 * 
 * @author Honza
 */
@Entity
@Table(name="Regal")
public class Regal {
    
    @Id
    @Column(name="RegalID")
    private int regalID;
    
    @Column(name="Nosnost")
    private double nosnost;
    
    @Column(name="Oznaceni")
    private String oznaceni;
  
    @Column(name="POPIS")
    private String popis;
    
    @ManyToOne
    @JoinColumn(name="STAV")
    private StavRegalu stav;
    
    @ManyToOne
    @JoinColumn(name="SekceID")
    private Sekce sekce;

    public Regal() {
        
    }
    
    public Regal(double nosnost, String oznaceni, String popis, StavRegalu stav, Sekce sekce) {
        this.nosnost = nosnost;
        this.oznaceni = oznaceni;
        this.popis = popis;
        this.stav = stav;
        this.sekce = sekce;
    }

    public int getRegalID() {
        return regalID;
    }

    public void setRegalID(int regalID) {
        this.regalID = regalID;
    }

    public double getNosnost() {
        return nosnost;
    }

    public void setNosnost(double nosnost) {
        this.nosnost = nosnost;
    }

    public String getOznaceni() {
        return oznaceni;
    }

    public void setOznaceni(String oznaceni) {
        this.oznaceni = oznaceni;
    }

    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }

    public StavRegalu getStav() {
        return stav;
    }

    public void setStav(StavRegalu stav) {
        this.stav = stav;
    }

    public Sekce getSekce() {
        return sekce;
    }

    public void setSekce(Sekce sekce) {
        this.sekce = sekce;
    }
    
    @Override
    public String toString() {
        return "Regal: '" + regalID + "', v sekci: '" + sekce.getSekceID() + "', oznaceni: '" + oznaceni + ", stav: '" + stav + "'";
    }
    
}
