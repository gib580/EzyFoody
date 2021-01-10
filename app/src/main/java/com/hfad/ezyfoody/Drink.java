package com.hfad.ezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Drink extends AppCompatActivity implements OnClickListener{
    TextView button_mineralwater, button_jusapel, button_jusalpukat, button_jussmangga;
    TextView txtMW, txtJAp, txtJAl, txtJM;
    TextView txtPMW, txtPJAp, txtPJAl, txtPJM;

    public static final String EXTRA_TEXT_1 = "com.example.EzyFoody.EXTRA_TEXT_1",
            EXTRA_TEXT_2 = "com.example.EzyFoody.EXTRA_TEXT_2";
    String txtMWs, txtJAps, txtJAls, txtJMs;
    String txtPMWs, txtPJAps, txtPJAls, txtPJMs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drink);
        button_mineralwater = (TextView)findViewById(R.id.button_mineralwater);
        button_jusapel = (TextView)findViewById(R.id.button_jusapel);
        button_jusalpukat = (TextView)findViewById(R.id.button_jusalpukat);
        button_jussmangga = (TextView)findViewById(R.id.button_jussmangga);

        button_mineralwater.setOnClickListener(this);
        button_jusapel.setOnClickListener(this);
        button_jusalpukat.setOnClickListener(this);
        button_jussmangga.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_mineralwater:
                txtMW = (TextView)findViewById(R.id.mineral_water_txt);
                txtPMW = (TextView)findViewById(R.id.mineral_water_txt2);

                txtMWs = txtMW.getText().toString();
                txtPMWs = txtPMW.getText().toString();
                Order.tampung = 0;

                Intent imw = new Intent(this, Order.class);
                imw.putExtra(EXTRA_TEXT_1, txtMWs);
                imw.putExtra(EXTRA_TEXT_2, txtPMWs);
                imw.putExtra("imgMW", R.drawable.mineral_water);
                startActivity(imw);
                break;
            case R.id.button_jusapel:
                txtJAp = (TextView)findViewById(R.id.jus_apel_txt);
                txtPJAp = (TextView)findViewById(R.id.jus_apel_txt2);

                txtJAps = txtJAp.getText().toString();
                txtPJAps = txtPJAp.getText().toString();
                Order.tampung = 1;

                Intent iap = new Intent(this, Order.class);
                iap.putExtra(EXTRA_TEXT_1, txtJAps);
                iap.putExtra(EXTRA_TEXT_2, txtPJAps);
                iap.putExtra("imgMW", R.drawable.jus_apel);
                startActivity(iap);
                break;
            case R.id.button_jusalpukat:
                txtJAl = (TextView)findViewById(R.id.jus_alpukat_txt);
                txtPJAl = (TextView)findViewById(R.id.jus_alpukat_txt2);

                txtJAls = txtJAl.getText().toString();
                txtPJAls = txtPJAl.getText().toString();
                Order.tampung = 2;

                Intent iapl = new Intent(this, Order.class);
                iapl.putExtra(EXTRA_TEXT_1, txtJAls);
                iapl.putExtra(EXTRA_TEXT_2, txtPJAls);
                iapl.putExtra("imgMW", R.drawable.jus_alpukat);
                startActivity(iapl);
                break;
            case R.id.button_jussmangga:
                txtJM = (TextView)findViewById(R.id.jus_mangga_txt);
                txtPJM = (TextView)findViewById(R.id.jus_mangga_txt2);

                txtJMs = txtJM.getText().toString();
                txtPJMs = txtPJM.getText().toString();
                Order.tampung = 3;

                Intent ijm = new Intent(this, Order.class);
                ijm.putExtra(EXTRA_TEXT_1, txtJMs);
                ijm.putExtra(EXTRA_TEXT_2, txtPJMs);
                ijm.putExtra("imgMW", R.drawable.jus_mangga);
                startActivity(ijm);
                break;
        }
    }

    public void gomy(View view){
        Intent intent = new Intent(this, Myorder.class);
        startActivity(intent);
    }

}
