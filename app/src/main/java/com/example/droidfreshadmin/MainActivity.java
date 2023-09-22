package com.example.droidfreshadmin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btn_goi_mon,btn_nhan_don;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_goi_mon = (Button) findViewById(R.id.btn_goi_mon);
        btn_nhan_don = (Button) findViewById(R.id.btn_nhan_don);

        btn_nhan_don.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ReceiveOrdersActivity.class));
            }
        });
        btn_goi_mon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this,OderActivity.class));

            }
        });
    }
}