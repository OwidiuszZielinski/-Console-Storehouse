package pl.owi;

import java.util.ArrayList;
import pl.owi.ProductPC;

public class Storehouse {

    public String nazwa;
    public String nazwalisty;
    ArrayList<ProductPC> listatowarow;
    public final Integer wolnemiejsce = 2;
//lista storehouse ma byc trzymana w singletonie
    // dopisac logike licznia np brutto netto , ilosci
    Storehouse() {
        this.listatowarow = new ArrayList<ProductPC>();
    }

    public void dodajelement(String nazwa,String grupa,Integer cenanetto,Integer vat,Integer ilosc){
        if (this.listatowarow.size() < wolnemiejsce){
            this.listatowarow.add(new ProductPC(nazwa,grupa,cenanetto,vat,ilosc));

        }
        else{
            System.out.println("Magazyn przepelniony");


        }

        //przy wyswietlaniu listy wyswietlac id elementu
        //wtedy prosciej bedzie go wprowadzic do usuniecia
        //wyswietlic id idexOf w forze
    }

    public void pokazliste(){
        for (ProductPC x : this.listatowarow){
            System.out.println(x.getNazwa() + " " + x.getGrupa()+ " " + x.getCenanetto() + " " + x.getVat() + " " + x.getIlosc());
        }
    }

    public void pokazdlugosclisty(){
        System.out.println(this.listatowarow.size());

    }
}