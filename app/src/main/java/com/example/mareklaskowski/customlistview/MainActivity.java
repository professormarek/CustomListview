package com.example.mareklaskowski.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    public static int [] images = {R.drawable.google, R.drawable.nbc, R.drawable.seneca};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //pull the array of descriptions out of xml
        String [] descriptions = getResources().getStringArray(R.array.description_array);

        //in order to set up our listview we will need an ArrayAdtaptor of some kind
        //to work with our custom_list layout we also need to create a CustomAdapter class

        //get a reference to my ListView in MainActivity
        ListView listView = (ListView) findViewById(R.id.listView);
        //instantiate a new MyCustomAdapter
        MyCustomAdapter myCustomAdapter = new MyCustomAdapter(this, descriptions, images);
        //connect the ListView with myCustomAdapter
        listView.setAdapter(myCustomAdapter);

    }
}
