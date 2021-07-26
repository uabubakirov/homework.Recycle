package com.example.homeworkrecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddTask extends AppCompatActivity {
    EditText etTitle,etDescription;
    Button btnSave;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_task);
        etTitle = findViewById(R.id.et_title);
        etDescription = findViewById(R.id.et_description);
        btnSave = findViewById(R.id.btn_save);
        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = etTitle.getText().toString();
                String description = etDescription.getText().toString();
                if(!title.isEmpty() && !description.isEmpty()){
                    Intent intent = new Intent();
                    intent.putExtra("Title",title);
                    intent.putExtra("Description",description);
                    setResult(RESULT_OK,intent);
                    finish();
                }else{
                    etTitle.setError("Enter title!");
                    etDescription.setError("Enter decription!!");
                }

            }
        });
    }
}