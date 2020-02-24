package xyz.intellij.twoactivate;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(/* Fill the resource id of second_activity.xml (R.layout.....) */);

        TextView textView = /* Get the instance of TextView */

                Intent myIntent = /* Get the Intent object sent from MainActivity */

                Bundle myBundle = /* Get the Bundle object encapsulated in the Intent object */
                String selectedRadiobutton = /* Get the string data encapsulated in the Bundle object */
        if (selectedRadiobutton == "null")
            textView.setText("Not selected any OS");
        else
            textView.setText(selectedRadiobutton + " is selected");
    }

    public void onClickBack(View view) {
        finish(); /* Close/finish the current activity (SecondActivity) */
    }

}
