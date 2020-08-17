package com.example.pulseguardsupport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PagerSupport extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_support);

        Button senSupBackButton = (Button) findViewById(R.id.pagerSupportBackButton);
        senSupBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openMainActivity();
            }
        });

        Button noServiceButton = (Button) findViewById(R.id.noServiceButton);
        noServiceButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPagerNoService();
            }
        });

        Button cantConnectButton = (Button) findViewById(R.id.cantConnectButton);
        cantConnectButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPagerConnectionSupportActivity();
            }
        });







    }
    //-------------------------End of onCreate----------------------//

    public void openMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void openPagerNoService(){
        Intent intent = new Intent(this, PagerNoService.class);
        startActivity(intent);
    }

    public void openPagerConnectionSupportActivity(){
        Intent intent = new Intent(this, PagerConnectionSupport.class);
        startActivity(intent);
    }


}
