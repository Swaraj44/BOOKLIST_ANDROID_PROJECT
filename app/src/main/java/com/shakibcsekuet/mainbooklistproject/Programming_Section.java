package com.shakibcsekuet.mainbooklistproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


/**
 * Created by md sakib on 10/26/2017.
 */
public class Programming_Section extends Activity {
    ListView simpleList;
    String deptlist[] = {"এলগোরিদম","ডাটা স্ট্রাকচার","লিংকড লিস্ট (Linked List)","স্ট্যাক (Stack)","কিউ (Queue)","ট্রি (Tree)","বাইনারী সার্চ ট্রি (Binary Search Tree)","হ্যাশটেবিল (HashTable)","ডিসজয়েন্ট সেট (Disjoind Set)","ট্রাই ট্রি (Trie)","সেগমেন্ট ট্রি (Segment Tree)"};

    @Override   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.programming_section);
        simpleList = (ListView)findViewById(R.id.simpleListView);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.activity_programming_section_listview, R.id.textView, deptlist);
        simpleList.setAdapter(arrayAdapter);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getBaseContext(), " Clicked on :: " +deptlist[position], Toast.LENGTH_LONG).show();
                if(deptlist[position]=="এলগোরিদম"){
                    Intent intent = new Intent(getApplicationContext(), CSE.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="লিংকড লিস্ট (Linked List)"){
                    Intent intent = new Intent(getApplicationContext(), EEE.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="স্ট্যাক (Stack)"){
                    Intent intent = new Intent(getApplicationContext(), MECA.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="কিউ (Queue)"){
                    Intent intent = new Intent(getApplicationContext(), CIVIL.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="ট্রি (Tree)"){
                    Intent intent = new Intent(getApplicationContext(), BME.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="বাইনারী সার্চ ট্রি (Binary Search Tree)"){
                    Intent intent = new Intent(getApplicationContext(), ECE.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="হ্যাশটেবিল (HashTable)"){
                    Intent intent = new Intent(getApplicationContext(), IEM.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="ডিসজয়েন্ট সেট (Disjoind Set)"){
                    Intent intent = new Intent(getApplicationContext(), BECM.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="ট্রাই ট্রি (Trie)"){
                    Intent intent = new Intent(getApplicationContext(), TE.class);
                    startActivity(intent);
                }
                else if(deptlist[position]=="সেগমেন্ট ট্রি (Segment Tree)"){
                    Intent intent = new Intent(getApplicationContext(), ET.class);
                    startActivity(intent);
                }

            }
        });
    }
}