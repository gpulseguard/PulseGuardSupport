package com.example.pulseguardsupport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SamsungSupport extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samsung_support);

        Button samSupportBackButton = (Button) findViewById(R.id.samBackButton);
        samSupportBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTabletSupportActivity();
            }
        });
    }

    //------------------------------------------End of On Create------------------------------------------

    public void openTabletSupportActivity(){
        Intent intent = new Intent(this, TabletSupport.class);
        startActivity(intent);
    }
}
