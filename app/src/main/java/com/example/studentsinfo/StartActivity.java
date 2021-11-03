package com.example.studentsinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartActivity extends AppCompatActivity implements View.OnClickListener{
    Button btnoff;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        done();
    }
    private void done(){
        btnoff = findViewById(R.id.buttonOff);
        btnoff.setOnClickListener(this);
    }
   public void onClick(View view){
        finish();
   }
   public void gradepr(View view){
        Intent intent = new Intent(this, GradeActivity.class);
        startActivity(intent);

   }
   public void infoStudent(View view){
        Intent intent = new Intent(this, infoActivity.class);
        startActivity(intent);
   }
   public void  endpro(View view){
        Intent intent = new Intent(this, StartActivity.class);
       //it is not necessery to write startActivity(intent);
   }
}