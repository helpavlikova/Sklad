/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zasilkovysklad.dl.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * Trida reprezentujici konkretni instanci Zamestnanec ( konkretni radek v tabulce Zamestnanec ).
 * 
 * @author Bob
 */
@Entity
@Table(name="Zamestnanec")
public class Zamestnanec {
    /**
    * Jendoznacný identifikator zamestnance.
    */
    @Id
    @Column(name="ZamestnanecID")
    private int zamestnanecID;
    
    @OneToOne
    private PoziceZamestnance pozice;
    
    @Column(name="Email")
    private String email;
    
    @OneToOne
    private Login username;
    
    @Column(name="Telcislo")
    private int telcislo;
    
    @OneToOne
    private Osoba osobaID;
    
    
    public Zamestnanec() {
        
    }

    public Zamestnanec(int zamestnanecID, PoziceZamestnance pozice, String email, Login username, int telcislo, Osoba osobaID) {
        this.zamestnanecID = zamestnanecID;
        this.pozice = pozice;
        this.email = email;
        this.username = username;
        this.telcislo = telcislo;
        this.osobaID = osobaID;
    }

    public int getZamestnanecID() {
        return zamestnanecID;
    }

    public void setZamestnanecID(int zamestnanecID) {
        this.zamestnanecID = zamestnanecID;
    }

    public PoziceZamestnance getPozice() {
        return pozice;
    }

    public void setPozice(PoziceZamestnance pozice) {
        this.pozice = pozice;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Login getUsername() {
        return username;
    }

    public void setUsername(Login username) {
        this.username = username;
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
        return "Zamestnanec: '" + zamestnanecID + "', pozice: '" + pozice + 
                 "', email: '" + email +  "', username: '" + username + 
                 "', telcislo: '" + telcislo +  "', osobaID: '" + osobaID + "'";
    }    
    
}
