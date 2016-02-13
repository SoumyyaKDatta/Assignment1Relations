package com.example.assignment1relations;



import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;


public class MainActivity extends Activity {

    ListView list;
    String[] name = {"Ezio Auditore",
            "Giovanni Auditore",
            "Maria Auditore",
            "Federico Auditore",
            "Claudia Auditore",
            "Mario Auditore"
    } ;
    String[] relation = {"Assassin",
            "Father",
            "Mother",
            "Brother",
            "Sister",
            "Uncle"
    } ;
    Integer[] imageId = {
            R.drawable.image0,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image5,
            R.drawable.image8,
            R.drawable.image1,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Com adapter = new Com(MainActivity.this, name, relation, imageId);
        list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);
    }

}

