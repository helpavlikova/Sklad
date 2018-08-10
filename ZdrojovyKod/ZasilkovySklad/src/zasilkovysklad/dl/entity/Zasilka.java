package zasilkovysklad.dl.entity;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * Trida reprezentujici konkretni instanci Zasilky ( konkretni radek v tabulce Zasilka ).
 * 
 * @author Honza
 */
@Entity
@Table(name="Zasilka")
public class Zasilka {
    /**
    * Jendoznacný identifikator zasilky.
    */
    @Id
    @Column(name="ZasilkaID")
    private int zasilkaID;
    
    @Column(name="Datumprijeti")
    private GregorianCalendar datumPrijeti;
    
    @Column(name="Datumvydani")
    private GregorianCalendar datumVydani;

    @ManyToOne
    @JoinColumn(name="ODESILATEL", insertable=false, updatable=false )
    private Osoba odesilatel;
    
    @ManyToOne
    @JoinColumn(name="PRIJEMCE", insertable=false, updatable=false )
    private Osoba prijemce;

    @Column(name="Hmotnost")
    private double hmotnost;
    
    @Column(name="Kodzasilky")
    private String kodZasilky;

    @ManyToOne
    @JoinColumn(name="KREHKOST")
    private Krehkost krehkost;
    
    @ManyToOne
    @JoinColumn(name="STAV")
    private StavZasilky stavZasilky;

    public Zasilka() {
    }

    
    public Zasilka(int zasilkaID, GregorianCalendar datumPrijeti, GregorianCalendar datumVydani, Osoba odesilatel, Osoba prijemce, double hmotnost, String kodZasilky/*, Krehkost krehkost, StavZasilky stavZasilky*/) {
        this.zasilkaID = zasilkaID;
        this.datumPrijeti = datumPrijeti;
        this.datumVydani = datumVydani;
        this.odesilatel = odesilatel;
        this.prijemce = prijemce;
        this.hmotnost = hmotnost;
        this.kodZasilky = kodZasilky;
        this.krehkost = krehkost;
        this.stavZasilky = stavZasilky;
    }

    public int getZasilkaID() {
        return zasilkaID;
    }

    public void setZasilkaID(int zasilkaID) {
        this.zasilkaID = zasilkaID;
    }

    public GregorianCalendar getDatumPrijeti() {
        return datumPrijeti;
    }

    public void setDatumPrijeti(GregorianCalendar datumPrijeti) {
        this.datumPrijeti = datumPrijeti;
    }

    public GregorianCalendar getDatumVydani() {
        return datumVydani;
    }

    public void setDatumVydani(GregorianCalendar datumVydani) {
        this.datumVydani = datumVydani;
    }

    public Osoba getOdesilatel() {
        return odesilatel;
    }

    public void setOdesilatel(Osoba odesilatel) {
        this.odesilatel = odesilatel;
    }

    public Osoba getPrijemce() {
        return prijemce;
    }

    public void setPrijemce(Osoba prijemce) {
        this.prijemce = prijemce;
    }

    public double getHmotnost() {
        return hmotnost;
    }

    public void setHmotnost(double hmotnost) {
        this.hmotnost = hmotnost;
    }

    public String getKodZasilky() {
        return kodZasilky;
    }

    public void setKodZasilky(String kodZasilky) {
        this.kodZasilky = kodZasilky;
    }
    
    public Krehkost getKrehkost() {
        return krehkost;
    }

    public void setKrehkost(Krehkost krehkost) {
        this.krehkost = krehkost;
    }

    public StavZasilky getStavZasilky() {
        return stavZasilky;
    }

    public void setStavZasilky(StavZasilky stavZasilky) {
        this.stavZasilky = stavZasilky;
    }

    @Override
    public String toString() {
        SimpleDateFormat fmt = new SimpleDateFormat("dd.MM.yyyy");
        
        String datumVydaniPrintable;
        
        try {
            datumVydaniPrintable = fmt.format(datumVydani.getTime());
        } 
        catch (Exception exc) {
            datumVydaniPrintable = "null";
        }

        return "Zasilka '" + zasilkaID + "' => datumPrijeti: '" + fmt.format(datumPrijeti.getTime())
                + "', datumVydani: '" + datumVydaniPrintable
                + "', odesilatel: '" + odesilatel.getOsobaID() + " - " + odesilatel.getJmeno() + " " + odesilatel.getPrijmeni()
                + "', prijemce: '" + prijemce.getOsobaID() + " - " + prijemce.getJmeno() + " " + prijemce.getPrijmeni()
                + "', " + stavZasilky.getStav();
    }
}
