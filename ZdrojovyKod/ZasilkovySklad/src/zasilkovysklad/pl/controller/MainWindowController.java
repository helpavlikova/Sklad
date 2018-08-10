package zasilkovysklad.pl.controller;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import zasilkovysklad.dl.entity.Pozice;
import zasilkovysklad.dl.entity.Zasilka;
import zasilkovysklad.dl.dao.hibernate.HibernateUtil;
import zasilkovysklad.dl.dao.hibernate.PoziceDAO;
import zasilkovysklad.dl.dao.hibernate.ZasilkaDAO;

/**
 * FXML Controller class
 *
 * @author Hell
 */
public class MainWindowController implements Initializable {

    /**
     * Promenna zastupujici seznam pozic v gui.
     */
    @FXML
    private ListView<Pozice> skladList;
    /**
     * Promenna zastupujici seznam volných zasilek v gui.
     */
    @FXML
    private ListView<Zasilka> packageList;
    /**
     * Promenna zastupujici stavový radek v gui.
     */
    @FXML
    private Label statusField;
    /**
     * Promenna umoznujici kontakt s databazi pres spring.
     */
    private ClassPathXmlApplicationContext context;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        context = new ClassPathXmlApplicationContext("/zasilkovysklad/resources/spring.xml");
    }
    /**
     * Funkce obsluhujici tlacitko "Nalezt zasilky".
     * @param event Event stisknuti tlacitka
     */
    @FXML
    private void findPackageButtonHandler(ActionEvent event) {
        listPackages();
    }
    /**
     * Funkce vypisujici volne zasilky z databaze.
     */
    private void listPackages(){      
        if (!HibernateUtil.isDBConnected()) {
            statusField.setText("Problem spojeni s databazi.");
            return;
        }
        
        //vycisteni seznamu, aby se pri opakovanem stisknuti tlacitka neduplikovala vypsana data
        packageList.getItems().clear();

        List<Zasilka> vsechnyZasilkyEmpty = context.getBean(ZasilkaDAO.class).getAllUnpositioned();
        
        //Vlozeni seznamu volných mist do pripraveneho zobrazeni v gui.
        for (Zasilka tempZasilka : vsechnyZasilkyEmpty) {
            packageList.getItems().addAll(tempZasilka);
        }
    }
    /**
     * Funkce obsluhujici tlacitko "Nalezt volne pozice".
     * @param event Event stisknuti tlacitka
     */
    @FXML
    private void positionButtonHandler(ActionEvent event) {
        listPositions();
    }
    /**
     * Funkce vypisujici volne pozice z databaze.
     */
    private void listPositions(){    
        if (!HibernateUtil.isDBConnected()) {
            statusField.setText("Problem spojeni s databazi.");
            return;
        }
        
        //vycisteni seznamu, aby se pri opakovanem stisknuti tlacitka neduplikovala vypsana data
        skladList.getItems().clear();

        
        List<Pozice> vsechnyPoziceEmpty = context.getBean(PoziceDAO.class).getAllEmpty();
        
        //Vlozeni seznamu zasilek do pripraveneho zobrazeni v gui.
        for (Pozice tempPozice : vsechnyPoziceEmpty) {
            skladList.getItems().addAll(tempPozice);
        }
    }

    /**
     * Funkce obsluhujici tlacitko "Priradit zasilku".
     * @param event Event stisknuti tlacitka
     */
    @FXML
    private void setPositionButtonHandler(ActionEvent event) {
        if (!HibernateUtil.isDBConnected()) {
            statusField.setText("Problem spojeni s databazi.");
            return;
        }
        //kontrola, zda jsou vubec vybrana nejaka data
        if(skladList.getSelectionModel().getSelectedItem() == null ||
            packageList.getSelectionModel().getSelectedItem() == null){
            statusField.setText("Vyberte prosim pozici a zasilku ze seznamu.");
            return;
        }
        
        String poziceID = skladList.getSelectionModel().getSelectedItem().getPoziceID();        
        int zasilkaID = packageList.getSelectionModel().getSelectedItem().getZasilkaID();
                
        
        statusField.setText("Prirazuji zasilku " + zasilkaID + " na pozici " + poziceID);
        
        context.getBean(PoziceDAO.class).assignPackage(poziceID, zasilkaID);
        
        //obnoveni seznamu
        listPackages();
        listPositions();
       
    }
    /**
     * Funkce probihajici po uzavreni gui.
     */
    public void onShutDown() {
        context.close();
        if (HibernateUtil.isDBConnected()) {
            HibernateUtil.close();
        }
    }

}
