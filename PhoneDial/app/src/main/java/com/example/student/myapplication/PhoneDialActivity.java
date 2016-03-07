package com.example.student.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PhoneDialActivity extends ActionBarActivity {

    View.OnClickListener myhandler = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            switch(view.getId()) {
                case R.id.hangup:
                    // it was the first button
                    finish();
                    break;
                case R.id.call:
                    // it was the second button
                    Intent intent = new Intent(Intent.ACTION_CALL);
                    intent.setData(Uri.parse("tel:" + ((EditText) findViewById(R.id.editText)).getText().toString()));
                    startActivity(intent);
                    break;
                case R.id.imageButton_back:
                    EditText beditText = (EditText) findViewById(R.id.editText);
                    //editText.setText(editText.getText()., TextView.BufferType.EDITABLE);
                    int length = beditText.getText().length();
                    beditText.setText(beditText.getText().delete(length -1 , length), TextView.BufferType.EDITABLE);
                    break;
                default:
                    EditText editText = (EditText) findViewById(R.id.editText);
                    //editText.setText(editText.getText()., TextView.BufferType.EDITABLE);
                    Button btn = (Button) view;
                    editText.setText(editText.getText().toString() + btn.getText().toString(), TextView.BufferType.EDITABLE);

            }
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_phone_dial);

        ((Button)findViewById(R.id.button0)).setOnClickListener(myhandler);
        findViewById(R.id.button1).setOnClickListener(myhandler);

        findViewById(R.id.button2).setOnClickListener(myhandler);
        findViewById(R.id.button3).setOnClickListener(myhandler);

        findViewById(R.id.button4).setOnClickListener(myhandler);
        findViewById(R.id.button5).setOnClickListener(myhandler);

        findViewById(R.id.button6).setOnClickListener(myhandler);
        findViewById(R.id.button7).setOnClickListener(myhandler);

        findViewById(R.id.button8).setOnClickListener(myhandler);
        findViewById(R.id.button9).setOnClickListener(myhandler);

        findViewById(R.id.buttondiez).setOnClickListener(myhandler);
        findViewById(R.id.buttonstar).setOnClickListener(myhandler);


        findViewById(R.id.imageButton_back).setOnClickListener(myhandler);


        findViewById(R.id.call).setOnClickListener(myhandler);

        findViewById(R.id.hangup).setOnClickListener(myhandler);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_phone_dial, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }



}
