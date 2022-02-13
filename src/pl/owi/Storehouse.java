package pl.owi;

import java.util.ArrayList;


public class Storehouse {


    ////SERVICE!!!////ZBIOR METOD////


    public ArrayList<ProductPC> listatowarow = new ArrayList<>();
    //Tworze prywatny obiekt Arrayliste klasy produkt pc nazwana listatowarow


    public final Integer wolnemiejsce = 2;

    //zmienna wolne miejsce final to znaczy ze nie bedzie zmieniac zadeklarowanej wartosci.

    Storehouse(){
        //pusty konstruktor po co ???????????????
        //ograniczenie dostepu ale dokladnie przeanalizuj - dopytac lorda

    }



    public void dodajelement(ProductPC nowy) {
        if (listatowarow.size() < wolnemiejsce) {
            listatowarow.add(nowy);

        } else {
            System.out.println("Magazyn przepelniony");
        }
        //metoda dodajelement o parametrze typu ProduktPC i nazwie nowy dlaczego parametr typu ProduktPC?
        //sprawdzamy ifem jego rozmiar i sprawdzamy czy jest mniejszy od wolnego miejsca
        //jesli jest mniejszy to dodajemy nowy towar, poniewaz mamy na to miejsce
        //jesli nie wyrzucamy komunikat "Magazyn przepelniony"

    }

    public void usunelement(int id) {
        //metoda usuwajaca elementy z listy jej paramater i zarazem deklaracja to zmienna int o nazwie id

        ///!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

        listatowarow.remove(id);

        //nazwa obiektu i metoda remove z parametrem podanym czyli id

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
                    + x.getCenanetto()+ " PLN "  + x.getVat() + " % " + x.getIlosc() + " szt.");

            // metoda wyswietlajaca liste, uzywamy petli for ( Dla pojedynczej zmiennej wyciagnietej z kolekcji typu ProductPC
            //o nazwie x przejsc po kolekcji listatowarow ???????????? ZROZUM
            //Wyswietlamy index elementu w kolekcji nazwa kolekcji po kropce metoda indexOF w parametrze wyciagniety element x
            //Wyswietlamy wyciagniety element x. Wartosc przypisana w setterach w main i opisty w klapkach

        }

    }

    public void pokazdlugosclisty() {
        System.out.println(listatowarow.size() < wolnemiejsce);
        System.out.println(wolnemiejsce - listatowarow.size());
    }

            //przedstawiamy ilosc elementow w kolekcji uzywamy nazwy listy i metody size przyrownujemy do wolnego miejsca
            //ktore jest zadeklarowane w klasie i posiada finalna wartosc w tym przypadku 2

    public void pokazcenebrutto(int id) {
        for (ProductPC x : listatowarow){
            float brutto = (x.getCenanetto().floatValue() * x.getVat().floatValue()/100 + x.getCenanetto().floatValue());
            System.out.println("Cena brutto to : " + brutto + "PLN");
        }
    }
            //metoda liczaca cene brutto danego towaru przy uzyciu petli for wyciagamy element z kolekcji i liczymy jego
            //cene brutto przez zwrocenie sie do zadeklarowanych setterem wartosci mnozymy cenne netto x stawke wat i dzielimy na 100


}
