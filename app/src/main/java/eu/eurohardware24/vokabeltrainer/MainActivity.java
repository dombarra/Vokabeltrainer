package eu.eurohardware24.vokabeltrainer;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    Button VokabelEingabe, VokabelDatenbankVerwaltung, Vokabeltraining;
    LinearLayout WerbungLayout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        VokabelEingabe = (Button)findViewById(R.id.Vokabel_Eingabe);
        VokabelDatenbankVerwaltung = (Button)findViewById(R.id.VokabelVerwaltung);
        Vokabeltraining = (Button)findViewById(R.id.Vokabeltraining);
        WerbungLayout = (LinearLayout)findViewById(R.id.WerbungLayout);

       VokabelEingabe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VokabelEingabe.class));
            }
        });

        VokabelDatenbankVerwaltung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DatenbankVerwaltung.class));
            }
        });

        Vokabeltraining.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, VokabelEingabe.class));
            }
        });
    }



}
