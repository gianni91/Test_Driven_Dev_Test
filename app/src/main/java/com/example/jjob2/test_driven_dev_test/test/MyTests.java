package com.example.jjob2.test_driven_dev_test.test;

import android.test.InstrumentationTestCase;

import com.example.jjob2.test_driven_dev_test.MainActivity;

/**
 * Created by jjob2 on 7/22/2015.
 */
public class MyTests extends InstrumentationTestCase {
    public void testLeapYear() throws Exception {
        assertEquals(MainActivity.isLeapYear(2000), true);
        assertEquals(MainActivity.isLeapYear(1600), true);
        assertEquals(MainActivity.isLeapYear(2400), true);

        assertEquals(MainActivity.isLeapYear(1700), false);
        assertEquals(MainActivity.isLeapYear(1800), false);
        assertEquals(MainActivity.isLeapYear(1900), false);
 //       assertEquals(MainActivity.isLeapYear(1900), true);  //added to fail

        assertEquals(MainActivity.isLeapYear(2012), true);
        assertEquals(MainActivity.isLeapYear(2016), true);
        assertEquals(MainActivity.isLeapYear(2020), true);
        return;
    }

    public void testComputeNumDays() throws Exception {
//        assertEquals(MainActivity.computeNumDays(7,2015), 30);  //added to fail
        assertEquals(MainActivity.computeNumDays(7,2015), 31);
        assertEquals(MainActivity.computeNumDays(2,2012), 29);
        return;
    }
}
