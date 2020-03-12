package com.example.massage;

import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class bodytwodetail extends AppCompatActivity {
    int bodytype_img;
    String name;
    Button Counttime;
    TextView Sec, Bodytype;
    Boolean timeon = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bodytwodetail);
        Sec = (TextView) findViewById(R.id.sec);
        Bodytype = (TextView) findViewById(R.id.bodytype);
        Counttime = (Button) findViewById(R.id.countime);

        Counttime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!timeon)
                {
                    Counttime.setText("請持續按壓");
                    new CountDownTimer(20000,1000) {
                        @Override
                        public void onTick(long sec) {
                            Sec.setText(" " +sec/1000);
                        }

                        @Override
                        public void onFinish() {
                            Counttime.setText("請休息十秒點擊繼續");
                            Toast.makeText(bodytwodetail.this, "請舒緩按摩處!", Toast.LENGTH_LONG)
                                    .show();
                        }
                    }.start();
                }
                else
                {
                    Toast.makeText(bodytwodetail.this, "finish!", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });

        Sec.setText(" ");

        if (getIntent() != null) {
            bodytype_img = getIntent().getIntExtra("bodytype_img", -1);
            name = getIntent().getStringExtra("name");
        }
    }
}
