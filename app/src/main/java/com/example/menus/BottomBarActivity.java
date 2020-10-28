package com.example.menus;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
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

        Button btnShowAlertDialog = findViewById(R.id.btn_showAlertDialog);
        Button btnShowAlertOption = findViewById(R.id.btn_showAlertOption);

        btnShowAlertDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(BottomBarActivity.this);
                alertDialog.setTitle("Delete this file");
                alertDialog.setCancelable(false);

                alertDialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(BottomBarActivity.this, "Yes Clicked", Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });

                alertDialog.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(BottomBarActivity.this, "No Clicked", Toast.LENGTH_SHORT).show();
                        dialog.cancel();
                    }
                });

                alertDialog.show();
            }
        });

        btnShowAlertOption.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(BottomBarActivity.this);
                alertDialog.setTitle("Select option");
                alertDialog.setCancelable(false);

                CharSequence options[] = new CharSequence[]{"Option 1", "Option 2", "Option 3"};
                alertDialog.setItems(options, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        switch (which) {
                            case 0:
                                Toast.makeText(BottomBarActivity.this, "Option 1 clicked", Toast.LENGTH_SHORT).show();
                                break;
                            case 1:
                                Toast.makeText(BottomBarActivity.this, "Option 2 clicked", Toast.LENGTH_SHORT).show();
                                break;
                            case 2:
                                Toast.makeText(BottomBarActivity.this, "Option 3 clicked", Toast.LENGTH_SHORT).show();
                                break;
                        }
                    }
                });

                alertDialog.show();
            }
        });

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