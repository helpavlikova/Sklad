package zasilkovysklad.dl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * Trida reprezentujici konkretni instanci Zakaznika ( konkretni radek v tabulce Zakaznik ).
 * 
 * @author Bob
 */
@Entity
@Table(name="Zakaznik")
public class Zakaznik {
    /**
    * Jendoznacný identifikator zakaznika.
    */
    @Id
    @Column(name="ZakaznikID")
    private int zakaznikID;

    @OneToOne
    private Benefit benefit;
    
    @Column(name="Email")
    private String email;
    
    /**
    * Identifikacni cislo firmy, pokud zakaznik vystupuje jako pravnicka osoba.
    */
    @Column(name="IC")
    private int ic;
    
    @Column(name="Telcislo")
    private int telcislo;
    
    @OneToOne
    private Osoba osobaID;
    
    
    public Zakaznik() {
        
    }

    public Zakaznik(int zakaznikID, Benefit benefit, String email, int ic, int telcislo, Osoba osobaID) {
        this.zakaznikID = zakaznikID;
        this.benefit = benefit;
        this.email = email;
        this.ic = ic;
        this.telcislo = telcislo;
        this.osobaID = osobaID;
    }

    public int getZakaznikID() {
        return zakaznikID;
    }

    public void setZakaznikID(int zakaznikID) {
        this.zakaznikID = zakaznikID;
    }

    public Benefit getBenefit() {
        return benefit;
    }

    public void setBenefit(Benefit benefit) {
        this.benefit = benefit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIc() {
        return ic;
    }

    public void setIc(int ic) {
        this.ic = ic;
    }

    public int getTelcislo() {
        return telcislo;
    }

    public void setTelcislo(int telcislo) {
        this.telcislo = telcislo;
    }

    public Osoba getOsobaID() {
        return osobaID;
    }

    public void setOsobaID(Osoba osobaID) {
        this.osobaID = osobaID;
    }

    
    @Override
    public String toString() {
        return "Zakaznik: '" + zakaznikID + "', benefit: '" + benefit + 
                 "', email: '" + email +  "', ic: '" + ic + 
                 "', telcislo: '" + telcislo +  "', osobaID: '" + osobaID + "'";
    }    
    
}
