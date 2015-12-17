package com.example.byhj.beatbox;

import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
/**
 * Created by byhj on 2015/12/8.
 */

public abstract class SingleFragmentActivity extends  AppCompatActivity {

     protected abstract Fragment createFragment();

    protected int getLayoutResId()
    {
        return R.layout.activity_fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResId());

        FragmentManager fm = getFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

        if (fragment == null)
        {
            fragment = createFragment();
            fm.beginTransaction().add(R.id.fragmentContainer, fragment).commit();
        }
    }

}
