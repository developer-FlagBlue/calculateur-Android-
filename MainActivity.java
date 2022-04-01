package fr.doranco.caculaterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button0;
    private Button button_Att;
    private Button button_multi;
    private Button button_add;
    private Button button_point;
    private Button button_c;
    private Button button_egal;
    private Button button_division;
    private String value_A;
    private Object result;
    ArrayAdapter<String> stringArrayAdapterr;

    private ScriptEngine scriptEngine;
    List<String> stringList;
    ListView listView;


    @SuppressLint("CutPasteId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.editTextNumberDecimal);
        button1 = findViewById(R.id.button1);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        button5 = findViewById(R.id.button5);
        button6 = findViewById(R.id.button6);
        button7 = findViewById(R.id.button7);
        button8 = findViewById(R.id.button8);
        button9 = findViewById(R.id.button9);
        button0 = findViewById(R.id.button0);
        button_Att = findViewById(R.id.button_add);
        button_multi = findViewById(R.id.button_multi);
        button_point = findViewById(R.id.button_point);
        button_c = findViewById(R.id.button_c);
        button_egal = findViewById(R.id.button_egal);
        button_add = findViewById(R.id.button_add);
        listView = findViewById(R.id.listView);
        button_division = findViewById(R.id.button_division);
        value_A = "";


        stringList = new ArrayList<>();

        stringArrayAdapterr = new ArrayAdapter<>(this, androidx.constraintlayout.widget.R.layout.support_simple_spinner_dropdown_item,
                Collections.unmodifiableList(stringList));
        listView.setAdapter(stringArrayAdapterr);

        // value_A = editText.getText().toString();


    }

    //************************** onStart() **************************************
    @Override
    protected void onStart() {
        super.onStart();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_A += "1";
                editText.setText(value_A);


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_A += "2";
                editText.setText(value_A);


            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_A += "2";
                editText.setText(value_A);


            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_A += "3";
                editText.setText(value_A);


            }
        });
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_A += "4";
                editText.setText(value_A);


            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_A += "5";
                editText.setText(value_A);


            }
        });
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_A += "6";
                editText.setText(value_A);


            }
        });
        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_A += "7";
                editText.setText(value_A);


            }
        });
        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_A += "8";
                editText.setText(value_A);


            }
        });
        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_A += "9";
                editText.setText(value_A);


            }
        });
        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_A += "0";
                editText.setText(value_A);


            }
        });
        button_point.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_A += ".";
                editText.setText(value_A);


            }
        });
        button_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_A += "*";
                editText.setText(value_A);


            }
        });
        button_Att.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_A += "-";
                editText.setText(value_A);


            }
        });
        button_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_A += "+";
                editText.setText(value_A);


            }
        });
        button_division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_A += "/";
                editText.setText(value_A);


            }
        });
        button_c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                value_A = "";
                editText.setText("O");


            }
        });
        button_egal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = "2+3";
                // engine(value_A);


                    ScriptEngineManager scriptEngineManager = new ScriptEngineManager();

                    scriptEngine = scriptEngineManager.getEngineByName("js");
                    try {
                       s1= (String) scriptEngine.eval(s1);
                        stringList.add("resulta = " + s1);
                        stringArrayAdapterr.notifyDataSetChanged();
                    } catch (Exception e) {

                    }


                stringList.add("resulta = " + value_A);
                stringArrayAdapterr.notifyDataSetChanged();

            }
        });


    }

   /* public void engine(String script) {

        try {

            ScriptEngineManager scriptEngineManager = new ScriptEngineManager();

            scriptEngine = scriptEngineManager.getEngineByName("js");
            result = scriptEngine.eval(script);

        } catch (ScriptException e) {
            editText.setText("*************");
        }
    }*/
}