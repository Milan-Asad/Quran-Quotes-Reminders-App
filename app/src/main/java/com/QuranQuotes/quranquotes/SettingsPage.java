package com.QuranQuotes.quranquotes;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SettingsPage extends AppCompatActivity {

    // Creating variable so we can call the later
    private EditText Name;
    private EditText Password;
    private TextView Info;
    private Button Login;
    private int counter = 5; // For incorrect pw counter


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings_page);
//        Name = (EditText) findViewById(R.id.etName);          // Edit name
//        Password = (EditText) findViewById(R.id.etPassword);  // Edit password
//        Info = (TextView) findViewById(R.id.tvInfo);          // Incorrect attempts
//        Login = (Button) findViewById(R.id.btnLogin);         // Login button
//
//
//        Info.setText("No of attempts remaining: 5");   // Amount of logins left
//
//
//        Login.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                validate(Name.getText().toString(), Password.getText().toString()); // getting username and making it into string
//            }
//        });
    }

//    // Username stuff
//    private void validate(String userName, String userPassword) {                            // Here we're creating a variable (apparently)
//        if((userName.equals("Milan")) && (userPassword.equals("password"))) {                // THE ACTUAL USERNAME AND PASSWORD, YOU CAN CHANGE THIS
//            Intent intent = new Intent(SettingsPage.this, SettingsPage2.class); // What happens when you get password right /SecondActivity.class
//            startActivity(intent);                                                           // Starts the process
//        }else{
//            counter--; // Decreases the amount of attempts you have left
//            Info.setText("No of attempts remaining: " + String.valueOf(counter));
//            Toast.makeText(SettingsPage.this, "Incorrect Password", Toast.LENGTH_SHORT).show();
//            if(counter == 0){
//                Login.setEnabled(false);                                                     //disables button
//                Toast.makeText(SettingsPage.this, "Login Disabled", Toast.LENGTH_SHORT).show();
//            }
//        }
//    }

}