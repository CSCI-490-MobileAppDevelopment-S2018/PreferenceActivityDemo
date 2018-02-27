package com.stingersof.userprefsdemo;

import android.os.Bundle;
import android.preference.PreferenceFragment;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;

/**
 * Created by kbriggs on 2/26/18.
 */

public class SimpleUserPrefsFragment extends PreferenceFragment {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        PreferenceManager manager = getPreferenceManager();

        // set the underlying Shared Preference name so we can use it in app
        manager.setSharedPreferencesName("user_prefs");
        addPreferencesFromResource(R.xml.userprefs);
    }
}
