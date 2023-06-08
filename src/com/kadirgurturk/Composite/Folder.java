package com.kadirgurturk.Composite;

import java.util.ArrayList;

public class Folder extends Paper{

    private ArrayList<Paper> folderPapers;


    public Folder(String name, String description) {
        super(name, description);
        folderPapers = new ArrayList<>();

    }

    @Override
    public void displayPaperWork() {

        System.out.printf("Klasör Tutanağı : %-25s%n", super.description);

        folderPapers.forEach(paper ->  System.out.printf("Dosya Tutanağı : %-25s%n", paper.description));

    }

    @Override
    public void displayName() {

        System.out.printf("Klasör Adı : %-25s%n", super.description);

        folderPapers.forEach(paper ->  System.out.printf("Dosya Adı : %-25s%n", paper.name));

    }

    public ArrayList<Paper> getFolderPapers() {
        return folderPapers;
    }

    public void setFolderPapers(ArrayList<Paper> folderPapers) {
        this.folderPapers = folderPapers;
    }
}
