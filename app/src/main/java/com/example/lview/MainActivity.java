package com.example.lview;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    static final String []lst = new String [] {"One","Two","Three"};
    ListView listview;
    TextView textview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = (ListView) findViewById(R.id.lv);
        textview = (TextView) findViewById(R.id.t1);
        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,android.R.id.text1,lst);
        listview.setAdapter(adapter);
//        setListAdapter(new ArrayAdapter<String>(this,R.layout.activity_main,lst));
//        ListView listview = getListView();
//        listview.setTextFilterEnabled(true);
        listview.setOnItemClickListener(this);
    }

    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        String s;
        TextView tv = (TextView)view;
        s = (String)tv.getText().toString();
        Toast.makeText(this,s,Toast.LENGTH_SHORT).show();
    }
}