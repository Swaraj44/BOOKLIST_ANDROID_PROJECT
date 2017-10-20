package com.shakibcsekuet.mainbooklistproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by md sakib on 9/30/2017.
 */

public class cse_3rd_2nd extends AppCompatActivity {

    ListView simpleList2;
    String book[] ={"Operating System","Applied Statistics and Queuing Theory","Compiler Design","Mobile Computing"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cse_3rd_2nd);
        simpleList2 = (ListView)findViewById(R.id.simpleListView7);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview3rd2nd, R.id.textView4, book);
        simpleList2.setAdapter(arrayAdapter);
        simpleList2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Clicked on "+book[position], Toast.LENGTH_LONG).show();




            }
        });

    }
}
