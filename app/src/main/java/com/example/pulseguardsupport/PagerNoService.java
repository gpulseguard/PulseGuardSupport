package com.example.pulseguardsupport;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class PagerNoService extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pager_no_service);

        Button senSupBackButton = (Button) findViewById(R.id.noServiceBackButton);
        senSupBackButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openPagerSupportActivity();
            }
        });
    }

    public void openPagerSupportActivity(){
        Intent intent = new Intent(this, PagerSupport.class);
        startActivity(intent);
    }
}
