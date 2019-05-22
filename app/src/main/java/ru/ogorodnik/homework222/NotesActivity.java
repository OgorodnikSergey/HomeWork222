package ru.ogorodnik.homework222;

import android.content.SharedPreferences;
//import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class NotesActivity extends AppCompatActivity {
    private EditText mInputNote;
    private Button mBtnSaveNote;
    private SharedPreferences myNoteSharedPref;
    private static String NOTE_TEXT = "note_text";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_notes);
        initViews();
        getDateFromSharedPref();

//После сохранения данных выведем на экран сообщение для пользователя
        mBtnSaveNote.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor myEditor = myNoteSharedPref.edit();
                String noteTxt = mInputNote.getText().toString();
                myEditor.putString(NOTE_TEXT, noteTxt);
                myEditor.apply();
                Toast.makeText(NotesActivity.this, "данные сохранены", Toast.LENGTH_LONG).show();
            }
        });
    }

    private void getDateFromSharedPref() {
        String noteTxt = myNoteSharedPref.getString(NOTE_TEXT, ""); //чтение данных из myNoteSharedPref
        mInputNote.setText(noteTxt);   //присваивает полученные данные полю mInputNote.
    }

    private void initViews() {
        mInputNote = findViewById(R.id.inputNote);
        mBtnSaveNote = findViewById(R.id.btnSaveNote);
        myNoteSharedPref = getSharedPreferences("MyNote", MODE_PRIVATE);
    }
}
