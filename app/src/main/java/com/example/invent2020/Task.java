package com.example.invent2020;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Random;
import java.util.Objects;

public class Task extends AppCompatActivity {

    private ArrayList<String> taskList = new ArrayList<String>();
    private Random r = new Random();
    private String[] currentList = new String[3];
    private String task;

    public void makeSampleList(){
        for(int i = 0; i < 20; i++){
            taskList.add("task" + i);
        }
    }
    public String[] getCurrentList(){
        return this.currentList;
    }
    public String[] randomizedTask(){
        currentList = new String[3];
        for (int i = 0; i < 3; i++){
            int randomNumber = r.nextInt(taskList.size());
            currentList[i] = taskList.get(randomNumber);
        }
        return currentList;
    }

    public String toStringTaskList(){
    String text = String.format(getString(R.string.tasklist),
                toString(currentList[0]), toString(currentList[1]), toString(currentList[2]));

    return text;
    }
}
