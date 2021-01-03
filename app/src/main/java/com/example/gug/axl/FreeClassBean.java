package com.example.gug.axl;

public class FreeClassBean {
    private int image;
    private String name;
    private String title;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "FreeClassBean{" +
                "image=" + image +
                ", name='" + name + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
