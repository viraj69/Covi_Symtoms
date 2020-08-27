package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.firebase.auth.FirebaseAuth;

public class homeActivity extends AppCompatActivity {
    Button btnLogout,btnHealthStatus,btninfo;
    FirebaseAuth mFireBaseAuth;
    private FirebaseAuth.AuthStateListener mAuthStateListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnHealthStatus = findViewById(R.id.button4);
        btninfo = findViewById(R.id.button5);
        btnLogout = findViewById(R.id.button3);
        btnLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FirebaseAuth.getInstance().signOut();
                Intent intToMain = new Intent(homeActivity.this, loginActivity.class);
                startActivity(intToMain);
            }
        });

        btnHealthStatus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inToStatusPage = new Intent(homeActivity.this,dataActivity.class);
                startActivity(inToStatusPage);
            }
        });

        btninfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent inToInfoPage = new Intent(homeActivity.this,infoActivity.class);
                startActivity(inToInfoPage);
            }
        });

    }
}
