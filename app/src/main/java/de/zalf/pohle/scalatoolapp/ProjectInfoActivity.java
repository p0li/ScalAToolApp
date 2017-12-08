package de.zalf.pohle.scalatoolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProjectInfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_project_info);
        this.setTitle("Project information");
    }

    public void storeProjectInfoInputs (View view) {
        loadStep7();
    }

    private void loadStep7 () {
        Intent intent = new Intent(this, Step7Activity.class);
        startActivity(intent);
    }
}
