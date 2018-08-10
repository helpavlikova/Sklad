package test.dl;

import java.util.List;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import zasilkovysklad.dl.dao.hibernate.HibernateUtil;
import zasilkovysklad.dl.dao.hibernate.PoziceDAO;
import zasilkovysklad.dl.dao.hibernate.ZasilkaDAO;
import zasilkovysklad.dl.entity.Pozice;
import zasilkovysklad.dl.entity.Zasilka;

/**
 *
 * @author Honza
 */
public class dlTestMain {

    public static void main(String[] args) {
        System.out.println("Spoustim program Zasilkovy sklad.");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("/zasilkovysklad/resources/spring.xml");

        PoziceDAO daoPozice = context.getBean(PoziceDAO.class);
        ZasilkaDAO daoZasilka = context.getBean(ZasilkaDAO.class);

        List<Pozice> vsechnyPoziceEmpty = daoPozice.getAllEmpty();
        //Vypsani Listu volnych mist.
        System.out.println("----------------Prazdne pozice----------------");
        for (Pozice tempPozice : vsechnyPoziceEmpty) {
            System.out.println(tempPozice);
        }
        System.out.println("----------------------------------------------");

        List<Zasilka> vsechnyZasilky = daoZasilka.getAllUnpositioned();
        //Vypsani Listu volnych mist.
        System.out.println("----------------Neumistene zasilky----------------");
        for (Zasilka tempZasilky : vsechnyZasilky) {
            System.out.println(tempZasilky);
        }
        System.out.println("--------------------------------------------------");

        if (daoPozice.assignPackage("C-51-1-2C", 5)) {
            System.out.println("Zasilka prirazena na pozici!");
        } else {
            System.out.println("Nepodarilo se priradit zasilku, zkontrolujte udaje.");
        }

        List<Pozice> vsechnyPoziceEmpty2 = daoPozice.getAllEmpty();
        //Vypsani Listu volnych mist.
        System.out.println("----------------Prazdne pozice----------------");
        for (Pozice tempPozice : vsechnyPoziceEmpty2) {
            System.out.println(tempPozice);
        }
        System.out.println("----------------------------------------------");

        List<Zasilka> vsechnyZasilky2 = daoZasilka.getAllUnpositioned();
        //Vypsani Listu volnych mist.
        System.out.println("----------------Neumistene zasilky----------------");
        for (Zasilka tempZasilky : vsechnyZasilky2) {
            System.out.println(tempZasilky);
        }
        System.out.println("--------------------------------------------------");

    }

}
