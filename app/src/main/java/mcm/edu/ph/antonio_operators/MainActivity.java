package mcm.edu.ph.antonio_operators;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView display;
        display =  findViewById(R.id.displayText);

        int birthYear = 2001;
        int birthMonth = 4;
        int birthDay = 3;
        int currentYear = 2021;
        int currentMonth = 3;
        int currentDay = 8;
        int ageInYears, ageInMonths, ageInDays;

        birthMonth +=12;
        currentYear-= 1;

        ageInYears = currentYear - birthYear;
        ageInMonths = currentMonth - birthMonth;
        ageInDays = currentDay - birthDay;

        display.setText("My exact age is "+ String.valueOf(ageInYears)+"Years"+String.valueOf(ageInMonths)
                +"\nMonths"+String.valueOf(ageInDays)+"Days");
    }
}