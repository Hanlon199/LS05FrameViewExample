package com.example.hanlo.ls05_frameviewexample;

import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Switch;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onToggleButtonClicked(View view){
        //get state
        boolean on = ((ToggleButton) view).isChecked();
        if (on){
            //on
        }
        else{
            //off
        }
    }

    public void onSwitchClicked (View view){
        boolean on = ((Switch) view).isChecked();

        if(on){
            //ON
        }else{
            //off
        }
    }

    public void onCheckboxClicked(View view){
        boolean checked = ((CheckBox) view).isChecked();

        switch (view.getId()){
            case R.id.checkBox_milk:
                if (checked) {
                    //milk coffee
                }else{}
                    //black
                break;

            case R.id.checkBox_sugar:
                if(checked) {
                    //sweet
                }else{
                    //bitter
                }
                break;
        }
    }

    public void onRadioButtonClicked(View view){
        RadioGroup radiogroup = (RadioGroup) findViewById(R.id.radio_group);
        int id = radiogroup.getCheckedRadioButtonId();
        switch (id){
            case R.id.radio_cavemen:
                //cavemen win
                break;
            case R.id.radio_astronauts:
                //astro wins
                break;

        }
    }
}
