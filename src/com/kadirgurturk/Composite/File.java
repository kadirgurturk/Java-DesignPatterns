package com.kadirgurturk.Composite;

public class File extends Paper{

    public File(String name, String description) {
        super(name, description);
    }

    @Override
    public void displayPaperWork() {

        System.out.printf("Dosya Tutanağı : %-25s%n", super.description);

    }

    @Override
    public void displayName() {
        System.out.printf("Dosya Adı : %-25s%n", super.description);
    }
}
