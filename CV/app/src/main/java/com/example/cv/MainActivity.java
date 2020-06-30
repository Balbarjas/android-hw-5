package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText z = findViewById(R.id.editText1);
        final EditText x = findViewById(R.id.editText2);
        final EditText C = findViewById(R.id.editText3);
        final EditText k = findViewById(R.id.editText4);
        final EditText b = findViewById(R.id.editText5);
        Button q = findViewById(R.id.button1);
        q.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("name",z.getText().toString());
                i.putExtra("age",x.getText().toString());
                i.putExtra("job",C.getText().toString());
                i.putExtra("num",k.getText().toString());
                i.putExtra("email",b.getText().toString());
                startActivity(i);

            }
        });
    }
}


































