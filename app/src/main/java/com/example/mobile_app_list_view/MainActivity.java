package com.example.mobile_app_list_view;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Typeface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

    // Engineer Md Torikul Islam
    //    ID: 192002131

public class MainActivity extends AppCompatActivity {

    ListView Fontlist;
    EditText Input;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Interfacing

        Fontlist =(ListView) findViewById(R.id.Fontlist);
        Input= (EditText) findViewById(R.id.Input);

        // String Array
        String[] values = new String[] {"Angilla Tattoo","Cantate Beveled","Krinkes Decor PERSONAL","Krinkes Regular PERSONAL","Silent Reaction"};
        // Array Adapter
        ArrayAdapter<String> adapter= new ArrayAdapter<String>(this,android.R.
                layout.simple_dropdown_item_1line,values);

            Fontlist.setAdapter(adapter);

            Fontlist.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                    String itemValue =(String) Fontlist.getItemAtPosition(position);

                    // Font Change

                    if(itemValue.equals("Angilla Tattoo")){

                        // Setting up the path of the fonts
                        String fontPath="fonts/AngillaTattoo.ttf";
                        Typeface tf=Typeface.createFromAsset(getAssets(),fontPath);
                        Input.getText().toString();
                        Input.setTypeface(tf);
                    }
                    else if(itemValue.equals("Cantate Beveled")){

                        String fontPath="fonts/CantateBeveled.ttf";
                        Typeface tf=Typeface.createFromAsset(getAssets(),fontPath);
                        Input.getText().toString();
                        Input.setTypeface(tf);
                    }
                    else if(itemValue.equals("Krinkes Decor PERSONAL")){

                        String fontPath="fonts/KrinkesDecorPERSONAL.ttf";
                        Typeface tf=Typeface.createFromAsset(getAssets(),fontPath);
                        Input.getText().toString();
                        Input.setTypeface(tf);
                    }
                    else if(itemValue.equals("Krinkes Regular PERSONAL")){

                        String fontPath="fonts/KrinkesRegularPERSONAL.ttf";
                        Typeface tf=Typeface.createFromAsset(getAssets(),fontPath);
                        Input.getText().toString();
                        Input.setTypeface(tf);
                    }

                    else if(itemValue.equals("Silent Reaction")){

                        String fontPath="fonts/SilentReaction.ttf";
                        Typeface tf=Typeface.createFromAsset(getAssets(),fontPath);
                        Input.getText().toString();
                        Input.setTypeface(tf);
                    }
                }
            });


        }
}