package pl.owi;

import java.util.ArrayList;
import pl.owi.ProductPC;

public class Storehouse {



    private  ArrayList<ProductPC> listatowarow = new ArrayList<>(); // po co ten null?tworzymy singleton czyli zamykamy liste w private
    public final Integer wolnemiejsce = 2;

    Storehouse(){

    }



    public void dodajelement(ProductPC nowy) {
        if (listatowarow.size() < wolnemiejsce) {
            listatowarow.add(nowy);

        } else {
            System.out.println("Magazyn przepelniony");
        }
    }

    //public String tostring(){
    //return ("")

    public void usunelement(int id) {


        ///!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        listatowarow.remove(id);


        System.out.println("Usunięto element o indeksie : " + id);




    }



    //Stworz produktpc w main uzywajac setterow i przeciaz metode dodajelement by przyjmowala obiekt klasy produktpc
    //jako paramter i dodawala go do listy


    //przy wyswietlaniu listy wyswietlac id elementu
    //wtedy prosciej bedzie go wprowadzic do usuniecia
    //wyswietlic id idexOf w forze


    public void pokazliste() {
        for (ProductPC x : listatowarow) {


            System.out.println("Indeks to : " + listatowarow.indexOf(x));

            //dodaj pokaz liste

            System.out.println("Przedmioty w magazynie to : " + x.getNazwa() + " " + x.getGrupa()+ " "
                    + x.getCenanetto()+ " "  + x.getVat() + " " + x.getIlosc());

        }

    }

    public void pokazdlugosclisty() {
        System.out.println(listatowarow.size() < wolnemiejsce);
        System.out.println(wolnemiejsce - listatowarow.size());
    }
}
