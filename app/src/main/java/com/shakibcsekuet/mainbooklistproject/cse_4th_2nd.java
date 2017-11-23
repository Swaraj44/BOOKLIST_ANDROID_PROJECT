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

public class cse_4th_2nd extends AppCompatActivity {

    ListView simpleList2;
    String book[] ={"Computer graphics","Digital System Design","FAULT TOLERANT DESIGN"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cse_4th_2nd);
        simpleList2 = (ListView)findViewById(R.id.simpleListView2);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview, R.id.textView, book);
        simpleList2.setAdapter(arrayAdapter);
        simpleList2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Clicked on "+book[position], Toast.LENGTH_LONG).show();
                if(position==0){
                    String s="https://drive.google.com/open?id=1XhGsdxOVP442ktKwa26ROmXL4FSYqtgp";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(cse_4th_2nd.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==1){
                    String s="https://drive.google.com/open?id=1CBo2ZvSDMxcSh5SoeFgLtm98nD35UtWI";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(cse_4th_2nd.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }
                else if(position==2){
                    String s="https://drive.google.com/open?id=0B1ON83FyGCF5WmNfWFc1OXRrR28";
                    Bundle basket= new Bundle();
                    basket.putString("abc", s);
                    Intent a=new Intent(cse_4th_2nd.this,webbrowser.class);
                    a.putExtras(basket);
                    startActivity(a);

                }



            }
        });

    }
}
