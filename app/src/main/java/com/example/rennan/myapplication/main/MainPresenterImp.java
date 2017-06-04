package com.example.rennan.myapplication.main;

/**
 * Created by Rennan on 04/06/2017.
 */

public class MainPresenterImp implements MainMVP.Presenter{

    private MainMVP.View view;
    private MainMVP.Model model;

    public MainPresenterImp(MainMVP.View view) {
        this.view = view;
        this.model = new MainModelImp(this);
    }

    @Override
    public void onDestroy() {
        model.onDestroy();
        model = null;
        view = null;
    }

    @Override
    public void showText(CharSequence text) {
        String str = model.showText(text.toString());
        view.changeText(str);
    }

    @Override
    public void showText2x(CharSequence text) {
        String str = model.showText2x(text.toString());
        view.changeText(str);
    }

    @Override
    public void invertText(CharSequence text) {
        String str = model.invertText(text.toString());
        view.changeText(str);
    }
}
