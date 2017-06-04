package com.example.rennan.myapplication.main;

import com.example.rennan.myapplication.MVPApp;

/**
 * Created by Rennan on 03/06/2017.
 */

public interface MainMVP {

    interface Model extends MVPApp.Model {
        String showText(String text);
        String showText2x(String text);
        String invertText(String text);
    }

    interface View extends MVPApp.View {
        void changeText(String text);
    }

    interface Presenter extends MVPApp.Presenter {
        void showText(CharSequence text);
        void showText2x(CharSequence text);
        void invertText(CharSequence text);
    }
}
