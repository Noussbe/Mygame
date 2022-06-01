package com.dam.mygame;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Home extends AppCompatActivity {


    /** Var globales */

    Button btnPlusMoins, btnMorpion;

            /** Lien entre Java et Design */

            private void initUI()
            {
                btnPlusMoins = findViewById(R.id.btnPlusMoins);
                btnMorpion = findViewById(R.id.btnMorpion);
            }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        /** Appel de la méthode pour initialisé les composants graphiques */
        initUI();


        btnPlusMoins.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(Home.this, PlusOuMoins.class );

                String titre = btnPlusMoins.getText().toString();

                intent.putExtra("titrePage", titre);

                startActivity(intent);
            }
        });
    }
}