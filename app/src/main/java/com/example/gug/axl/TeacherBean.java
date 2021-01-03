package com.example.gug.axl;

public class TeacherBean {
    private int image;
    private String title;
    private String name;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "TeacherBean{" +
                "image=" + image +
                ", title='" + title + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
