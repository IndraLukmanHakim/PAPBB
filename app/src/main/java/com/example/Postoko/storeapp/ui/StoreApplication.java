
package com.example.Postoko.storeapp.ui;

import android.app.Application;
import android.content.Context;

import com.example.Postoko.storeapp.utils.AppConstants;
import com.facebook.stetho.Stetho;

public class StoreApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (AppConstants.LOG_STETHO) {
            //When Stetho Logging is enabled (Debug mode only), initialise Stetho
            initializeStetho(this);
        }
    }


    private void initializeStetho(final Context context) {
        //Initializing with all Defaults
        Stetho.initializeWithDefaults(context);
    }
}
