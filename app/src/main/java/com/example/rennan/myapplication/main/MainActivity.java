package com.example.rennan.myapplication.main;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.rennan.myapplication.R;

public class MainActivity extends AppCompatActivity implements MainMVP.View{

    private MainPresenterImp presenterImp;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenterImp = new MainPresenterImp(this);
        editText = (EditText) findViewById(R.id.editText);
    }

    public void showText(View view) {
        presenterImp.showText(editText.getText());
    }

    public void showText2x(View view) {
        presenterImp.showText2x(editText.getText());
    }

    public void invertText(View view) {
        presenterImp.invertText(editText.getText());
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public Context getAppContext() {
        return getAppContext();
    }

    @Override
    public AppCompatActivity get() {
        return this;
    }

    @Override
    public void changeText(String text) {
        TextView tv = (TextView) findViewById(R.id.textView);
        tv.setText(text);
    }
}
