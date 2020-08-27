package com.philipundbasti.zinsrechner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class OutputActivity extends AppCompatActivity {

    //Deklarierung
    private Button button_return;
    private TextView txt_output;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //View aufrufen
        setContentView(R.layout.activity_output);

        //Initialisierung
        txt_output = (TextView) findViewById(R.id.activity_ergebnis_output);
        button_return = (Button) findViewById(R.id.activity_return_btn);
        Model model = Model.getInstance();

        //Ergebnis ausgeben
        txt_output.setText(String.valueOf(model.getInterest()));

        //Listener für zurück
        button_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*
                    //Aktivität Ergebnis zuweisen
                    Intent intent = new Intent();
                    setResult(RESULT_OK, intent);
                 */

                //Zurückspringen
                finish();
            }
        });


    }
}
