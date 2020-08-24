package com.philipundbasti.zinsrechner;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class OutputActivity extends AppCompatActivity {

    private Button button_return;
    private TextView txt_output;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_output);

        txt_output = (TextView) findViewById(R.id.activity_ergebnis_output);
        button_return = (Button) findViewById(R.id.activity_return_btn);

        Model model = Model.getInstance();
        txt_output.setText(String.valueOf(model.getInterest()));

        button_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                setResult(RESULT_OK, intent);
                finish();
            }
        });


    }
}
