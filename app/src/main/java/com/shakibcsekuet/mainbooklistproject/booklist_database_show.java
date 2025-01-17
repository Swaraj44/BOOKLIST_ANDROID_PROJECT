package com.shakibcsekuet.mainbooklistproject;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class booklist_database_show extends AppCompatActivity {

    ListView lv;
    String[] data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booklist_database_show);

        lv = (ListView) findViewById(R.id.myfriendbday);

        MyDBFunctions mf = new MyDBFunctions(getApplicationContext());

        data = mf.my_data();

        lv.setAdapter(new ArrayAdapter(getApplicationContext(), R.layout.database_listview, R.id.mytext, data));

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(getApplicationContext(), Edit_booklist_data.class);
                i.putExtra("MyKEY", position);
                startActivity(i);
            }
        });




    }

}
