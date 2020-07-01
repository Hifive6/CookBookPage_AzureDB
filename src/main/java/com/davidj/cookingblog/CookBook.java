package com.davidj.cookingblog;

import java.util.Arrays;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class CookBook {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "title")
    private String bakeTitle;

    @Column(name = "description")
    private String bakeDescription;

    @Lob
    @Column(name = "images")
    private byte[] bakeImages;

    public CookBook() {
    }

    public CookBook(String bakeTitle, String bakeDescription, byte[] bakeImages) {
        this.bakeTitle = bakeTitle;
        this.bakeDescription = bakeDescription;
        this.bakeImages = bakeImages;
    }

    public String getBakeTitle() {
        return bakeTitle;
    }

    public void setBakeTitle(String bakeTitle) {
        this.bakeTitle = bakeTitle;
    }

    public String getBakeDescription() {
        return bakeDescription;
    }

    public void setBakeDescription(String bakeDescription) {
        this.bakeDescription = bakeDescription;
    }

    public byte[] getBakeImages() {
        return bakeImages;
    }

    public void setBakeImages(byte[] bakeImages) {
        this.bakeImages = bakeImages;
    }

    @Override
    public String toString() {
        return "CookBook [bakeDescription=" + bakeDescription + ", bakeImages=" + Arrays.toString(bakeImages)
                + ", bakeTitle=" + bakeTitle + ", id=" + id + "]";
    }

   


}