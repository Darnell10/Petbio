package com.example.d.petbio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.cat_view)
    ImageView catView;

    @BindView(R.id.dog_view)
    ImageView dogView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        catView.setOnClickListener(this);
        dogView.setOnClickListener(this);



    }



    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.cat_view:
                // go to next activity
                Intent catIntent = new Intent(MainActivity.this,BioActivity.class);
                catIntent.putExtra("name","Melissa");
                catIntent.putExtra("bio","Meow Alot!!!");
                startActivity(catIntent);
                Log.e("Clicked", "Cat Clicked");
                break;

            case R.id.dog_view:
                // go to next activity
                Intent dogIntent = new Intent(MainActivity.this,BioActivity.class);
                dogIntent.putExtra("name","Bronx");
                dogIntent.putExtra("bio","A good boy");

                startActivity(dogIntent);
                Log.e("Clicked", "Dog Clicked");
                break;
        }
    }


}
