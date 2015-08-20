package com.esdesign.vietnamz.Home_Ativity;

/**
 * Created by ES on 18/08/2015.
 */
public class GridviewEntity {
    private String name;
    private String Description;
    private int image;

    public GridviewEntity(String name, String description, int image) {
        this.name = name;
        Description = description;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
