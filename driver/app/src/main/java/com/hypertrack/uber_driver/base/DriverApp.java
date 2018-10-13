package com.hypertrack.uber_driver.base;

import android.app.Application;
import android.util.Log;

import com.hypertrack.uber_driver.R;
import com.hypertrack.lib.HyperTrack;

/**
 * Created by pkharche on 06/04/18.
 */
public class DriverApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        HyperTrack.initialize(this, getString(R.string.AAAA9gV9hwg:APA91bHT0ZetKhTKncsuwawDHpEkgLfvrG6_vXYXak4Upa2lXzu8MCZ2-lJCB-7fYexDCf1A1MFfC65vLK7QYABIQaslPCtweQ8ie3sR_RqmkEkktOvbKkspsN4u6EoTr3LJfOGR8rNV));
        HyperTrack.enableDebugLogging(Log.VERBOSE);
        //TODO add Fabric/Crashlytics
    }
}
