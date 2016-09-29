package com.example.mareklaskowski.customlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by marek.laskowski on 9/29/2016.
 */
public class MyCustomAdapter extends BaseAdapter{

    String [] descriptions;
    int[] images;
    Context context;

    public MyCustomAdapter(MainActivity mainActivity, String[] descriptionList, int[] imageList){
        context = mainActivity;
        images = imageList;
        descriptions = descriptionList;
    }

    @Override
    public int getCount() {
        return descriptions.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        View row;
        //a LayoutInflater is a class that creates a java object from the xml layout
        //we get a LayoutInflater from the framework by calling the following method
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        //use the layoutinflater to create a new View of the correct type!
        row = inflater.inflate(R.layout.custom_list, null);
        //get the TextView and set its text
        TextView textView = (TextView) row.findViewById(R.id.textView);
        textView.setText(descriptions[i]);
        //get the ImageView and set its source image
        ImageView imageView = (ImageView) row.findViewById(R.id.imageView);
        imageView.setImageResource(images[i]);

        row.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View view) {
                   Toast.makeText(context, descriptions[i], Toast.LENGTH_LONG).show();
               }
           }

        );

        return row;
    }
}
