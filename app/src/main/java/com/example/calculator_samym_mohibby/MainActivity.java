package com.example.calculator_samym_mohibby;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);
            
        }
        public void Summa(View v) {
        EditText editText1 = (EditText) findViewById(R.id.editFirstNumber);
        EditText editText2 = (EditText) findViewById(R.id.editSecondNumber);
        EditText editText3 = (EditText) findViewById(R.id.textSeeResult);

        int ekaLuku = Integer.parseInt(editText1.getText().toString());
        int tokaLuku = Integer.parseInt(editText2.getText().toString());
        int tulos = ekaLuku+tokaLuku;
            editText3.setText(String.valueOf(tulos));
        }

    public void Erotus(View v) {
        EditText editText1 = (EditText) findViewById(R.id.editFirstNumber);
        EditText editText2 = (EditText) findViewById(R.id.editSecondNumber);
        EditText editText3 = (EditText) findViewById(R.id.textSeeResult);

        int ekaLuku = Integer.parseInt(editText1.getText().toString());
        int tokaLuku = Integer.parseInt(editText2.getText().toString());
        int tulos = ekaLuku-tokaLuku;
        editText3.setText(String.valueOf(tulos));
    }
    public void Tulo(View v) {
        EditText editText1 = (EditText) findViewById(R.id.editFirstNumber);
        EditText editText2 = (EditText) findViewById(R.id.editSecondNumber);
        EditText editText3 = (EditText) findViewById(R.id.textSeeResult);

        int ekaLuku = Integer.parseInt(editText1.getText().toString());
        int tokaLuku = Integer.parseInt(editText2.getText().toString());
        int tulos = ekaLuku*tokaLuku;
        editText3.setText(String.valueOf(tulos));
    }
    public void Osamaara(View v) {
        EditText editText1 = (EditText) findViewById(R.id.editFirstNumber);
        EditText editText2 = (EditText) findViewById(R.id.editSecondNumber);
        EditText editText3 = (EditText) findViewById(R.id.textSeeResult);

        int ekaLuku = Integer.parseInt(editText1.getText().toString());
        int tokaLuku = Integer.parseInt(editText2.getText().toString());
        int tulos = ekaLuku/tokaLuku;
        editText3.setText(String.valueOf(tulos));
    }
    }
