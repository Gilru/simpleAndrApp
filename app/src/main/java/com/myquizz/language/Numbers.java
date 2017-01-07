package com.myquizz.language;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.myquizz.language.Lib.CustomListAdapter;

public class Numbers extends AppCompatActivity {
    ListView list;
    String[] itemname ={
            "Safari",
            "Camera",
            "Global",
            "FireFox",
            "UC Browser",
            "Android Folder",
            "VLC Player",
            "Cold War"
    };
    String[] english ={
            "Safari",
            "Camera",
            "Global",
            "FireFox",
            "UC Browser",
            "Android Folder",
            "VLC Player",
            "Cold War"
    };
    int[] myRessources = {R.id.translation,R.id.english};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        CustomListAdapter adapter=new CustomListAdapter(this, itemname, english,myRessources);
        list=(ListView)findViewById(R.id.list);

        list.setAdapter(adapter);
    }
}
