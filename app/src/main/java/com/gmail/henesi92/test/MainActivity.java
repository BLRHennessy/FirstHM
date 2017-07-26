package com.gmail.henesi92.test;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener{


    private Button changeButton;
    private EditText editText1;
    private EditText editText2;
    private boolean bool=true;
    private int i;

    @Override
    protected void onCreate (@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("MainActivity","onCreate");
        setContentView(R.layout.activity_main);
        changeButton = (Button) findViewById(R.id.changeButton);
        editText1= (EditText) findViewById(R.id.editText);
        editText2= (EditText) findViewById(R.id.editText2);
        editText1.setText(R.string.textToEdit);
        View.OnClickListener onClickLis =new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               switch (v.getId()){
                   case R.id.editText:
                       editText1.setText(R.string.textToEdit);
                       editText2.setText("");
                       break;
                   case R.id.editText2:
                       editText2.setText(R.string.textToEdit);
                       editText1.setText("");
                       break;
                   default:break;
               }
            }
        };


        changeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (bool){
                    editText2.setText(R.string.textToEdit);
                    editText1.setText("");
                    bool=false;
                }else{
                    editText1.setText(R.string.textToEdit);
                    editText2.setText("");
                    bool=true;
                }
            }
        });
        editText1.setOnClickListener(onClickLis);
        editText2.setOnClickListener(onClickLis);
    }

    @Override
    public void onClick(View v) {
        if (bool){
            editText2.setText(R.string.textToEdit);
            editText1.setText("");
            bool=false;
        }else{
            editText1.setText(R.string.textToEdit);
            editText2.setText("");
            bool=true;
        }
    }


    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity","onDestroy");
    }

    @Override
    protected void onStart() {//Развернутое состояние
        super.onStart();
        Log.d("MainActivity","onStart");
    }

    @Override
    protected void onStop() {//свернутое состояние
        super.onStop();
        Log.d("MainActivity","onStop");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity","onPause");

    }


}
