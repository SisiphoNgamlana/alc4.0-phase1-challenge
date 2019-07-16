package za.co.ngamlana.sispho.alcphase1challenge_android;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AActivity extends AppCompatActivity {

    private Button buttonAboutAlc;
    private Button buttonMyProfile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);
        buttonAboutAlc = findViewById(R.id.button_about_alc_activity);
        buttonMyProfile = findViewById(R.id.button_my_profile_activity);

        buttonAboutAlc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutAlcIntent = new Intent(view.getContext(), BActivity.class);
                startActivity(aboutAlcIntent);
            }
        });

        buttonMyProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent myProfileIntent = new Intent(view.getContext(), CActivity.class);
                startActivity(myProfileIntent);
            }
        });
    }
}
