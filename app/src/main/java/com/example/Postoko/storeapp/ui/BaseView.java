
package com.example.Postoko.storeapp.ui;


public interface BaseView<T extends BasePresenter> {

    void setPresenter(T presenter);
}
