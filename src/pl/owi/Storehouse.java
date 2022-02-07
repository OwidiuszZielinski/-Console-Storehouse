package pl.owi;

import java.util.ArrayList;
import pl.owi.ProductPC;

public class Storehouse {


    ProductPC productPC = new ProductPC();
    public String nazwa;
    public String nazwalisty;
    ArrayList<ProductPC> listatowarow;
    public final Integer wolnemiejsce = 2;
//lista storehouse ma byc trzymana w singletonie
    // dopisac logike licznia np brutto netto , ilosci
    Storehouse() {
        this.listatowarow = new ArrayList<ProductPC>();
    }
    public void dodajelement() {
        this.productPC = productPC;
        if (this.listatowarow.size() < wolnemiejsce) {
            this.listatowarow.add(new ProductPC());
        } else {
            System.out.println("Magazyn przepełniony");
        }

    public void dodajelement() {
        if (this.listatowarow.size() < wolnemiejsce) {
            this.listatowarow.add(new ProductPC());

        } else {
            System.out.println("Magazyn przepelniony");

            //Stworz produktpc w main uzywajac setterow i przeciaz metode dodajelement by przyjmowala obiekt klasy produktpc
            //jako paramter i dodawala go do listy
            //
        }



        //przy wyswietlaniu listy wyswietlac id elementu
        //wtedy prosciej bedzie go wprowadzic do usuniecia
        //wyswietlic id idexOf w forze


        public void pokazliste() {
            for (ProductPC x : this.listatowarow) {
                System.out.println(x.getNazwa() + " " + x.getGrupa() + " " + x.getCenanetto() + " " + x.getVat() + " " + x.getIlosc());
            }
        }

        public void pokazdlugosclisty() {
            System.out.println(this.listatowarow.size());

        }
}