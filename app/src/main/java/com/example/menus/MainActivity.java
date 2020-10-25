package com.example.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_toolbar_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_1:
                Toast.makeText(this, "Menu 1 clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_2_a:
                Toast.makeText(this, "Menu 2 a clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_2_b:
                Toast.makeText(this, "Menu 2 b clicked", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.menu_3:
                Toast.makeText(this, "Menu 3 clicked", Toast.LENGTH_SHORT).show();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}