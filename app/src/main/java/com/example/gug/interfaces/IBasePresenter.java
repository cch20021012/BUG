package com.example.gug.interfaces;

public interface IBasePresenter<V extends IBaseView> {

    void attachView(V view);

    void unAttachView();

}
