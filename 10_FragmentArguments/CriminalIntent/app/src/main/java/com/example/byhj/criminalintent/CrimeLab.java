package com.example.byhj.criminalintent;

import android.content.Context;

import java.lang.reflect.Array;
import java.util.List;
import java.util.PriorityQueue;
import java.util.UUID;
import java.util.ArrayList;
import java.lang.String;

/**
 * Created by byhj on 2015/12/1.
 */


public class CrimeLab {

    private static CrimeLab sCrimeLab;
    private Context mAppConctext;
    private ArrayList<Crime> mCrimes;

    private CrimeLab(Context appContext)
    {
        mAppConctext = appContext;
        mCrimes = new ArrayList<Crime>();
        for (int i = 0; i < 100; i++)
        {
            Crime crime = new Crime();
            crime.setmTitle("Crime  #" + i );
            crime.setmSolved(i % 2 == 0);
            mCrimes.add(crime);
        }
    }

    public static CrimeLab get(Context context)
    {
        if (sCrimeLab == null)
        {
            sCrimeLab = new CrimeLab(context);
        }
        return sCrimeLab;
    }

    public List<Crime> getCrimes()
    {
        return mCrimes;
    }

    public Crime getCrime(UUID id)
    {
        for (Crime crime : mCrimes)
            if (crime.getmId().equals(id))
                return crime;

        return null;
    }
}
