package de.zalf.pohle.scalatoolapp;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Step8Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_step8);
        setTitle("Assessment of Scaling-up Potential");

        FragmentManager fm = getFragmentManager();
        FragmentTransaction ft = fm.beginTransaction();
        ft.replace(R.id.questionBlockA, new Step8questionBlockFragment());
        ft.commit();
    }

    public void storeStep8inputs (View view) {
        loadFinalResults();
    }

    private void loadFinalResults() {}
}
