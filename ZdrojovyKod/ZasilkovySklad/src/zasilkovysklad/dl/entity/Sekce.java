package zasilkovysklad.dl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * Trida reprezentujici konkretni instanci Sekce ( konkretni radek v tabulce Sekce ).
 * 
 * @author Honza
 */
@Entity
@Table(name="Sekce")
public class Sekce {
    /**
    * Jendoznacný identifikator sekce.
    */
    @Id
    @Column(name="SekceID")
    private int sekceID;

    @Column(name="POPIS")
    private String popis;

    @Column(name="Oznaceni")
    private String oznaceni;

    public Sekce() {
        
    }
    
    public Sekce(String popis, String oznaceni) {
    this.popis = popis;
    this.oznaceni = oznaceni;
    }
    
    public int getSekceID() {
        return sekceID;
    }
    
    public void setSekceID(int sekceID) {
        this.sekceID = sekceID;
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
    
    @Override
    public String toString() {
        return "SekceID: '" + sekceID + "', popis: '" + popis + "', oznaceni: '"+ oznaceni + "'";
    } 
}
