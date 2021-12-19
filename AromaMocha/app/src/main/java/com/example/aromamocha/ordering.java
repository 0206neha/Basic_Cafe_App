package com.example.aromamocha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class ordering extends AppCompatActivity {

    public static final String MSG = "com.mycafe.ORDER";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordering);
    }

    public void placeorder(View view)
    {
       // we will handle the click on the button here
        // build an intent- to open another activity  ,intent=intention

        Intent intent = new Intent(this,OrderActivity.class);
        EditText editText1= findViewById(R.id.editText1);
        EditText editText2= findViewById(R.id.editText2);
        EditText editText3= findViewById(R.id.editText3);
        String message="1. " +editText1.getText().toString() + "\n\n"
                + "2. " +editText2.getText().toString() + "\n\n"
                + "3. "+editText3.getText().toString();
        intent.putExtra(MSG,message);  // we can send key value pair  msg is key and message value
        startActivity(intent);

    }

}