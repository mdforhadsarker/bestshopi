package com.example.ashad.bestshopi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;


public class FilterActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button RecommendBtn;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filter);
        Spinner spinner = findViewById(R.id.spinner1);
        Spinner spinner2 = findViewById(R.id.spinner2);
        Spinner spinner4 = findViewById(R.id.spinner4);
        RecommendBtn = findViewById(R.id.btnSubmit);

        RecommendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openRecommendActivity();
            }
        });



        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.Brands, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(this);

        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,R.array.Colors, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner2.setAdapter(adapter1);
        spinner2.setOnItemSelectedListener(this);


        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,R.array.Sizes, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner4.setAdapter(adapter3);
        spinner4.setOnItemSelectedListener(this);

    }

    public void openRecommendActivity() {

        Intent intent = new Intent(this, Shirt50_100Activity.class);
        startActivity(intent);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        String text = parent.getItemAtPosition(position).toString();


    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }


}
