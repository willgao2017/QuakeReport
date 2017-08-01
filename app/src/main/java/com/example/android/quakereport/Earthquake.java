package com.example.android.quakereport;

/**
 * Created by will on 27/07/2017.
 */

public class Earthquake {

    private String mEqMagnitude;

    private String mEqPlace;

    private String mEqDate;

    private long mTimeInMilliseconds;

    private double mMagnitude;



    public Earthquake(double magnitude, String vEqPlace, long timeInMilliseconds)
    {
        mMagnitude = magnitude;
        mEqPlace = vEqPlace;
        mTimeInMilliseconds = timeInMilliseconds;
    }

    public String getEqPlace() {
        return mEqPlace;
    }


    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }


    public double getMagnitude() {
        return mMagnitude;
    }

}


   // reset head test03