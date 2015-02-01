package com.example.susumu.myfirstapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AnalogClock;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
//import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private EditText             editText1;
    private Button               button1;
    private TextView             textView1;
    private AnalogClock          analogClock1;
    private AutoCompleteTextView autoCompleteTextView1;
//    private CalendarView         calendarView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        setContentView(R.layout.activity_main_linear);

        editText1             = (EditText)findViewById(R.id.etEditText1);
        button1               = (Button)findViewById(R.id.bButton1);
        textView1             = (TextView)findViewById(R.id.tvTextView1);
        analogClock1          = (AnalogClock)findViewById(R.id.acAnalogClock1);
        autoCompleteTextView1 = (AutoCompleteTextView)findViewById(R.id.acAutoComplete1);
//        calendarView1         = (CalendarView)findViewById(R.id.cCalendarView1);

        button1.setOnClickListener(onClickButton1);
//        autoCompleteTextView1.setOnClickListener(onItemSelece1);

        String[] countries = getResources().getStringArray(R.array.list_of_countries);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,countries);

        autoCompleteTextView1.setAdapter(adapter);

        autoCompleteTextView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                textView1.setText(autoCompleteTextView1.getText());
                Toast.makeText(getApplicationContext(), autoCompleteTextView1.getText(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    View.OnClickListener onClickButton1 = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
        textView1.setText(editText1.getText());
        Toast.makeText(MainActivity.this, "Done executing", Toast.LENGTH_SHORT).show();
        }
    };

    View.OnClickListener onClickButton2 = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            textView1.setText(editText1.getText());
            Toast.makeText(MainActivity.this, "Done executing", Toast.LENGTH_SHORT).show();
        }
    };

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
    */
}
