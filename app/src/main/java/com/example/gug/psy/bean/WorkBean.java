package com.example.gug.psy.bean;

public class WorkBean {
    private String img;
    private String name;
    private String Data;
    private String ClassNum;

    public WorkBean(String img, String name, String data, String classNum) {
        this.img = img;
        this.name = name;
        Data = data;
        ClassNum = classNum;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getData() {
        return Data;
    }

    public void setData(String data) {
        Data = data;
    }

    public String getClassNum() {
        return ClassNum;
    }

    public void setClassNum(String classNum) {
        ClassNum = classNum;
    }

    @Override
    public String toString() {
        return "WorkBean{" +
                "img='" + img + '\'' +
                ", name='" + name + '\'' +
                ", Data='" + Data + '\'' +
                ", ClassNum='" + ClassNum + '\'' +
                '}';
    }
}
