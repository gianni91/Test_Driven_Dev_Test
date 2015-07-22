package com.example.jjob2.test_driven_dev_test;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.example.jjob2.test_driven_dev_test.test.MyTests;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public static boolean isLeapYear(int year) {

        //Every fourth year is a leap year unless it is a century year
        //that is not evenly divisible by 400.
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                    return true;
                else
                    return false;
            }
            else
                return true;
        }
        else
            return false;
    }


    public static int computeNumDays(int month, int year)
    {
        //January, March, May, July, August, October, and December have 31
        //days.
        int numDays;
        if (month == 1 || month == 3 || month == 5  ||
                month == 7 || month == 8 || month == 10 || month == 12)
            numDays = 31;

            //February has 28 days unless it is a leap year.
        else if (month == 2)
            if (isLeapYear(year) == true)
                numDays = 29;
            else
                numDays = 28;

            //The rest of the months have 30 days.
        else
            numDays = 30;

        //Return the number of days for that month.
        return numDays;
    }




    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
