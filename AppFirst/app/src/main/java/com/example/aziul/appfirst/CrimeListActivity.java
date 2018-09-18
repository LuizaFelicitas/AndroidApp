package com.example.aziul.appfirst;

import android.support.v4.app.Fragment;
import android.util.Log;

/**
 * Created by aziul on 10.02.2018.
 */

public class CrimeListActivity extends SingleFragmentActivity {
    private static final String TAG ="TAG" ;

    @Override
    protected Fragment createFragment() {
        Log.d(TAG, "CrimeListActivity is called");
        return new CrimeListFragment();
    }
}
