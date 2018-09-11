package com.example.serg.dz_13_helloworldandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_message);
        TextView message = findViewById(R.id.message);
        message.setText("Hello friend");
        message.setAllCaps(true);
    }
}
