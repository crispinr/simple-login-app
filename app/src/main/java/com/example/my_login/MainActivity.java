package com.example.my_login;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class
MainActivity extends AppCompatActivity {

    Button c, d;
    EditText nameId, emailId;
    String name, email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c = findViewById(R.id.button);
        nameId = findViewById(R.id.editTextTextPersonName2);
        emailId = findViewById(R.id.editTextTextPersonName);
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = nameId.getText().toString();
                Toast.makeText(MainActivity.this, "Name: " + name, Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.themenu, menu);
        return super.onCreateOptionsMenu(menu);

    }

    public void exit(MenuItem item) {
        Intent intent = new Intent(MainActivity.this, SubActivity.class);
        startActivity(intent);
    }

    public void settings(MenuItem item) {
        Toast.makeText(this, "Noice", Toast.LENGTH_SHORT).show();
    }
}