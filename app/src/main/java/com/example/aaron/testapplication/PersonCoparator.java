package com.example.aaron.testapplication;

import java.util.Comparator;

/**
 * Created by User on 10/5/2016.
 */

public class PersonCoparator implements Comparator<Person> {

    @Override
    public int compare(Person p1, Person p2) {
        if(p1.getLastName() == null){
            return -1;
        }
        else if (p2.getLastName() == null){
            return 1;
        }
        else{
            return p1.getLastName().compareTo(p2.getLastName());
        }
    }

}
