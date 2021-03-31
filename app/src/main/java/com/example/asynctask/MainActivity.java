package com.example.asynctask;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    StudentAsyncTask studentAsyncTask;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.student);

        context = getApplicationContext();

        studentAsyncTask = new StudentAsyncTask(context,listView);
        studentAsyncTask.execute();
    }
}