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

    private String mUrl;

    public Earthquake(double magnitude, String vEqPlace, long timeInMilliseconds, String url)
    {
        mMagnitude = magnitude;
        mEqPlace = vEqPlace;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
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

    public String getUrl() {
        return mUrl;
    }

}


