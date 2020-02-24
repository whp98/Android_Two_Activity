package xyz.intellij.twoactivate;

import android.app.Activity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.RadioButton;


public class MainActivity extends Activity {

    RadioButton radioButton1,radioButton2,radioButton3;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(/* Fill the resource id of activity_main.xml (R.layout.....) */);

        radioButton1 = (RadioButton) findViewById(R.id.radioButton1);
        radioButton2 = /* Get the instance of RadioButton2 (similar to RadioButton1) */
                radioButton3 = /* Get the instance of RadioButton3 (similar to RadioButton1) */
    }

    public void onClickSubmit(View view) {

        Intent myIntent = /* Create an Intent object */
                myIntent.setClass(MainActivity.this, /* Specify the activity to start (SecondActivity) */ );

        Bundle myBundle = /* Create an Bundle object */

        if(radioButton1.isChecked())
            myBundle.putString("selected_radiobutton", (String) radioButton1.getText());
        else if (radioButton2.isChecked())
        /* If radionButton2 is checked, put its string to myBundle object */
        else if (radioButton3.isChecked())
        /* If radionButton3 is checked, put its string to myBundle object */
        else
        myBundle.putString("selected_radiobutton", "null");

        myIntent.putExtras(/* Put the bundled data in the Intent object */);

        startActivity(/* Send the Intent object to the target activity */);
    }
}

