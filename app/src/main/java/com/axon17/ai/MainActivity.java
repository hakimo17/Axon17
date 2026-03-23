package com.axon17.ai;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnTerminal = findViewById(R.id.btn_terminal);

        btnTerminal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // الانتقال إلى شاشة الترمينال الحقيقي
                Intent intent = new Intent(MainActivity.this, TerminalActivity.class);
                startActivity(intent);
            }
        });
    }
}
