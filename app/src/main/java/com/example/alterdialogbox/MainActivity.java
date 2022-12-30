package com.example.alterdialogbox;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.alterdialogbox.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.clickbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Dialog dialog=new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.dialoddesign);

                EditText editText=dialog.findViewById(R.id.edt1);
                EditText editText1=dialog.findViewById(R.id.edt2);
                Button button=dialog.findViewById(R.id.sendbtn);

                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        AlertDialog.Builder alterdialog=new AlertDialog.Builder(MainActivity.this)
                                .setTitle("AlterDialog")
                                .setMessage("Are you sure to sendData")
                                .setPositiveButton("yes", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {
                                        Intent intent=new Intent(MainActivity.this,MainActivity2.class);
                                        intent.putExtra("name",editText.getText().toString());
                                        intent.putExtra("Fname",editText1.getText().toString());
                                        startActivity(intent);

                                    }
                                }).setNegativeButton("No", new DialogInterface.OnClickListener() {
                                    @Override
                                    public void onClick(DialogInterface dialog, int which) {

                                    }
                                });
                        alterdialog.show();
                    }
                });

                dialog.show();
            }
        });
    }
}