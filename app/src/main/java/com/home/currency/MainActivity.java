package com.home.currency;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    private EditText ed_ntd;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ed_ntd = findViewById(R.id.ntd);

    }

    public void calculate(View view)
    {
        if (ed_ntd.getText().toString().length()==0)
        {
            showAlert(getString(R.string.problem),getString(R.string.pleace_enter_your_ntd));
        }else
        {
            String ntdString = ed_ntd.getText().toString();
            float ntd = Float.parseFloat(ntdString);
            float us = (float) (ntd/ 30.9);
            showAlert(getString(R.string.result),getString(R.string.usd_is)+us);
        }

    }

    private void showAlert(String title , String message)
    {
        new AlertDialog.Builder(this)
                .setTitle(title)
                .setMessage(message)
                .setPositiveButton(R.string.ok,null)
                .show()
        ;
    }
}
