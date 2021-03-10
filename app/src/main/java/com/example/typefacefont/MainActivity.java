package com.example.typefacefont;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    TextView textView1;
    ListView listView;
    ArrayList<String> list;
    ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1 = (TextView) findViewById(R.id.text1);
//        textView2 = (TextView) findViewById(R.id.text1);
//        textView3 = (TextView) findViewById(R.id.text1);
        listView = (ListView) findViewById(R.id.list_item1);

        list = new ArrayList<String>();

        list.add("billionStars_PersonalUse");
        list.add("FontleroyBrownNF");
        list.add("LittleLordFontleroyNF");

        adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getApplicationContext(),"Welcome",Toast.LENGTH_LONG).show();
                String string = parent.getItemAtPosition(position).toString();
                if (string == "billionStars_PersonalUse") {
                    Typeface typeface = Typeface.createFromAsset(getAssets(), "Fonts/billionStars_PersonalUse.ttf");
                    textView1.setTypeface(typeface);
                    //Toast.makeText(getApplicationContext(), "1", Toast.LENGTH_SHORT).show();
                }
                if (string == "FontleroyBrownNF") {
                    Typeface typeface = Typeface.createFromAsset(getAssets(), "Fonts/FontleroyBrownNF.ttf");
                    textView1.setTypeface(typeface);
                    //Toast.makeText(getApplicationContext(), "2", Toast.LENGTH_SHORT).show();
                }
                if (string == "LittleLordFontleroyNF") {
                    Typeface typeface = Typeface.createFromAsset(getAssets(), "Fonts/LittleLordFontleroyNF.ttf");
                    textView1.setTypeface(typeface);
                    //Toast.makeText(getApplicationContext(), "3", Toast.LENGTH_SHORT).show();
                }
            }


        });

    }
}