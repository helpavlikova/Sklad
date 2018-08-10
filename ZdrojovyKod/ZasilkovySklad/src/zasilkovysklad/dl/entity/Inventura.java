package zasilkovysklad.dl.entity;

import java.util.GregorianCalendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * Trida reprezentujici konkretni instanci Inventury ( konkretni radek v tabulce Inventura ).
 * 
 * @author Bob
 */
@Entity
@Table(name="Inventura")
public class Inventura {
    /**
    * Jendoznacný identifikator inventury.
    */
    @Id
    @Column(name="CISLOINVENTURY")
    private int cisloinventury;
    
    @Column(name="Datumporizeni")
    private GregorianCalendar datumporizeni;
    
    @Column(name="Dodata")
    private GregorianCalendar dodata;
    
    @Column(name="Oddata")
    private GregorianCalendar oddata;
    
    @Column(name="Popis")
    private String popis;
    
    public Inventura() {
        
    }
    
    public Inventura(int cisloinventury, GregorianCalendar datumporizeni, 
                  GregorianCalendar dodata, GregorianCalendar oddata, String popis) {
        this.cisloinventury = cisloinventury;
        this.datumporizeni = datumporizeni;
        this.dodata = dodata;
        this.oddata = oddata;
        this.popis = popis;
    }

    public int getCisloinventury() {
        return cisloinventury;
    }

    public void setCisloinventury(int cisloinventury) {
        this.cisloinventury = cisloinventury;
    }

    public GregorianCalendar getDatumporizeni() {
        return datumporizeni;
    }

    public void setDatumporizeni(GregorianCalendar datumporizeni) {
        this.datumporizeni = datumporizeni;
    }
    
    public GregorianCalendar getDodata() {
        return dodata;
    }

    public void setDodata(GregorianCalendar dodata) {
        this.dodata = dodata;
    }
    
    public GregorianCalendar getOddata() {
        return oddata;
    }

    public void setOddata(GregorianCalendar oddata) {
        this.oddata = oddata;
    }
    
    public String getPopis() {
        return popis;
    }

    public void setPopis(String popis) {
        this.popis = popis;
    }
    
    @Override
    public String toString() {
        return "Inventura: '" + cisloinventury + "', datumporizeni: '" + datumporizeni + 
                 "', dodata: '" + dodata +  "', oddata: '" + oddata + 
                 "', popis: '" + popis + "'";
    }    
    
}
