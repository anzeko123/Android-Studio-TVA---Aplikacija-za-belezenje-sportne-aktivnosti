package com.example.tva_projekt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.example.tva_projekt.R;

public class EnterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.enter_activity);
        // Get a reference to the AutoCompleteTextView in the layout.
        AutoCompleteTextView textView = (AutoCompleteTextView) findViewById(R.id.select_activities);
// Get the string array.
        String[] activities = getResources().getStringArray(R.array.activities_array);
// Create the adapter and set it to the AutoCompleteTextView.
        ArrayAdapter<String> adapter =
                new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, activities);
        textView.setAdapter(adapter);
    }
    public void closeEnterActivity(View view) {
        finish();
    }
}