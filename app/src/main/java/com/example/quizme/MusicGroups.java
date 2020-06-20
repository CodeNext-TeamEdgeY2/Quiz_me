package com.example.quizme;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MusicGroups extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music_groups);
    }

    public void chalinosanchezquestions(View view) {
        Intent newIntent = new Intent(this,ChalinoSanchezQuestions.class);
        startActivity(newIntent);
    }
}
