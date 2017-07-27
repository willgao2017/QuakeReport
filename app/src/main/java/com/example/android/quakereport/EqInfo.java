package com.example.android.quakereport;

/**
 * Created by will on 27/07/2017.
 */

public class EqInfo {

    private String mEqMagnitude;

    private String mEqPlace;

    private String mEqDate;


    public EqInfo(String vEqMagnitude, String vEqPlace, String vEqDate)
    {
        mEqMagnitude = vEqMagnitude;
        mEqPlace = vEqPlace;
        mEqDate = vEqDate;
    }

    public String getEqPlace() {
        return mEqPlace;
    }


    public String getEqDate() {
        return mEqDate;
    }


    public String getEqMagnitude() {
        return mEqMagnitude;
    }
}
