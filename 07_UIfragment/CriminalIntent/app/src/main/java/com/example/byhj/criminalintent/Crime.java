package com.example.byhj.criminalintent;

import java.util.UUID;

/**
 * Created by byhj on 11/30/2015.
 */

public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime()

    {
        mId = UUID.randomUUID();
    }

    public UUID getmId()
    {
        return mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
