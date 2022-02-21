package com.google.android.gms.samples.vision.ocrreader;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;


public class Result extends AppCompatActivity {
    Intent intent;
    String value;
    TextView text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        intent = getIntent();
        value = intent.getStringExtra("result"); //if it's a string you stored.

        text = (TextView) findViewById(R.id.textView);

        String result;

        result = (value);

        if(result.isEmpty() || result == null)
            text.setText("Sorry no record found");
        else
            text.setText(result);
    }

}