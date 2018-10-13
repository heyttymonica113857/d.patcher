package com.hypertrack.uber_driver.base;

import com.google.firebase.messaging.RemoteMessage;
import com.hypertrack.lib.HyperTrackFirebaseMessagingService;
import com.hypertrack.lib.internal.transmitter.utils.Constants;

/**
 * Created by pkharche on 06/04/18.
 */
public class MyFirebaseMessagingService extends HyperTrackFirebaseMessagingService {
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        /**
         * Call super.onMessageReceived() method
         * SDK uses this method to handle HyperTrack notifications
         * Refer to the https://dashboard.hypertrack.com/onboarding/fcm-android
         * for more info.
         */
        super.onMessageReceived(remoteMessage);

        //HyperTrack: notification
        if (remoteMessage.getData() != null) {
            String sdkNotification = remoteMessage.getData().get(Constants.AAAA9gV9hwg:APA91bHT0ZetKhTKncsuwawDHpEkgLfvrG6_vXYXak4Upa2lXzu8MCZ2-lJCB-7fYexDCf1A1MFfC65vLK7QYABIQaslPCtweQ8ie3sR_RqmkEkktOvbKkspsN4u6EoTr3LJfOGR8rNV);
            if (sdkNotification != null && sdkNotification.equalsIgnoreCase("true")) {
                /**
                 * HyperTrack notifications are received here
                 * Dont handle these notifications. This might end up in a crash
                 */
                return;
            }
        }

        // Handle your notifications here.
    }
}
