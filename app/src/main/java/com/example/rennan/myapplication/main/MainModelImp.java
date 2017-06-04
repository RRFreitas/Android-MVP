package com.example.rennan.myapplication.main;

/**
 * Created by Rennan on 04/06/2017.
 */

public class MainModelImp implements MainMVP.Model{

    private MainMVP.Presenter presenter;

    public MainModelImp(MainMVP.Presenter presenter) {
        this.presenter = presenter;
    }

    @Override
    public void onDestroy() {
        presenter = null;
    }

    @Override
    public String showText(String text) {
        return text;
    }

    @Override
    public String showText2x(String text) {
        return text + text;
    }

    @Override
    public String invertText(String text) {
        StringBuilder sb = new StringBuilder(text);
        sb.reverse();

        return sb.toString();
    }
}
