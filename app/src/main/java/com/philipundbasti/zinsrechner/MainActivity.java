package com.philipundbasti.zinsrechner;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Deklarierung
    private EditText input_anfangskapital;
    private EditText input_zinssatz;
    private EditText input_laufzeit;
    private Button button_calculate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //View aufrufen
        setContentView(R.layout.activity_main);

        //Initialisierung
        final Model model = Model.getInstance();
        input_anfangskapital = (EditText) findViewById(R.id.activity_anfangskapital_input);
        input_zinssatz = (EditText) findViewById(R.id.activity_zinssatz_input);
        input_laufzeit = (EditText) findViewById(R.id.activity_laufzeit_input);
        button_calculate = (Button) findViewById(R.id.activity_calculate_btn);

        //Listener für Berechnung
        button_calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    model.setInitialCapital(Double.parseDouble(input_anfangskapital.getText().toString()));
                    model.setInterestRate(Double.parseDouble(input_zinssatz.getText().toString()));
                    model.setRunningTime(Integer.parseInt(input_laufzeit.getText().toString()));
                } catch (NumberFormatException e) {
                    Toast.makeText(getApplicationContext(), "ungültige oder fehlende Angaben", Toast.LENGTH_SHORT).show();
                    return;
                }

                //Intent erzeugen
                Intent outputActivity = new Intent(MainActivity.this, OutputActivity.class);
                //Aktivität wechseln
                startActivity(outputActivity);


            }
        });
    }
}