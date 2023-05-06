package com.example.french;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    Spinner mySpinner;
    ImageView yellow;
    TextView jaune;
    ImageView red;
    TextView rouge;
    ImageView black;
    TextView noir;
    ImageView green;
    TextView vert;
    ImageView blue;
    TextView bleu;

    ImageView one;
    ImageView two;
    ImageView three;
    ImageView four;
    ImageView five;
    ImageView six;
    ImageView seven;
    ImageView eight;
    ImageView nine;
    ImageView ten;

    TextView un;
    TextView deux;
    TextView trois;
    TextView quatre;
    TextView cinq;
    TextView sixx;
    TextView sept;
    TextView huit;
    TextView neuf;
    TextView dix;

    ImageView monday;
    ImageView tuesday;
    ImageView wednsday;
    ImageView thursday;
    ImageView friday;
    ImageView saturday;
    ImageView sunday;

    TextView lundi;
    TextView mardi;
    TextView mercredi;
    TextView jeudi;
    TextView vendredi;
    TextView samedi;
    TextView dimanche;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mySpinner = findViewById(R.id.my_spinner);
        yellow = findViewById(R.id.yellow);
        black = findViewById(R.id.black);
        red = findViewById(R.id.red);
        blue = findViewById(R.id.blue);
        green = findViewById(R.id.green);
        vert = findViewById(R.id.vert);
        rouge = findViewById(R.id.rouge);
        noir = findViewById(R.id.noir);
        jaune = findViewById(R.id.jaune);
        bleu = findViewById(R.id.bleu);

        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);
        ten = findViewById(R.id.ten);

        un = findViewById(R.id.un);
        deux = findViewById(R.id.deux);
        trois = findViewById(R.id.trois);
        quatre = findViewById(R.id.quatre);
        cinq = findViewById(R.id.cinq);
        sixx = findViewById(R.id.sixx);
        sept = findViewById(R.id.sept);
        huit = findViewById(R.id.huit);
        neuf = findViewById(R.id.neuf);
        dix = findViewById(R.id.dix);

        monday = findViewById(R.id.monday);
        tuesday = findViewById(R.id.tuesday);
        wednsday = findViewById(R.id.wednsday);
        thursday = findViewById(R.id.thursday);
        friday = findViewById(R.id.friday);
        saturday = findViewById(R.id.saturday);
        sunday = findViewById(R.id.sunday);

        lundi = findViewById(R.id.lundi);
        mardi = findViewById(R.id.mardi);
        mercredi = findViewById(R.id.mercredi);
        jeudi = findViewById(R.id.jeudi);
        vendredi = findViewById(R.id.vendredi);
        samedi = findViewById(R.id.samedi);
        dimanche = findViewById(R.id.dimanche);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, new String[]{"Colors in french", "Numbers in french", "Days in french"});
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(adapter);
        mySpinner.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();
        Toast.makeText(parent.getContext(), text, Toast.LENGTH_SHORT).show();
        switch (position) {
            case 0: // First item selected
                yellow.setVisibility(View.VISIBLE);
                green.setVisibility(View.VISIBLE);
                blue.setVisibility(View.VISIBLE);
                black.setVisibility(View.VISIBLE);
                red.setVisibility(View.VISIBLE);
                rouge.setVisibility(View.VISIBLE);
                vert.setVisibility(View.VISIBLE);
                bleu.setVisibility(View.VISIBLE);
                noir.setVisibility(View.VISIBLE);
                jaune.setVisibility(View.VISIBLE);
                one.setVisibility(View.INVISIBLE);
                two.setVisibility(View.INVISIBLE);
                three.setVisibility(View.INVISIBLE);
                four.setVisibility(View.INVISIBLE);
                five.setVisibility(View.INVISIBLE);
                six.setVisibility(View.INVISIBLE);
                seven.setVisibility(View.INVISIBLE);
                eight.setVisibility(View.INVISIBLE);
                nine.setVisibility(View.INVISIBLE);
                ten.setVisibility(View.INVISIBLE);
                break;
            case 1: // Second item selected
                // add code here
                yellow.setVisibility(View.INVISIBLE);
                green.setVisibility(View.INVISIBLE);
                black.setVisibility(View.INVISIBLE);
                red.setVisibility(View.INVISIBLE);
                blue.setVisibility(View.INVISIBLE);

                one.setVisibility(View.VISIBLE);
                two.setVisibility(View.VISIBLE);
                three.setVisibility(View.VISIBLE);
                four.setVisibility(View.VISIBLE);
                five.setVisibility(View.VISIBLE);
                six.setVisibility(View.VISIBLE);
                seven.setVisibility(View.VISIBLE);
                eight.setVisibility(View.VISIBLE);
                nine.setVisibility(View.VISIBLE);
                ten.setVisibility(View.VISIBLE);

                un.setVisibility(View.VISIBLE);
                deux.setVisibility(View.VISIBLE);
                trois.setVisibility(View.VISIBLE);
                quatre.setVisibility(View.VISIBLE);
                cinq.setVisibility(View.VISIBLE);
                sixx.setVisibility(View.VISIBLE);
                sept.setVisibility(View.VISIBLE);
                huit.setVisibility(View.VISIBLE);
                neuf.setVisibility(View.VISIBLE);
                dix.setVisibility(View.VISIBLE);

                break;
            case 2: // Third item selected
                // add code here
                yellow.setVisibility(View.INVISIBLE);
                green.setVisibility(View.INVISIBLE);
                black.setVisibility(View.INVISIBLE);
                red.setVisibility(View.INVISIBLE);
                blue.setVisibility(View.INVISIBLE);

                one.setVisibility(View.INVISIBLE);
                two.setVisibility(View.INVISIBLE);
                three.setVisibility(View.INVISIBLE);
                four.setVisibility(View.INVISIBLE);
                five.setVisibility(View.INVISIBLE);
                six.setVisibility(View.INVISIBLE);
                seven.setVisibility(View.INVISIBLE);
                eight.setVisibility(View.INVISIBLE);
                nine.setVisibility(View.INVISIBLE);
                ten.setVisibility(View.INVISIBLE);

                un.setVisibility(View.INVISIBLE);
                deux.setVisibility(View.INVISIBLE);
                trois.setVisibility(View.INVISIBLE);
                quatre.setVisibility(View.INVISIBLE);
                cinq.setVisibility(View.INVISIBLE);
                sixx.setVisibility(View.INVISIBLE);
                sept.setVisibility(View.INVISIBLE);
                huit.setVisibility(View.INVISIBLE);
                neuf.setVisibility(View.INVISIBLE);
                dix.setVisibility(View.INVISIBLE);

                monday.setVisibility(View.VISIBLE);
                tuesday.setVisibility(View.VISIBLE);
                wednsday.setVisibility(View.VISIBLE);
                thursday.setVisibility(View.VISIBLE);
                friday.setVisibility(View.VISIBLE);
                saturday.setVisibility(View.VISIBLE);
                sunday.setVisibility(View.VISIBLE);
                lundi.setVisibility(View.VISIBLE);
                mardi.setVisibility(View.VISIBLE);
                mercredi.setVisibility(View.VISIBLE);
                jeudi.setVisibility(View.VISIBLE);
                vendredi.setVisibility(View.VISIBLE);
                samedi.setVisibility(View.VISIBLE);
                dimanche.setVisibility(View.VISIBLE);

                break;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        // Do something when nothing is selected
    }
}
