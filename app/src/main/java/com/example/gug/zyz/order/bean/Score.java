package com.example.gug.zyz.order.bean;

public class Score {
    private String title;
    private String time;
    private String num;

    public Score(String title, String time, String num) {
        this.title = title;
        this.time = time;
        this.num = num;
    }

    @Override
    public String toString() {
        return "Score{" +
                "title='" + title + '\'' +
                ", time='" + time + '\'' +
                ", num='" + num + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
