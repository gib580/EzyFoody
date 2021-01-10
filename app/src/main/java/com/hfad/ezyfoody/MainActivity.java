package com.hfad.ezyfoody;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void myOrder(View view){
        Intent myorder = new Intent(this, Myorder.class);
        startActivity(myorder);
    }
    public void goDrink(View view) {
        Intent godrink = new Intent(this, Drink.class);
        startActivity(godrink);
    }

    public void goTopup(View view) {
        Intent gotopup = new Intent(this, Topup.class);
        startActivity(gotopup);
    }

    public void goFud(View view) {
        Intent gofud = new Intent(this, foody.class);
        startActivity(gofud);
    }

    public void goSnek(View view) {
       Intent gosnek = new Intent(this, Snack.class);
        startActivity(gosnek);
    }
}
