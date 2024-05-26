package com.example.tates;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.example.tates.Models.Notes;

import java.text.SimpleDateFormat;
import java.util.Date;

public class NotesTakerActivite extends AppCompatActivity {
    EditText editText_title,editText_notes;
    ImageButton imageButton_save;
    Notes notes;
    boolean isOldNote = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes_taker_activite);
        editText_title = findViewById(R.id.editText_title);
        editText_notes = findViewById(R.id.editText_notes);
        imageButton_save = findViewById(R.id.imagebutton_save);
        notes = new Notes();
        try {
            notes = (Notes) getIntent().getSerializableExtra("old_note");
            editText_notes.setText(notes.getNotes());
            editText_title.setText(notes.getTitle());
            isOldNote = true;
        }catch (Exception e){
            e.printStackTrace();}
        imageButton_save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String title = editText_title.getText().toString();
                String description = editText_notes.getText().toString();
                if(description.isEmpty()){
                    Toast.makeText(NotesTakerActivite.this,"Почему ты ничего не написал?!",Toast.LENGTH_LONG).show();
                    return;
                }
                SimpleDateFormat formater = new SimpleDateFormat("EEE, d MMM yyyy HH:mm:ss");
                Date date = new Date();
                if(!isOldNote){
                    notes = new Notes();
                }

                notes.setTitle(title);
                notes.setNotes(description);
                notes.setDate(formater.format(date));

                Intent intent = new Intent();
                intent.putExtra("note",notes);
                setResult(Activity.RESULT_OK,intent);
                finish();

            }
        });
    }
}