package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class dataActivity extends AppCompatActivity {

    EditText name,age,address,email,phoneno;
    Button submit;
    RadioButton fyes,fno,syes,sno,tyes,tno,foyes,fono,fiyes,fino,siyes,sino;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data);

        name=findViewById(R.id.txtname);
        age=findViewById(R.id.txtage);
        address=findViewById(R.id.txtadd);
        email=findViewById(R.id.txtemail);
        phoneno=findViewById(R.id.txtphno);

        submit=findViewById(R.id.btnsubmit);


        fyes=findViewById(R.id.fyes);
        fno=findViewById(R.id.fno);
        syes=findViewById(R.id.syes);
        sno=findViewById(R.id.sno);
        tyes=findViewById(R.id.thyes);
        tno=findViewById(R.id.thno);
        foyes=findViewById(R.id.foyes);
        fono=findViewById(R.id.fono);
        fiyes=findViewById(R.id.fiyes);
        fino=findViewById(R.id.fino);
        siyes=findViewById(R.id.siyes);
        sino=findViewById(R.id.sino);

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int count = 0;
                int cnt = 0;
                if (fyes.isChecked()) {
                    count = count + 1;
                } else {
                    cnt = cnt + 1;
                }
                if (syes.isChecked()) {
                    count = count + 1;
                } else {
                    cnt = cnt + 1;
                }
                if (tyes.isChecked()) {
                    count = count + 1;
                } else {
                    cnt = cnt + 1;
                }
                if (foyes.isChecked()) {
                    count = count + 1;
                } else {
                    cnt = cnt + 1;
                }
                if (fiyes.isChecked()) {
                    count = count + 1;
                } else {
                    cnt = cnt + 1;
                }
                if (siyes.isChecked()) {
                    count = count + 1;
                } else {
                    cnt = cnt + 1;
                }

                if (count >= 4) {
                    Toast.makeText(dataActivity.this, "It seems You have COVID-19 symptoms",Toast.LENGTH_LONG).show();
                }
                else if (count>=2 && count <4){
                    Toast.makeText(dataActivity.this, "It seems may be You have COVID-19 symptoms",Toast.LENGTH_LONG).show();
                }
                else if(count<2){
                    Toast.makeText(dataActivity.this, "It seems You don't have COVID-19 symptoms",Toast.LENGTH_LONG).show();
                }
            }
        });



    }
}
