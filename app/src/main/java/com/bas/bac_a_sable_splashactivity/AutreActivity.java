package com.bas.bac_a_sable_splashactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AutreActivity extends AppCompatActivity {

    //attributs


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_autre);

        init();
    }

    private void init() {
        ecouteBtnVersMain();
        ecouteBtnfinish();
    }

    private void ecouteBtnfinish() {
        findViewById(R.id.btn_finish).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();

            }
        });
    }

    private void ecouteBtnVersMain() {
        findViewById(R.id.btn_versMain).setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AutreActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }

}
