package com.example.cv;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);



        final TextView a = findViewById(R.id.name);
        final TextView s = findViewById(R.id.age);
        final TextView d = findViewById(R.id.job);
        final TextView f = findViewById(R.id.number);
        final TextView g = findViewById(R.id.email);

        Bundle m = getIntent().getExtras();
       a.setText( m.getString("name"));
       s.setText( m.getString("age"));
        d.setText( m.getString("job"));
        f.setText( m.getString("num"));
        g.setText( m.getString("email"));





        Button back = findViewById(R.id.button2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity2.this,MainActivity.class);

                startActivity(i);
            }
        });
    }
}










