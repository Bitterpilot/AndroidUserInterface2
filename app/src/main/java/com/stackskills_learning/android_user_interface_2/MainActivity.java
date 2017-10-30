package com.stackskills_learning.android_user_interface_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.RadioGroupID);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                radioButton = (RadioButton) findViewById(checkedId);
                switch (radioButton.getId()){
                    case R.id.YesID:{
                        Log.d("RD","Yes");
                    }
                    break;
                    case R.id.NoID:{
                        Log.d("RD","no");
                    }
                    break;
                    case R.id.MaybeID:{
                        Log.d("RD","maybe");
                    }
                }
            }
        });
    }
}
