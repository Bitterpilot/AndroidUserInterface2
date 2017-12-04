package com.stackskills_learning.android_user_interface_2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //when we get to larger lists, grouping them(extra line) and listing them as they are visually may help.
    private CheckBox momCheckBox;
    private CheckBox dadCheckBox;
    private CheckBox grandpaCheckBox;

    private Button showButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        momCheckBox = (CheckBox) findViewById(R.id.momID);
        dadCheckBox = (CheckBox) findViewById(R.id.dadID);
        grandpaCheckBox = (CheckBox) findViewById(R.id.grandpaID);

        showButton = (Button) findViewById(R.id.showButtonID);
        resultTextView = (TextView) findViewById(R.id.resultTextView);

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(momCheckBox.getText().toString() + " status is: " +
                    momCheckBox.isChecked() + "\n");
                stringBuilder.append(dadCheckBox.getText().toString() + " status is: " +
                    dadCheckBox.isChecked() + "\n");
                stringBuilder.append(grandpaCheckBox.getText().toString() + " status is: " +
                    grandpaCheckBox.isChecked() + "\n");

                resultTextView.setText(stringBuilder);
            }
        });
    }
}
