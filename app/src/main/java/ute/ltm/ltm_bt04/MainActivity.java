package ute.ltm.ltm_bt04;

import ute.ltm.ltm_bt04.sqlite.*;
import ute.ltm.ltm_bt04.ui.UserListActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {

    Button btnGoToSQLite;
    Button btnGoToDataBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGoToSQLite = findViewById(R.id.btnGoToSQLite);
        btnGoToSQLite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SQLiteActivity.class);
                startActivity(intent);
            }
        });

        btnGoToDataBinding = findViewById(R.id.btnGoToDataBinding);
        btnGoToDataBinding.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, UserListActivity.class);
                startActivity(intent);
            }
        });
    }
}