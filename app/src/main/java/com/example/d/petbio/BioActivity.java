package com.example.d.petbio;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BioActivity extends AppCompatActivity {


    @BindView(R.id.pet_bio_view)
    ImageView petView;

    @BindView(R.id.pet_bio)
    TextView petBio;

    @BindView(R.id.pet_name)
    TextView petName;

    private Bundle bundle;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bio);
        ButterKnife.bind(this);

        bundle = getIntent().getExtras();

        if (bundle != null) {
            String name = bundle.getString("name");
            String bio = bundle.getString("bio");

            setUp(name, bio);
        }
    }

    public void setUp(String name, String bio) {


        if (name.equals("Bronx")) {

            petView.setImageDrawable(ContextCompat
                    .getDrawable(BioActivity.this, R.drawable.british_bulldog));
            petName.setText(name);
            petBio.setText(bio);

        } else if (name.equals("Melissa")) ;

        petView.setImageDrawable(ContextCompat
                .getDrawable(BioActivity.this, R.drawable.persian_cat));
        petName.setText(name);
        petBio.setText(bio);

    }
}
