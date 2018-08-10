package zasilkovysklad.dl.entity;

import java.util.GregorianCalendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * Trida reprezentujici konkretni instanci Osoby ( konkretni radek v tabulce Osoba ).
 * 
 * @author Bob
 */
@Entity
@Table(name="Osoba")
public class Osoba {
    /**
    * Jendoznacný identifikator osoby.
    */
    @Id
    @Column(name="OsobaID")
    private int osobaID;
    
    @Column(name="Jmeno")
    private String jmeno;
    
    @Column(name="Prijmeni")
    private String prijmeni;
    
    @Column(name="Rodnecislo")
    private int rodnecislo;
    
    /**
    * Dodaci adresa osoby.
    */
    @OneToOne
    @JoinColumn(name="AdresaID")
    private Adresa adresa;
    
    @Column(name="Datumnarozeni")
    private GregorianCalendar Datumnarozeni;
    
    public Osoba() {
        
    }

    public Osoba(int osobaID, String jmeno, String prijmeni, int rodnecislo, Adresa adresa, GregorianCalendar Datumnarozeni) {
        this.osobaID = osobaID;
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.rodnecislo = rodnecislo;
        this.adresa = adresa;
        this.Datumnarozeni = Datumnarozeni;
    }

    public int getOsobaID() {
        return osobaID;
    }

    public void setOsobaID(int osobaID) {
        this.osobaID = osobaID;
    }

    public String getJmeno() {
        return jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public String getPrijmeni() {
        return prijmeni;
    }

    public void setPrijmeni(String prijmeni) {
        this.prijmeni = prijmeni;
    }

    public int getRodnecislo() {
        return rodnecislo;
    }

    public void setRodnecislo(int rodnecislo) {
        this.rodnecislo = rodnecislo;
    }

    public Adresa getAdresa() {
        return adresa;
    }

    public void setAdresa(Adresa adresa) {
        this.adresa = adresa;
    }

    public GregorianCalendar getDatumnarozeni() {
        return Datumnarozeni;
    }

    public void setDatumnarozeni(GregorianCalendar Datumnarozeni) {
        this.Datumnarozeni = Datumnarozeni;
    }

    
    @Override
    public String toString() {
        return "Osoba: '" + osobaID + "', jmeno: '" + jmeno + 
                 "', prijmeni: '" + prijmeni +  "', rodnecislo: '" + rodnecislo + 
                 "', adresa: '" + adresa + "'";
    }    
    
}
