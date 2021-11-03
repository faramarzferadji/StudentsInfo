package com.example.studentsinfo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class GradeActivity extends AppCompatActivity implements View.OnClickListener {
    Button btnavg, btnclr, btnret;
    EditText edtSic,edtphy, edtmat, edthis,edtavg, edtres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade);
        initialy();
    }
   private void initialy(){
        btnavg = findViewById(R.id.buttonAVG);
        btnclr = findViewById(R.id.buttonClear);
        btnret = findViewById(R.id.buttonReturn);
        btnavg.setOnClickListener(this);
        btnclr.setOnClickListener(this);
        btnret.setOnClickListener(this);
        edtSic = findViewById(R.id.editTextNumberScience);
        edtphy = findViewById(R.id.editTextNumberPhisics);
        edtmat = findViewById(R.id.editTextNumberMath);
        edthis = findViewById(R.id.editTextNumberHistory);
        edtavg = findViewById(R.id.editTextNumberAverage);
        edtres = findViewById(R.id.editTextNumberResult);
   }
   public void onClick(View view){
        switch (view.getId()){
            case R.id.buttonAVG:{
                int n1 = Integer.parseInt(edtSic.getText().toString());
                int n2 = Integer.parseInt(edtphy.getText().toString());
                int n3 = Integer.parseInt(edtmat.getText().toString());
                int n4 = Integer.parseInt(edthis.getText().toString());
                double av = (n1+n2+n3+n4)/4;
                edtavg.setText(String.valueOf(av));
                if (av >60){
                    edtres.setText("PASS");
                }
                else {
                    edtres.setText("Fail");
                }
                break;
            }
            case R.id.buttonClear:{
                edtSic.setText("");
                edtphy.setText("");
                edtmat.setText("");
                edthis.setText("");
                edtavg.setText("");
                edtres.setText("");
                edtSic.requestFocus();
                break;
            }
            case R.id.buttonReturn:{
                finish();
                break;
            }
        }

   }
}
