package com.example.pulseguardsupport;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button websiteButton = (Button) findViewById(R.id.WebsiteButton);
        websiteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openPulseguardSite();
            }
        });

        Button sensorSupportButton = (Button) findViewById(R.id.SensorSupportButton);
        sensorSupportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openSensorSupportActivity();
            }
        });

        Button tabletSupportButton = (Button) findViewById(R.id.TabletSupportButton);
        tabletSupportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openTabletSupportActivity();
            }
        });

        Button pagerSupportButton = (Button) findViewById(R.id.PGLinkButton);
        pagerSupportButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPagerSupportActivity();
            }
        });

        Button emailSupport = (Button) findViewById(R.id.EmailButton);
        emailSupport.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEmailSupportActivity();
            }
        });

        Button generalSetupButton = (Button) findViewById(R.id.GeneralSetupButton);
        generalSetupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openGeneralSetupActivity();
            }
        });
    }

    //----------------------------------------End of onCreate()--------------------------------//

    protected void openPulseguardSite() {
        String url = "https://www.pulseguard.org";
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);
    }

    public void openSensorSupportActivity(){
        Intent intent = new Intent(this, SensorSupport.class);
        startActivity(intent);
    }

    public void openTabletSupportActivity(){
        Intent intent = new Intent(this, TabletSupport.class);
        startActivity(intent);
    }

    public void openPagerSupportActivity(){
        Intent intent = new Intent(this, PagerSupport.class);
        startActivity(intent);
    }

    public void openEmailSupportActivity(){
        Intent intent = new Intent(this, SupportEmail.class);
        startActivity(intent);
    }

    public void openGeneralSetupActivity(){
        Intent intent = new Intent(this, GeneralSetup.class);
        startActivity(intent);
    }








}