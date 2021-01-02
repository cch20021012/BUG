package com.example.gug.psy.bean;

public class ParentBean {
    private String courseName;
    private int progress;
    private String state;
    private String time;

    public ParentBean(String courseName, int progress, String state, String time) {
        this.courseName = courseName;
        this.progress = progress;
        this.state = state;
        this.time = time;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getProgress() {
        return progress;
    }

    public String getState() {
        return state;
    }

    public String getTime() {
        return time;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
