package com.myquizz.language.Lib;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.myquizz.language.R;

/**
 * Created by GILBERT on 2017-01-07.
 */

public class CustomListAdapter extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final String[] imgid;
    private final int[] myID;
    private static final int FIRST_POSITION = 0;
    private static final int SECOND_POSITION = 1;




    public CustomListAdapter(Activity context, String[] itemname, String[] imgid,int[] myId) {
        super(context, R.layout.my_list, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
        this.myID = myId;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.my_list, null,true);

        TextView txtTitle = (TextView) rowView.findViewById(myID[FIRST_POSITION]);
//        ImageView imageView = (ImageView) rowView.findViewById(R.id.icon);
        TextView extratxt = (TextView) rowView.findViewById(myID[SECOND_POSITION]);

        txtTitle.setText(itemname[position]);
//        imageView.setImageResource(imgid[position]);
        extratxt.setText(imgid[position]);
        return rowView;

    };
}
