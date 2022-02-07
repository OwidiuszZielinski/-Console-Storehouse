package pl.owi;

import java.util.ArrayList;
import pl.owi.ProductPC;

public class Storehouse {


    public String nazwa;
    public String nazwalisty;
    private static ArrayList<ProductPC> listatowarow = null; // po co ten null?tworzymy singleton czyli zamykamy liste w private
    public final Integer wolnemiejsce = 2;






    //lista storehouse ma byc trzymana w singletonie
    // dopisac logike licznia np brutto netto , ilosci

   public Storehouse() {
        this.listatowarow = ProductPC.getInstance();


    }

    //metoda tworzenia listy
    public void nowalista(){
        this.listatowarow.add(new ProductPC());

    }






    public void dodajelement(ProductPC nowy) {
        if (this.listatowarow.size() < wolnemiejsce) {
            this.listatowarow.add(nowy);

        } else {
            System.out.println("Magazyn przepelniony");
        }
    }

        //public String tostring(){
        //return ("")


        public void dodajelement() {
            if (this.listatowarow.size() < wolnemiejsce) {
                this.listatowarow.add(new ProductPC());

            } else {
                System.out.println("Magazyn przepelniony");

                //Stworz produktpc w main uzywajac setterow i przeciaz metode dodajelement by przyjmowala obiekt klasy produktpc
                //jako paramter i dodawala go do listy
                //
            }

        }
            //przy wyswietlaniu listy wyswietlac id elementu
            //wtedy prosciej bedzie go wprowadzic do usuniecia
            //wyswietlic id idexOf w forze


            public void pokazliste() {
                for (ProductPC x : this.listatowarow) {
            //dodaj pokaz liste
                    System.out.println();
                }
            }

            public void pokazdlugosclisty() {
                System.out.println(this.listatowarow.size() < wolnemiejsce);
                System.out.println(wolnemiejsce - this.listatowarow.size());
            }
        }
