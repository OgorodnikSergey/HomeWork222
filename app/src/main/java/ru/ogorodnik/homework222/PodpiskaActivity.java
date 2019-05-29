package ru.ogorodnik.homework222;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class PodpiskaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_podpiska);

        final TextView exampleText = (TextView) findViewById(R.id.textView2);
        final EditText userNameText = (EditText) findViewById(R.id.editusername);
        final EditText userMailText = (EditText) findViewById(R.id.editemail);
        final Button buttonOk = (Button) findViewById(R.id.okbutton);
        final Button buttonClear = (Button) findViewById(R.id.clearbutton);

        // Нажимаем на кнопку ОК
        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // String str1 = getString(R.string.text1, userNameText.getText(), userMailText.getText());
                // String str2 = getString(R.string.text2);
                // exampleText.setText(str1 + " " + userNameText.getText() + " " + str2 + " " + userMailText.getText());
                exampleText.setText(getString(R.string.text1, userNameText.getText(), userMailText.getText()));
            }
        });
        // Нажимаем на кнопку ОЧИСТИТЬ
        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                exampleText.setText("");
                userMailText.setText("");
                userNameText.setText("");
            }
        });

    }
}
