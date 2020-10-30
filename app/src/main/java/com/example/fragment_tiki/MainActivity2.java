package com.example.fragment_tiki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.fragment_tiki.model.Donut;

public class MainActivity2 extends AppCompatActivity {

    Donut donut;
    private ImageView imageView;
    private TextView textView6;
    private TextView textView7;
    private TextView textView8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent i = getIntent();
        donut = (Donut) i.getSerializableExtra("obj");
        Toast.makeText(this, donut.toString(),Toast.LENGTH_SHORT).show();
        imageView = (ImageView) findViewById(R.id.imageView2);
        textView6 = (TextView) findViewById(R.id.textView6);
        textView7 = (TextView) findViewById(R.id.textView7);
        textView8 = (TextView) findViewById(R.id.textView8);
        textView6.setText(donut.getTitle());
        textView7.setText(donut.getDesp());
        textView8.setText(donut.getPrice());
        imageView.setImageResource(donut.getImage());


    }


    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}