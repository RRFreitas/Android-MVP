package com.example.rennan.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by Rennan on 03/06/2017.
 */

public interface MVPApp {
    interface Model{
        void onDestroy();
    }

    interface View{
        Context getContext();
        Context getAppContext();
        AppCompatActivity get();
    }

    interface Presenter{
        void onDestroy();
    }
}