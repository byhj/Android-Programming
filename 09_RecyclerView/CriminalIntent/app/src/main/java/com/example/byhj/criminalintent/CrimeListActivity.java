package com.example.byhj.criminalintent;

/**
 * Created by byhj on 2015/12/1.
 */

import android.support.v4.app.Fragment;


public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected  Fragment  createFragment()
    {
        return new CrimeListFragment();
    }

}
