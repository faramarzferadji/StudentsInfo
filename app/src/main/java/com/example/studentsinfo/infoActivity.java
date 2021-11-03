package com.example.studentsinfo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class infoActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnprin,btnclr,btnret;
    EditText edfn,edln, edid, edeml;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_infostd);
        initialy();

    }
    private void initialy(){
        btnprin = findViewById(R.id.buttonAVG);
        btnclr = findViewById(R.id.buttonClear);
        btnret = findViewById(R.id.buttonReturn);
        btnprin.setOnClickListener(this);
        btnclr.setOnClickListener(this);
        btnret.setOnClickListener(this);
        edfn = findViewById(R.id.editTextTextFname);
        edln = findViewById(R.id.editTextTextLname);
        edid = findViewById(R.id.editTextTextID);
        edeml = findViewById(R.id.editTextTextEmail);
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.buttonAVG:{
               String fn=edfn.getText().toString();
               String ln = edln.getText().toString();
               String id = edid.getText().toString();
               String em = edeml.getText().toString();
               String sentence = "Student"+fn+ln+"with ID number"+id+"and Email"+em;
                Toast.makeText(this,sentence,Toast.LENGTH_LONG).show();
                break;
            }
            case R.id.buttonClear:{
                edfn.setText("");
                edln.setText("");
                edid.setText("");
                edeml.setText("");
                edfn.requestFocus();
                break;
            }
            case R.id.buttonReturn:{
                finish();
                break;
            }
        }

    }
}
