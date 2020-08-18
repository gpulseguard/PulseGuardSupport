package com.example.pulseguardsupport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class SensorSupport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor_support);

        Button senSupBackButton = (Button) findViewById(R.id.sensorSupportBackButton);
        senSupBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();

            }
        });

        ImageButton rhythmButton = (ImageButton) findViewById(R.id.rhythmButton);
        rhythmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openRhythmActivity();
            }
        });


    ImageButton tikrButton = (ImageButton) findViewById(R.id.tikrButton);
    tikrButton.setOnClickListener(new View.OnClickListener()

    {
        @Override
        public void onClick (View view){
        setContentView(R.layout.tikr_sup);
    }
    });
}

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openRhythmActivity(){
        Intent intent = new Intent (this, RhythmActivity.class);
        startActivity(intent);
    }

}