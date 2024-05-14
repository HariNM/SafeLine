package com.android.safeline.api;

import com.android.safeline.model.NotificationSenderModel;
import com.android.safeline.util.NotificationResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface NotificationAPI {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key= XXXXXXXXXXXX" //replace with your own authorization key which you get from Firbase
            }
    )

    @POST("fcm/send")
    Call<NotificationResponse> sendNotification(@Body NotificationSenderModel body);
}
