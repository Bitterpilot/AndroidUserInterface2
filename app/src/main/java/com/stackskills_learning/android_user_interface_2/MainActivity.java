package com.stackskills_learning.android_user_interface_2;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button showDialog;

    private AlertDialog.Builder alertDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showDialog = (Button) findViewById(R.id.showDialog);
        showDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Show the dialog
                alertDialog = new AlertDialog.Builder(MainActivity.this);

              //set up the dialog (put the peaces together)
                alertDialog.setTitle(R.string.alert_title);
                //Alternative method
                //alertDialog.setTitle(getResources().getString(R.string.alert_title));

                //set message
                alertDialog.setMessage(R.string.alert_message);

                //set cancelable (force user to decide they can't just go back or touch else where to close the dialog)
                alertDialog.setCancelable(false);

                //set buttons
                alertDialog.setPositiveButton(R.string.alert_positive,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                //exit window activity ie; close app
                                MainActivity.this.finish();
                            }
                        });
                alertDialog.setNegativeButton(R.string.alert_negative,
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.cancel();
                            }
                        });
              //create dialog
                AlertDialog dialog = alertDialog.create();
              //show dialog
                dialog.show();

            }
        });
    }
}
