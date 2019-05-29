package ru.ogorodnik.homework222;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar=(Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(toolbar);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
   //--------------------------------------------------------------------------------------
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_open_notes) {
            Toast.makeText(MainActivity.this, "Отркыть записную книжку", Toast.LENGTH_LONG).show();

            Intent intentNotes = new Intent(MainActivity.this, NotesActivity.class);
            startActivity(intentNotes);

            return true;
        }
//--------------------------------------------------------------------------------------
        if (id == R.id.action_open_calendar) {
            Toast.makeText(MainActivity.this, "Отркыть сроки и задачи", Toast.LENGTH_LONG).show();

            Intent intentCalendar = new Intent(MainActivity.this, CalendarActivity.class);
            startActivity(intentCalendar);

            return true;
        }
//---------------------------------------------------------------------------------------
        if (id == R.id.action_open_goroda) {
            Toast.makeText(MainActivity.this, "Отркыть справочник адресов", Toast.LENGTH_LONG).show();

            Intent intentCalendar = new Intent(MainActivity.this, GorodaActivity.class);
            startActivity(intentCalendar);
            return true;
        }
//---------------------------------------------------------------------------------------
        if (id == R.id.action_open_oplata) {
            Toast.makeText(MainActivity.this, "Открыть варианты оплаты", Toast.LENGTH_LONG).show();

            Intent intentOplata = new Intent(MainActivity.this, OplataActivity.class);
            startActivity(intentOplata);
            return true;
        }
//---------------------------------------------------------------------------------------
        if (id == R.id.action_open_foto) {
            Toast.makeText(MainActivity.this, "Открыть просмотр фотографий", Toast.LENGTH_LONG).show();

            Intent intentFoto = new Intent(MainActivity.this, FotoActivity.class);
            startActivity(intentFoto);
            return true;
        }
//---------------------------------------------------------------------------------------
        if (id == R.id.action_open_podpiska) {
            Toast.makeText(MainActivity.this, "Открыть подписку", Toast.LENGTH_LONG).show();

            Intent intentPodpiska = new Intent(MainActivity.this, PodpiskaActivity.class);
            startActivity(intentPodpiska);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

