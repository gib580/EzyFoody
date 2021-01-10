package com.hfad.ezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;

public class foody extends AppCompatActivity implements OnClickListener{
    TextView button_ns, button_ab, button_am, button_baso;
    TextView txtMW, txtJAp, txtJAl, txtJM;
    TextView txtPMW, txtPJAp, txtPJAl, txtPJM;

    public static final String EXTRA_TEXT_1 = "com.example.EzyFoody.EXTRA_TEXT_1",
            EXTRA_TEXT_2 = "com.example.EzyFoody.EXTRA_TEXT_2";
    String txtMWs, txtJAps, txtJAls, txtJMs;
    String txtPMWs, txtPJAps, txtPJAls, txtPJMs;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foody);
        button_ns = (TextView)findViewById(R.id.button_ns);
        button_ab = (TextView)findViewById(R.id.button_ab);
        button_am = (TextView)findViewById(R.id.button_am);
        button_baso = (TextView)findViewById(R.id.button_baso);

        button_ns.setOnClickListener(this);
        button_ab.setOnClickListener(this);
        button_am.setOnClickListener(this);
        button_baso.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        switch (v.getId()){
            case R.id.button_ns:
                txtMW = (TextView)findViewById(R.id.ns_txt);
                txtPMW = (TextView)findViewById(R.id.ns_txt2);

                txtMWs = txtMW.getText().toString();
                txtPMWs = txtPMW.getText().toString();
                Order.tampung = 4;

                Intent imw = new Intent(this, Order.class);
                imw.putExtra(EXTRA_TEXT_1, txtMWs);
                imw.putExtra(EXTRA_TEXT_2, txtPMWs);
                imw.putExtra("imgMW", R.drawable.nasgor);
                startActivity(imw);
                break;
            case R.id.button_ab:
                txtJAp = (TextView)findViewById(R.id.ab_txt);
                txtPJAp = (TextView)findViewById(R.id.ab_txt2);

                txtJAps = txtJAp.getText().toString();
                txtPJAps = txtPJAp.getText().toString();
                Order.tampung = 5;

                Intent iap = new Intent(this, Order.class);
                iap.putExtra(EXTRA_TEXT_1, txtJAps);
                iap.putExtra(EXTRA_TEXT_2, txtPJAps);
                iap.putExtra("imgMW", R.drawable.ayambakar);
                startActivity(iap);
                break;
            case R.id.button_am:
                txtJAl = (TextView)findViewById(R.id.am_txt);
                txtPJAl = (TextView)findViewById(R.id.am_txt2);

                txtJAls = txtJAl.getText().toString();
                txtPJAls = txtPJAl.getText().toString();
                Order.tampung = 6;

                Intent iapl = new Intent(this, Order.class);
                iapl.putExtra(EXTRA_TEXT_1, txtJAls);
                iapl.putExtra(EXTRA_TEXT_2, txtPJAls);
                iapl.putExtra("imgMW", R.drawable.ayammentega);
                startActivity(iapl);
                break;
            case R.id.button_baso:
                txtJM = (TextView)findViewById(R.id.baso_txt);
                txtPJM = (TextView)findViewById(R.id.baso_txt2);

                txtJMs = txtJM.getText().toString();
                txtPJMs = txtPJM.getText().toString();
                Order.tampung = 7;

                Intent ijm = new Intent(this, Order.class);
                ijm.putExtra(EXTRA_TEXT_1, txtJMs);
                ijm.putExtra(EXTRA_TEXT_2, txtPJMs);
                ijm.putExtra("imgMW", R.drawable.baso);
                startActivity(ijm);
                break;
        }
    }

    public void gomy(View view){
        Intent intent = new Intent(this, Myorder.class);
        startActivity(intent);
    }

}
