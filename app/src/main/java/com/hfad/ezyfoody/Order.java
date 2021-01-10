package com.hfad.ezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Order extends AppCompatActivity {
    Bundle bundle;
    ImageView img;
    Intent intent;
    TextView nama, harga;
    Button orderM, myo;
    public static int tampung = 0;
    Button ADD;
    EditText quantityET;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);
        orderM = (Button)findViewById(R.id.btnOrderMore);
        myo = (Button)findViewById(R.id.btnMyOrder2);
        bundle = getIntent().getExtras();
        img = (ImageView)findViewById(R.id.imageDetail);
        nama = (TextView)findViewById(R.id.orderName);
        harga = (TextView)findViewById(R.id.orderPrice);

        ADD = (Button)findViewById(R.id.addQ);
        quantityET = (EditText) findViewById(R.id.qtyOrder);

        intent = getIntent();
        String namas = intent.getStringExtra(Drink.EXTRA_TEXT_1);
        String hargas = intent.getStringExtra(Drink.EXTRA_TEXT_2);
        nama.setText(namas);
        harga.setText(hargas);


        if(bundle!=null){
            int a = bundle.getInt("imgMW");
            img.setImageResource(a);
        }

        myo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gomy();
            }
        });

        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addQuantity();
            }
        });

        orderM.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                goOrderM();
            }
        });

    }

    private void addQuantity(){
        String x = "";
        x = quantityET.getText().toString();
        int y = Integer.parseInt(x);
        Tampungan.TampungList.set(tampung,Tampungan.TampungList.get(tampung)+y);
    }

    private void gomy(){
        Intent omy = new Intent(this, Myorder.class);
        startActivity(omy);
    }
    private void goOrderM(){
        Intent orderM = new Intent(this, Drink.class);
        startActivity(orderM);
    }
}
