package com.deor.oneiconpack.applications;

import android.support.annotation.NonNull;

import com.dm.material.dashboard.candybar.applications.CandyBarApplication;

public class CandyBar extends CandyBarApplication {

    @NonNull
    @Override
    public Configuration onInit() {
        //Sample configuration
        Configuration configuration = new Configuration();

        configuration.setGenerateAppFilter(true);
        configuration.setGenerateAppMap(true);
        configuration.setGenerateThemeResources(true);

        configuration.setAutomaticIconsCountEnabled(true);
        configuration.setShowTabIconsCount(true);

        return configuration;
    }
}
