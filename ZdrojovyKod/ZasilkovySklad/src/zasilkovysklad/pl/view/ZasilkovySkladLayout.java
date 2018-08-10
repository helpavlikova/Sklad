package zasilkovysklad.pl.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import zasilkovysklad.pl.controller.MainWindowController;

/**
 * JavaFX vyzaduje spustit GUI prepsanim metody start. Z tohodo duvodu je vytvorena
 * nadtrida pro zasilkový sklad (ZasilkovySkladLayout) ktera definuje tyto nezbytnosti
 * spojene s nactenim GUI. Hlavni trida ZasilkovySklad tak muze zustat v cistsi podobe.
 
 */

public class ZasilkovySkladLayout extends Application {

    public static FXMLLoader loader;
    public static Parent root;
    public static MainWindowController controller;

    /**
     * Funkce zahajujici spusteni gui s pomoci JavaFX.
     * @param stage
     * @throws Exception 
     */
    @Override
    public void start(Stage stage) throws Exception {
        
        loader = new FXMLLoader(getClass().getResource("pl/view/mainWindow.fxml"));
        root = loader.load();
        controller = loader.getController();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Sklad");
        stage.show();

    }
}
