package com.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MyActivity extends Activity {
    private EditText a;
    private EditText b;
    private EditText c;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        a = (EditText) findViewById(R.id.a);
        b = (EditText) findViewById(R.id.b);
        c = (EditText) findViewById(R.id.c);
    }

    /**
     * При нажатии на кнопку "Сумма"
     *
     * @param v кнопка :)
     */
    public void calcSum(View v) {
        double ai = Double.parseDouble(a.getText().toString());
        double bi = Double.parseDouble(b.getText().toString());
        c.setText("" + (ai + bi));
    }
}
