package com.example.android.quakereport;

/**
 * Created by will on 27/07/2017.
 */

public class Earthquake {

    private String mEqMagnitude;

    private String mEqPlace;

    private String mEqDate;

    private long mTimeInMilliseconds;


    public Earthquake(String vEqMagnitude, String vEqPlace, long timeInMilliseconds)
    {
        mEqMagnitude = vEqMagnitude;
        mEqPlace = vEqPlace;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public String getEqPlace() {
        return mEqPlace;
    }


    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }


    public String getEqMagnitude() {
        return mEqMagnitude;
    }
}


   // reset head test03