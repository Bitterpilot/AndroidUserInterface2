package com.stackskills_learning.android_user_interface_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    private ToggleButton toggleButton;
    private TextView resultView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultView = (TextView) findViewById(R.id.peekabooTextView);
        toggleButton = (ToggleButton) findViewById(R.id.toggleButtonID);
        toggleButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked){
                    //Toggle is enabled
                    resultView.setVisibility(View.VISIBLE);
                }else{
                    //Toggle is disabled
                    resultView.setVisibility(View.INVISIBLE);
                }
            }
        });
    }
}
