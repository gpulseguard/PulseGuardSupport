package com.example.pulseguardsupport;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class TabletSupport extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tablet_support);

        Button tabSupportBackButton = (Button) findViewById(R.id.tabSupportBackButton);
        tabSupportBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();

            }
        });


        ImageButton lenovoSupport = (ImageButton) findViewById(R.id.lenovoButton);
        lenovoSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLenovoSupport();

            }
        });
    }







    //-------------------------End of onCreate----------------------//

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openLenovoSupport(){
        Intent intent = new Intent(this, LenovoSupport.class);
        startActivity(intent);
    }
}
