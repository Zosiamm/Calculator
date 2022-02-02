package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    public static double add(double a, double b){
        double wynik;
        wynik = a + b;
        return wynik;
    }

    public static double substract(double a, double b){
        double wynik;
        wynik = a - b;
        return wynik;
    }

    public static double multiple(double a, double b){
        double wynik;
        wynik = a * b;
        return wynik;
    }

    public static double divise(double a, double b){
        double wynik;
        wynik = a / b;
        return wynik;
    }

    public static double kwadrat(double a){
        return a*a;
    }

    public static double silnia(double a){
        double wyn = 1;
        for(int i = 2; i <= (int)a; i++){
            wyn *= i;
        }
        return wyn;
    }
    com.google.android.material.textfield.TextInputEditText wynik;
    String wyswietlacz = "0", l = "0";
    int n = 0;
    int oper = 0;
    double a = 1000000000, b, wyn;
    Button l1, l2, l3, l4, l5, l6, l7, l8, l9, l0, dot;
    Button ddo, dod, dmn, ddz, dpi, dkw, res, dsi;
    boolean czydot = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wynik = findViewById(R.id.result);
        l1 = findViewById(R.id.one);
        l2 = findViewById(R.id.two);
        l3 = findViewById(R.id.three);
        l4 = findViewById(R.id.four);
        l5 = findViewById(R.id.five);
        l6 = findViewById(R.id.six);
        l7 = findViewById(R.id.seven);
        l8 = findViewById(R.id.eight);
        l9 = findViewById(R.id.nine);
        l0 = findViewById(R.id.zero);
        dot = findViewById(R.id.dot);
        ddo = findViewById(R.id.plus);
        dod = findViewById(R.id.minus);
        dmn = findViewById(R.id.razy);
        ddz = findViewById(R.id.dziel);
        dpi = findViewById(R.id.sqrt);
        dkw = findViewById(R.id.kwa);
        dsi = findViewById(R.id.fact);
        res = findViewById(R.id.enter);
        l1.setOnClickListener(this::onClick);
        l2.setOnClickListener(this::onClick);
        l3.setOnClickListener(this::onClick);
        l4.setOnClickListener(this::onClick);
        l5.setOnClickListener(this::onClick);
        l6.setOnClickListener(this::onClick);
        l7.setOnClickListener(this::onClick);
        l8.setOnClickListener(this::onClick);
        l9.setOnClickListener(this::onClick);
        l0.setOnClickListener(this::onClick);
        dot.setOnClickListener(this::onClick);
        ddo.setOnClickListener(this::onClick);
        dod.setOnClickListener(this::onClick);
        dmn.setOnClickListener(this::onClick);
        ddz.setOnClickListener(this::onClick);
        dpi.setOnClickListener(this::onClick);
        dkw.setOnClickListener(this::onClick);
        dsi.setOnClickListener(this::onClick);
        res.setOnClickListener(this::onClick);
        wynik.setText(wyswietlacz);
    }
    public void onClick(View v){
        if(wyswietlacz.equals("0") || wyswietlacz.equals("limit cyfr to 19!")){
            wyswietlacz = "";
            l = "";
            czydot = false;
            n = 0;
        }
        System.out.println(czydot);
        if(wyswietlacz.equals(String.valueOf(wyn))){
            wyswietlacz = "";
            l = "";
            czydot = false;
            n = 0;
            if(oper < 5){
                oper = 0;
            }
            l = String.valueOf(wyn);
            wyn = 1000000000;
        }
        if(v.getId() == l1.getId()){
            wyswietlacz += "1";
            l += "1";
            n++;
        }
        else if(v.getId() == l2.getId()){
            wyswietlacz += "2";
            l += "2";
            n++;
        }
        else if(v.getId() == l3.getId()){
            wyswietlacz += "3";
            l += "3";
            n++;
        }
        else if(v.getId() == l4.getId()){
            wyswietlacz += "4";
            l += "4";
            n++;
        }
        else if(v.getId() == l5.getId()){
            wyswietlacz += "5";
            l += "5";
            n++;
        }
        else if(v.getId() == l6.getId()){
            wyswietlacz += "6";
            l += "6";
            n++;
        }
        else if(v.getId() == l7.getId()){
            wyswietlacz += "7";
            l += "7";
            n++;
        }
        else if(v.getId() == l8.getId()){
            wyswietlacz += "8";
            l += "8";
            n++;
        }
        else if(v.getId() == l9.getId()){
            wyswietlacz += "9";
            l += "9";
            n++;
        }
        else if(v.getId() == l0.getId()) {
            wyswietlacz += "0";
            l += "0";
            n++;
        }
        else if(v.getId() == dot.getId() && !czydot){
            l += ".";
            wyswietlacz += ",";
            czydot = true;
        }
        else if(v.getId() == res.getId() && a != 1000000000 && oper != 0 && !l.equals("") && oper < 5){
            b = Double.parseDouble(l);
            if(oper == 1){
                wyn = add(a, b);
                wyswietlacz = String.valueOf(wyn);
            }
            if(oper == 2){
                wyn = substract(a, b);
                wyswietlacz = String.valueOf(wyn);
            }
            if(oper == 3){
                wyn = multiple(a, b);
                wyswietlacz = String.valueOf(wyn);
            }
            if(oper == 4){
                wyn = divise(a, b);
                wyswietlacz = String.valueOf(wyn);
            }
            l = "";
            oper = 0;
            czydot = false;
        }
        else if(v.getId() == res.getId() && a != 1000000000 && oper  > 4 && l.equals("")){
            czydot=false;
            System.out.println("OK");
        }
        else if(v.getId() == res.getId()){
            czydot = false;
        }
        else{
            if(oper == 5){
                l = String.valueOf(wyn);
                oper = 0;
                czydot = false;
            }
            else if(oper != 0){
                b = Double.parseDouble(l);
                if(oper == 1){
                    wyn = add(a, b);
                    wyswietlacz = String.valueOf(wyn);
                }
                if(oper == 2){
                    wyn = substract(a, b);
                    wyswietlacz = String.valueOf(wyn);
                }
                if(oper == 3){
                    wyn = multiple(a, b);
                    wyswietlacz = String.valueOf(wyn);
                }
                if(oper == 4){
                    wyn = divise(a, b);
                    wyswietlacz = String.valueOf(wyn);
                }
                l = String.valueOf(wyn);
                oper = 0;
                czydot = false;
            }
            a = Double.parseDouble(l);
            l = "";
            if(v.getId() == ddo.getId()){
                oper = 1;
                wyswietlacz += " + ";
            }
            if(v.getId() == dod.getId()){
                oper = 2;
                wyswietlacz += " - ";
            }
            if(v.getId() == dmn.getId()){
                oper = 3;
                wyswietlacz += " * ";
            }
            if(v.getId() == ddz.getId()){
                oper = 4;
                wyswietlacz += " / ";
            }
            if(v.getId() == dpi.getId()){
                oper = 5;
                wyn = Math.sqrt(a);
                wyswietlacz = String.valueOf(wyn);
                l = String.valueOf(wyn);
            }
            if(v.getId() == dkw.getId()){
                oper = 5;
                wyn = kwadrat(a);
                wyswietlacz = String.valueOf(wyn);
                l = String.valueOf(wyn);
            }
            if(v.getId() == dsi.getId()){
                oper = 5;
                wyn = silnia(a);
                wyswietlacz = String.valueOf(wyn);
                l = String.valueOf(wyn);
            }
            czydot = false;
        }
        if(n > 9){
            wyswietlacz = "limit cyfr to 9!";
        }
        wynik.setText(wyswietlacz);
    }
}