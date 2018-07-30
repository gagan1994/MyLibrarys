package com.example.gagan.androidlibrarycustom;

import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.DegreeToFahrenheitConverter.CustomThrmoMeter;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private RadioGroup rg_DtoC;
    private TextInputEditText et_data;
    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg_DtoC = (RadioGroup) findViewById(R.id.rg_DtoC);
        et_data = (TextInputEditText) findViewById(R.id.et_data);
        findViewById(R.id.btn_save).setOnClickListener(this);
        tv_result = (TextView) findViewById(R.id.tv_result);

    }

    @Override
    public void onClick(View v) {
        if (et_data.getText().toString().trim().length() == 0) {
            et_data.setError("This field cant be empty");
            return;
        }

        int data = Integer.parseInt(et_data.getText().toString());
        int selectedId = rg_DtoC.getCheckedRadioButtonId();
        float output = 0;
        String outputText = "";
        switch (selectedId) {
            case R.id.rb_C:
                output = CustomThrmoMeter.ToDegreeCelsius(data);
                outputText = data + " F in °C  is :" + output;
                break;
            case R.id.rb_F:
                output = CustomThrmoMeter.ToFahrenheit(data);
                outputText = data + " °C  in F is :" + output;
                break;
            default:
                display("Select Conversion Type");
                return;
        }
        tv_result.setText(outputText);

    }

    private void display(String displayMessage) {
        Toast.makeText(this, displayMessage, Toast.LENGTH_LONG).show();
    }
}
