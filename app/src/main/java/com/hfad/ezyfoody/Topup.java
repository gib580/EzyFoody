package com.hfad.ezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Topup extends AppCompatActivity {
    EditText qtyTopupTxt;
    TextView moneytxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topup);

        moneytxt = (TextView)findViewById(R.id.moneyT2);
        qtyTopupTxt = (EditText) findViewById(R.id.qtyTopup);
        moneytxt.setText(String.format("Rp. %d", Myorder.money));

    }

    public void goAddSaldo(View view){
        NonFuncDialog nonFuncDialog = new NonFuncDialog();
        String xx = "";
        xx = qtyTopupTxt.getText().toString();
        int z = Integer.parseInt(xx);
        if (z <= 2000000 && z >= 0){
            Myorder.money += z;
            moneytxt.setText(String.format("Rp. %d", Myorder.money));
        }else{
            nonFuncDialog.show(getSupportFragmentManager(),"whoops");
        }
    }


}
