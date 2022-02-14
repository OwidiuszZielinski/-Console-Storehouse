package pl.owi;



//wzorzec projektowy fabryka,statyczny obiekt typu Storehouse o nazwie store house

public class Storehousefactory {

    private static Storehouse storehouse;
    //deklaruje obiekt storehouse klasy/typu Storehouse

    //Tworze singleton typu Storehouse jest on zawsze statyczny i ma nazwe getInstancje
    //Singleton sprawdza czy obiekt storehouse posiada wartosc null jestli tak to tworzy nowy obiek storehouse oraz
    //zwraca storehouse
    public static Storehouse getInstance(){
        if (storehouse == null){
            storehouse = new Storehouse();
	}

        return storehouse;
    }

}





