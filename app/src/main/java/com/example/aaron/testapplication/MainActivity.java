package com.example.aaron.testapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        int MAX_LIST = 30;

        String[] nameList = {   "Oscar",
                "Aaron",
                "Fernando" ,
                "Yendry",
                "Chaz",
                "Anand",
                "Khuman",
                "Whiliam"};
        String[] lastNameList = {   "SMITH",
                "JOHNSON",
                "JONES",
                "MILLER",
                "WILSON",
                "MOORE",
                "TAYLOR"};

        List<Person> list = new ArrayList<Person>();

        for (int idx=0; idx<=MAX_LIST; idx++){
            Person p = new Person(nameList[idx%nameList.length], lastNameList[idx%lastNameList.length]);
            list.add(p);
        }

        printList(list);

        sortByLastName(list);

        printList(list);
    }

    public void sortByLastName(List people){
        Comparator comp = new PersonCoparator();
        Collections.sort(people, comp);
    }

    public void printList(List<Person> people){
        for(Person p : people){
            Log.d("PRINT", p.getFirstName() + " " + p.getLastName());
        }
    }
}
