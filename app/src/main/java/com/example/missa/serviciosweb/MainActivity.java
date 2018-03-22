package com.example.missa.serviciosweb;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button click;
    public static TextView data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click = (Button) findViewById(R.id.getBtn);
        data = (TextView) findViewById(R.id.showData);
        click.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View view) {
                GetJson process = new GetJson();
                process.execute();
            }
        });
    }
}