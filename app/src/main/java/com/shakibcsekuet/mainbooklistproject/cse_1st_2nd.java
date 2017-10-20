package com.shakibcsekuet.mainbooklistproject;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by md sakib on 9/30/2017.
 */

public class cse_1st_2nd extends AppCompatActivity {

    ListView simpleList2;
    private WebView mywebView;
    String book[] ={"Structured programming","Digital Logic Design","Chemistry","Analog Electronics","Coordinate Geometry and Differential equations"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cse_1st_2nd);
        simpleList2 = (ListView)findViewById(R.id.simpleListView3);
        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, R.layout.listview1st2nd, R.id.textView4, book);
        simpleList2.setAdapter(arrayAdapter);
        simpleList2.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Clicked on "+book[position]+"...wait", Toast.LENGTH_LONG).show();
                if(position==0){
                    mywebView = (WebView) findViewById(R.id.webview);
                    WebSettings webSettings= mywebView.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    mywebView.loadUrl("https://drive.google.com/open?id=0B1ON83FyGCF5YjFXOUpDVUxHV2c");
                }
                else if(position==1){
                    mywebView = (WebView) findViewById(R.id.webview);
                    WebSettings webSettings= mywebView.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    mywebView.loadUrl("https://drive.google.com/open?id=0B1ON83FyGCF5bUYxTjVoYmVVYzQ");
                }
                else if(position==2){
                    mywebView = (WebView) findViewById(R.id.webview);
                    WebSettings webSettings= mywebView.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    mywebView.loadUrl("https://drive.google.com/open?id=0B1ON83FyGCF5MUhQRE5Fa2dzQnM");
                }
                else if(position==3){
                    mywebView = (WebView) findViewById(R.id.webview);
                    WebSettings webSettings= mywebView.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    mywebView.loadUrl("https://drive.google.com/open?id=0B1ON83FyGCF5WjB6Z0tBT3p6Njg");
                }
                else if(position==4){
                    mywebView = (WebView) findViewById(R.id.webview);
                    WebSettings webSettings= mywebView.getSettings();
                    webSettings.setJavaScriptEnabled(true);
                    mywebView.loadUrl("https://drive.google.com/open?id=0B1ON83FyGCF5RkswakZpbnp0R0k");
                }
            }
        });

    }
}
