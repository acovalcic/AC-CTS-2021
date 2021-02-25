package ro.ase.translator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import ro.ase.translator.database.model.Traducere;

public class TraducereActivity extends AppCompatActivity { //mutare acolada pe randul de mai jos

    public static final int REQUEST_CODE1 = 100;
    public static final int REQUEST_CODE2 = 200;
    public static final int REQUEST_CODE3 = 300;
    private Button button1;
    private Button button2; //denumire mai clara pentru aceasta variabila, de ex: buttonOpenRoToFrActivity
    private Button button3; //eliminare element nefolosit
    private Intent intent;
    private FloatingActionButton fab1; 

    //eliminare spatii inutile din acest loc



    List<Traducere> traducereList = new ArrayList<Traducere>(); //spatiu dupa aceasta linie
    @Override
    protected void onCreate(Bundle savedInstanceState) { 
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab1=findViewById(R.id.floatingActionButton);
        fab1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Chart.class);
                intent.putExtra(Chart.TRADUCERI_KEY,(Serializable)traducereList);
                startActivity(intent);
            }
        });

        button1 = findViewById(R.id.button1);
        button1.setOnClickListener((view) ->{
            intent = new Intent(getApplicationContext(), ViewRoToEng.class);
            startActivityForResult(intent, REQUEST_CODE1);
        });

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener((view) ->{
            intent = new Intent(getApplicationContext(), RoToFr.class);
            startActivityForResult(intent, REQUEST_CODE2);
        });

    }
}