package com.kadirgurturk.Factory.Coffes;


import com.kadirgurturk.Factory.CoffeTypes;
import com.kadirgurturk.Factory.ICoffe;
import com.kadirgurturk.Factory.SizeType;

public class Filter implements ICoffe {
    private final CoffeTypes coffeType;
    private final SizeType size;

    public Filter( SizeType size) {
        this.coffeType = CoffeTypes.FILTER;
        this.size = size;
    }

    @Override
    public CoffeTypes getCoffeType() {
        return coffeType;
    }

    @Override
    public SizeType getSizeType() {
        return size;
    }

    @Override
    public String toString() {
        return String.format("Benim Kahvem " + coffeType + " Boyu ise " + size);
    }
}
