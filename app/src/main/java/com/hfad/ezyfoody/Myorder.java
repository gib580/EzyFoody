package com.hfad.ezyfoody;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Collection;

public class Myorder extends AppCompatActivity {
    TextView mwQ, apQ, alQ, jmQ;
    TextView totalpricetxt, moneytxt;
    int totalPrice=0;
    public static int money=5250300;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_myorder);
        totalpricetxt = (TextView)findViewById(R.id.totalPrice);
        moneytxt = (TextView)findViewById(R.id.moneyT);

        mwQ = (TextView)findViewById(R.id.mineralQ);
        mwQ.setText(String.format("Qty: %d",Tampungan.TampungList.get(0)));

        apQ = (TextView)findViewById(R.id.jusApQ);
        apQ.setText(String.format("Qty: %d",Tampungan.TampungList.get(1)));

        alQ = (TextView)findViewById(R.id.jusAlQ);
        alQ.setText(String.format("Qty: %d",Tampungan.TampungList.get(2)));

        jmQ = (TextView)findViewById(R.id.jusJMQ);
        jmQ.setText(String.format("Qty: %d",Tampungan.TampungList.get(3)));

        for(int i=0;i <12;i++){
            totalPrice += Tampungan.TampungList.get(i) * 10000;
        }
        moneytxt.setText(String.format("Saldo Rp. %d", money));
        totalpricetxt.setText(String.format("%d", totalPrice));


    }

    public void gominMW(View view) {
        if(Tampungan.TampungList.get(0)>0){
            Tampungan.TampungList.set(0,Tampungan.TampungList.get(0)-1);
            mwQ.setText(String.format("Qty: %d",Tampungan.TampungList.get(0)));
            totalPrice-=10000;
            totalpricetxt.setText(String.format("%d",totalPrice));
        }}

    public void gominAp(View view) {
        if(Tampungan.TampungList.get(1)>0){
            Tampungan.TampungList.set(1,Tampungan.TampungList.get(1)-1);
            apQ.setText(String.format("Qty: %d",Tampungan.TampungList.get(1)));
            totalPrice-=10000;
            totalpricetxt.setText(String.format("%d",totalPrice));
    }}

    public void gominAl(View view) {
        if(Tampungan.TampungList.get(2)>0){
            Tampungan.TampungList.set(2,Tampungan.TampungList.get(2)-1);
            alQ.setText(String.format("Qty: %d",Tampungan.TampungList.get(2)));
            totalPrice-=10000;
            totalpricetxt.setText(String.format("%d",totalPrice));
    }}

    public void gominJm(View view) {
        if(Tampungan.TampungList.get(3)>0){
            Tampungan.TampungList.set(3,Tampungan.TampungList.get(3)-1);
            jmQ.setText(String.format("Qty: %d",Tampungan.TampungList.get(3)));
            totalPrice-=10000;
            totalpricetxt.setText(String.format("%d",totalPrice));
    }}

    public void goPay(View view) {
        NonFuncDialog nonFuncDialog = new NonFuncDialog();
        if(Myorder.money>= totalPrice){
            Myorder.money -= totalPrice;
            totalPrice = 0;
            for(int i=0;i <12;i++){
                Tampungan.TampungList.set(i,Tampungan.TampungList.get(i) - Tampungan.TampungList.get(i));
            }
            mwQ.setText(String.format("Qty: %d",Tampungan.TampungList.get(0)));
            apQ.setText(String.format("Qty: %d",Tampungan.TampungList.get(1)));
            alQ.setText(String.format("Qty: %d",Tampungan.TampungList.get(2)));
            jmQ.setText(String.format("Qty: %d",Tampungan.TampungList.get(3)));
            moneytxt.setText(String.format("Saldo Rp. %d", money));
            totalpricetxt.setText(String.format("%d", totalPrice));
        }else{
            nonFuncDialog.show(getSupportFragmentManager(),"whoops");
        }
//        Intent intent = new Intent(this,MainActivity.class);
//        startActivity(intent);
    }
}
