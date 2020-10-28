package com.example.menus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.bottomappbar.BottomAppBar;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class BottomBarActivity extends AppCompatActivity {

    private BottomAppBar bottomAppBar;
    private FloatingActionButton fab;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_bar);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(BottomBarActivity.this, "Fab clicked", Toast.LENGTH_SHORT).show();
            }
        });
        
        bottomAppBar = findViewById(R.id.bottomAppBar);
        bottomAppBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.homeFragment:
                        Toast.makeText(BottomBarActivity.this, "Home Fragment", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.aboutUsFragment:
                        Toast.makeText(BottomBarActivity.this, "About Us Fragment", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.profileFragment:
                        Toast.makeText(BottomBarActivity.this, "Profile Fragment", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.cartFragment:
                        Toast.makeText(BottomBarActivity.this, "Cart Fragment", Toast.LENGTH_SHORT).show();
                        return true;
                }
                return false;
            }
        });
    }
}