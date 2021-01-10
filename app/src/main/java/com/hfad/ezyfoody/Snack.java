package com.hfad.ezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class Snack extends AppCompatActivity implements OnClickListener{
    TextView button_ncos, button_mnc, button_gb, button_potato;
    TextView txtMW, txtJAp, txtJAl, txtJM;
    TextView txtPMW, txtPJAp, txtPJAl, txtPJM;

    public static final String EXTRA_TEXT_1 = "com.example.EzyFoody.EXTRA_TEXT_1",
            EXTRA_TEXT_2 = "com.example.EzyFoody.EXTRA_TEXT_2";
    String txtMWs, txtJAps, txtJAls, txtJMs;
    String txtPMWs, txtPJAps, txtPJAls, txtPJMs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_snack);
        button_ncos = (TextView)findViewById(R.id.button_ncos);
        button_mnc = (TextView)findViewById(R.id.button_mnc);
        button_gb = (TextView)findViewById(R.id.button_gb);
        button_potato = (TextView)findViewById(R.id.button_potato);

        button_ncos.setOnClickListener(this);
        button_mnc.setOnClickListener(this);
        button_gb.setOnClickListener(this);
        button_potato.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_ncos:
                txtMW = (TextView)findViewById(R.id.ncos_txt);
                txtPMW = (TextView)findViewById(R.id.ncos_txt2);

                txtMWs = txtMW.getText().toString();
                txtPMWs = txtPMW.getText().toString();
                Order.tampung = 8;

                Intent imw = new Intent(this, Order.class);
                imw.putExtra(EXTRA_TEXT_1, txtMWs);
                imw.putExtra(EXTRA_TEXT_2, txtPMWs);
                imw.putExtra("imgMW", R.drawable.nachos);
                startActivity(imw);
                break;
            case R.id.button_mnc:
                txtJAp = (TextView)findViewById(R.id.mnc_txt);
                txtPJAp = (TextView)findViewById(R.id.mnc_txt2);

                txtJAps = txtJAp.getText().toString();
                txtPJAps = txtPJAp.getText().toString();
                Order.tampung = 9;

                Intent iap = new Intent(this, Order.class);
                iap.putExtra(EXTRA_TEXT_1, txtJAps);
                iap.putExtra(EXTRA_TEXT_2, txtPJAps);
                iap.putExtra("imgMW", R.drawable.macncheese);
                startActivity(iap);
                break;
            case R.id.button_gb:
                txtJAl = (TextView)findViewById(R.id.gb_txt);
                txtPJAl = (TextView)findViewById(R.id.gb_txt2);

                txtJAls = txtJAl.getText().toString();
                txtPJAls = txtPJAl.getText().toString();
                Order.tampung = 10;

                Intent iapl = new Intent(this, Order.class);
                iapl.putExtra(EXTRA_TEXT_1, txtJAls);
                iapl.putExtra(EXTRA_TEXT_2, txtPJAls);
                iapl.putExtra("imgMW", R.drawable.garlicb);
                startActivity(iapl);
                break;
            case R.id.button_potato:
                txtJM = (TextView)findViewById(R.id.potato_txt);
                txtPJM = (TextView)findViewById(R.id.potato_txt2);

                txtJMs = txtJM.getText().toString();
                txtPJMs = txtPJM.getText().toString();
                Order.tampung = 11;

                Intent ijm = new Intent(this, Order.class);
                ijm.putExtra(EXTRA_TEXT_1, txtJMs);
                ijm.putExtra(EXTRA_TEXT_2, txtPJMs);
                ijm.putExtra("imgMW", R.drawable.potato);
                startActivity(ijm);
                break;
        }
    }

    public void gomy(View view){
        Intent intent = new Intent(this, Myorder.class);
        startActivity(intent);
    }

}
