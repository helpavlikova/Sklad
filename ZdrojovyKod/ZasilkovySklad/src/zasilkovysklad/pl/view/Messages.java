package zasilkovysklad.pl.view;

import java.util.MissingResourceException;
import java.util.ResourceBundle;


/**
 * Trida slouzici pro nacitani prekladu uzivatelskeho rozhrani z externiho
 * souboru.
 *
 * @author Mira
 */
public class Messages {

    private static final String localeCZ = "zasilkovysklad.pl.view.messages_cz";
    private static final String localeEN = "zasilkovysklad.pl.view.messages_en";

    
    //** defauilt je cestina */
    private static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(localeCZ);
    
   // = ResourceBundle.getBundle(localeCZ);
    
    private static final ResourceBundle localeEN_RESOURCE_BUNDLE
            = ResourceBundle.getBundle(localeEN);

    public static void setLocale( String localeShortcut ) throws Exception{
        if( new String("en").equals(localeShortcut) )
            RESOURCE_BUNDLE = ResourceBundle.getBundle(localeEN);
        else if( new String("cz").equals(localeShortcut) )
            RESOURCE_BUNDLE = ResourceBundle.getBundle(localeCZ);
        else{
            throw new Exception( "Pozadovaný lokalizacni balicek nebyl nazelen.");
        }
    
    }
    
    public static String getString(final String key) {
        try {
            return RESOURCE_BUNDLE.getString(key);
        } catch (MissingResourceException e) {
            return '!' + key + '!';
        }
    }
    
    
     public static void main(String[] args) throws Exception {
     
         Messages m = new Messages();
         m.setLocale("en");
         System.out.println( Messages.getString("TLACITKO_ZPRACOVAT_VYTISK") );
         m.setLocale("cz");
         System.out.println( Messages.getString("TLACITKO_ZPRACOVAT_VYTISK") );
         
     
     }
}
