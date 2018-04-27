package com.example.dino.zd2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_add)
    Button btnAdd;
    @BindView(R.id.btn_substract)
    Button btnSubstract;
    @BindView(R.id.btn_multiply)
    Button btnMultiply;
    @BindView(R.id.btn_divide)
    Button btnDivide;

    @BindView(R.id.et_Number1)
    EditText etNumber1;
    @BindView(R.id.et_Number2)
    EditText etNumber2;

    @BindView(R.id.tv_Result)
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_add)
    public void Add()
    {
        try
        {
            double number1 = Double.parseDouble(etNumber1.getText().toString());
            double number2 = Double.parseDouble(etNumber2.getText().toString());
            double result = number1 + number2;
            tvResult.setText(String.valueOf(result));
        }
        catch(NumberFormatException e)
        {
            Toast.makeText(this, R.string.number_format_exception_text,Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick(R.id.btn_substract)
    public void Substract()
    {
        try
        {
            double number1 = Double.parseDouble(etNumber1.getText().toString());
            double number2 = Double.parseDouble(etNumber2.getText().toString());
            double result = number1 - number2;
            tvResult.setText(String.valueOf(result));
        }
        catch(NumberFormatException e)
        {
            Toast.makeText(this, R.string.number_format_exception_text,Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick(R.id.btn_multiply)
    public void Multiply()
    {
        try
        {
            double number1 = Double.parseDouble(etNumber1.getText().toString());
            double number2 = Double.parseDouble(etNumber2.getText().toString());
            double result = number1 * number2;
            tvResult.setText(String.valueOf(result));
        }
        catch(NumberFormatException e)
        {
            Toast.makeText(this, R.string.number_format_exception_text,Toast.LENGTH_SHORT).show();
        }
    }

    @OnClick(R.id.btn_divide)
    public void Divide()
    {
        try
        {
            double number1 = Double.parseDouble(etNumber1.getText().toString());
            double number2 = Double.parseDouble(etNumber2.getText().toString());
            double result = number1 / number2;
            tvResult.setText(String.valueOf(result));
        }
        catch(NumberFormatException e)
        {
            Toast.makeText(this, R.string.number_format_exception_text,Toast.LENGTH_SHORT).show();
        }
    }
}
