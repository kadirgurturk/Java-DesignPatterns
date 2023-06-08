package com.kadirgurturk.Builder;

import java.time.LocalDate;

public class Product {
    public Long id;
    public int Stock;
    public LocalDate date;
    public String Name;
    public int price;

    public Product() {

    }

    public class Builder{
        public Long id;
        public int Stock;
        public LocalDate date;
        public String Name;
        public int price;

        public Builder id(Long id)
        {
            this.id = id;
            return this;
        }
    }
}
