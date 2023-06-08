package com.kadirgurturk.Composite;

abstract public class Paper implements PaperWork{

    protected String name;
    protected String description;

    public Paper(String name, String description) {
        this.name = name;
        this.description = description;
    }



}
