package ru.ogorodnik.homework222;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FotoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foto);


        final TextView linkText = (TextView) findViewById(R.id.wwwlink);
        final Button frontBtn = (Button) findViewById(R.id.buttonFront);
        final Button backBtn = (Button) findViewById(R.id.buttonBack);

        int num = 1+(int)((100-1+1)*Math.random());
        //String link = String.format(getString(R.string.link));
        //linkText.setText(link + num);
        linkText.setText(getString(R.string.link, num));

// Нажатие кнопки ВПЕРЕД ---------------------------------------------------------------------
        frontBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(FotoActivity.this, FotoActivity.class);
                startActivity(intent);
            }
        });
// Нажатие кнопки НАЗАД ---------------------------------------------------------------------
        backBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

    }
}
