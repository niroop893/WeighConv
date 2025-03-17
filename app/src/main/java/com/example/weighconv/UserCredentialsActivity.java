package com.example.weighconv;

import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserCredentialsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_credentials);

        TableLayout tableLayout = findViewById(R.id.tableLayout);

        // Example data to display in the table
        String[][] data = {
                {"1", "App 1", "user1", "password1"},
                {"2", "App 2", "user2", "password2"},
                {"3", "App 3", "user3", "password3"}
        };

        for (String[] rowData : data) {
            TableRow row = new TableRow(this);

            for (String cellData : rowData) {
                TextView cell = new TextView(this);
                cell.setText(cellData);
                row.addView(cell);
            }

            tableLayout.addView(row);
        }
    }
}