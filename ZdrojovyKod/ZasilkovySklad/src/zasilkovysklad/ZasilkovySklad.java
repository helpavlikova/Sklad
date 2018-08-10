package zasilkovysklad;

import zasilkovysklad.pl.view.ZasilkovySkladLayout;
import static javafx.application.Application.launch;

/**
 * Trida umoznujici spustit aplikaci pro zasilkový sklad.
 *
 * @author Mira
 */
public class ZasilkovySklad extends ZasilkovySkladLayout {

    /**
     * Metoda umoznujici spustit aplikaci pro zasilkový sklad.
     *
     * @param args parametry prikazove radky
     */
    public static void main(String[] args) {
        System.out.println("Spoustim program Zasilkovy sklad.");

        launch(args);

        controller.onShutDown();
    }

}
