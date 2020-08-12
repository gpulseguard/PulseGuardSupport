package com.example.pulseguardsupport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LenovoSupport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lenovo_support);

        Button lenBackButton = (Button) findViewById(R.id.lenBackButton);
        lenBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTabletSupportActivity();
            }
        });


    }

    //-----------------------End of onCreate----------------------------------------
    public void openTabletSupportActivity(){
        Intent intent = new Intent(this, TabletSupport.class);
        startActivity(intent);
    }



}
