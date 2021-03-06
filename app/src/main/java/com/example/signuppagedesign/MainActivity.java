package com.example.signuppagedesign;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText firstName;
    EditText lastName;
    EditText address;
    EditText email;
    Button register;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //main activity
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        firstName = findViewById(R.id.firstName);
        lastName = findViewById(R.id.lastName);
        address = findViewById(R.id.address);
        email = findViewById(R.id.email);
        register = findViewById(R.id.registration);
        login = findViewById(R.id.login);

        //click event listener
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //showing new activity when clicked on button
                //login activity
                Intent LoginActivity = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(LoginActivity);
            }
        });


    }
}
