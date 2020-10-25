package com.example.menus;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.PopupMenu;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements PopupMenu.OnMenuItemClickListener {

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
        return handleClick(item.getItemId());
    }

    public void showPopUpMenu(View view) {
        PopupMenu popupMenu = new PopupMenu(this, view);
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main_toolbar_menu, popupMenu.getMenu());
        popupMenu.show();
        popupMenu.setOnMenuItemClickListener(this);
    }

    @Override
    public boolean onMenuItemClick(MenuItem item) {
        return handleClick(item.getItemId());
    }

    public boolean handleClick(int itemId) {
        switch (itemId) {
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
            default:
                return false;
        }
    }
}