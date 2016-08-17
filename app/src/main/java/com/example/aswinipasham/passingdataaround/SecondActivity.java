package com.example.aswinipasham.passingdataaround;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView RecievedData = (TextView)findViewById(R.id.tvReceivedData);

        Bundle b = getIntent().getExtras();

        if(b!= null) {
            String data = b.getString("data");
            int age = b.getInt("Age", 0);

            RecievedData.setText(data + "\n" + age);
        }
    }
}
