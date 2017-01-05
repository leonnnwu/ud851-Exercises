package com.example.android.background.sync;

import android.content.Context;

import com.example.android.background.utilities.PreferenceUtilities;

public class ReminderTasks {
    public static final String ACTION_INCREMENT_WATER_COUNT = "ACTION_INCREMENT_WATER_COUNT";

    private static void incrementWaterCount(Context context) {
        PreferenceUtilities.incrementWaterCount(context);
    }

    public static void executeTask(Context context, String action) {
        if(ACTION_INCREMENT_WATER_COUNT.equals(action)) {
            incrementWaterCount(context);
        }
    }
}

// Done (1) Create a class called ReminderTasks

// Done (2) Create a public static constant String called ACTION_INCREMENT_WATER_COUNT

// Done (6) Create a public static void method called executeTask
// Done (7) Add a Context called context and String parameter called action to the parameter list

// Done (8) If the action equals ACTION_INCREMENT_WATER, call this class's incrementWaterCount

// Done (3) Create a private static void method called incrementWaterCount
// Done (4) Add a Context called context to the argument list
// Done (5) From incrementWaterCount, call the PreferenceUtility method that will ultimately update the water count