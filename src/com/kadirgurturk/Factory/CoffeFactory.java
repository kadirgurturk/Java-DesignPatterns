package com.kadirgurturk.Factory;


import com.kadirgurturk.Factory.Coffes.Americano;
import com.kadirgurturk.Factory.Coffes.Filter;
import com.kadirgurturk.Factory.Coffes.Latte;

public class CoffeFactory {

    public static ICoffe of(CoffeTypes type, SizeType size)
    {
        switch (type){
            case AMERICANO -> {return new Americano(size);}
            case LATTE -> {return new Latte(size);}
            default -> {return new Filter(SizeType.GRANDE);}
            }

    }
}

