package pl.owi;

import java.util.ArrayList;

public class Storehousefactory {
    private static Storehouse storehouse;


    public static Storehouse getInstance(){
        if (storehouse == null);
        storehouse = new Storehouse();

        return storehouse;
    }

}





