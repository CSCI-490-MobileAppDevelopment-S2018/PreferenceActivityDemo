package com.stingersof.userprefsdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button refreshButton;
    Button prefsLaunchButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        textView = findViewById(R.id.textview);
        String username = getSharedPreferences("user_prefs", MODE_PRIVATE).getString("username", "");
        textView.setText(username);

        refreshButton = findViewById(R.id.button);
        refreshButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String username = getSharedPreferences("user_prefs", MODE_PRIVATE).getString("username", "");
                textView.setText(username);
            }
        });

        prefsLaunchButton = findViewById(R.id.button2);
        prefsLaunchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), PrefActivity.class);
                startActivity(i);
            }
        });

    }
}
