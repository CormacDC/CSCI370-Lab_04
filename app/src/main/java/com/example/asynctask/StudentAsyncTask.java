package com.example.asynctask;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class StudentAsyncTask extends AsyncTask<Void,Void, ArrayList<Student>> {

    @SuppressLint("StaticFieldLeak")
    private Context context;
    @SuppressLint("StaticFieldLeak")
    private ListView view;

    public StudentAsyncTask(Context con, ListView v){
        context = con;
        view = v;
    }

    @Override
    protected void onPostExecute(ArrayList<Student> students) {
        super.onPostExecute(students);

        StudentAdapter studentAdapter = new StudentAdapter(context,students);

        view.setAdapter(studentAdapter);
    }

    @Override
    protected ArrayList<Student> doInBackground(Void... voids) {

        StudentDao studentDao = new StudentDao();
        return studentDao.getAllStudents();

    }
}
