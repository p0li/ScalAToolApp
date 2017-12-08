package de.zalf.pohle.scalatoolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Step7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step7);
        setTitle("Scaling-up Factor Importance");
    }

    public void storeStep7inputs (View view) {
        loadStep8();
    }

    private void loadStep8 () {
        Intent intent = new Intent(this, Step8Activity.class);
        startActivity(intent);
    }
}
