package com.example.jeremie.welcome;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final CheckBox checkBox = (CheckBox) findViewById(R.id.checkBox);
        final Button button = findViewById(R.id.button);
        final EditText etFirstname = findViewById(R.id.etFirstname);


        final EditText etLastName = findViewById(R.id.etLastName);


        final TextView twcongrat = findViewById(R.id.twcongrat);
        final Toast buttontoast = Toast.makeText(getApplicationContext(), " Please fill your firstname and lastname!", Toast.LENGTH_SHORT);


            checkBox.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view){

                    if (checkBox.isChecked()) {
                    button.setEnabled(true) ;
                    etFirstname.setEnabled(true);
                    etLastName.setEnabled(true);
                    }
                    else{
                    etFirstname.setEnabled(false);
                    etLastName.setEnabled(false);
                    twcongrat.setText("");
                    etLastName.getText().clear();
                    etFirstname.getText().clear();

                    }
                }


            });

            button.setOnClickListener(new View.OnClickListener() {

                public void onClick(View view){
                    final String stLastName = etLastName.getText().toString();
                    final String stFirstname = etFirstname.getText().toString();
                    if (stFirstname.matches("") || stLastName.matches("")){

                        buttontoast.show();
                        return;
                    }
                    else
                    {
                        twcongrat.setText("Congratulations " + stFirstname + " " + stLastName);
                        return;
                    }
                }
            });



    }
}
