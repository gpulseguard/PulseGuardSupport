package com.example.pulseguardsupport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class TikrSupport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tikr_sup);


        Button tikrBackButton = (Button) findViewById(R.id.tikrBackButton);
        tikrBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSensorSupportActivity();
            }
        });
    }

    public void openSensorSupportActivity(){
        Intent intent = new Intent(this, SensorSupport.class);
        startActivity(intent);
    }

}
