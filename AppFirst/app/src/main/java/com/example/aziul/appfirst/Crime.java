package com.example.aziul.appfirst;

import java.util.Date;
import java.util.UUID;

/**
 * Created by aziul on 05.01.2018.
 */

public class Crime {
    private UUID mId;
    private String mTitle;
    private boolean mSolved;
    private String mSuspect;
    private Date mDate;

    public Date getDate() {
        return mDate;
    }

    public void setDate(Date date) {
        mDate = date;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Crime(){
       this(UUID.randomUUID());
    }
    public Crime(UUID id){
        mId=id;
        mDate=new Date();
    }
    public UUID getId() {
        return mId;
    }
    public String getTitle() {
        return mTitle;
    }
    public void setTitle(String title) {
        mTitle = title;
    }
    public String getSuspect(){
        return mSuspect;
    }
    public void setSuspect(String suspect){
        mSuspect=suspect;
    }
}

