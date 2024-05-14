package com.android.sheguard.api;

import com.android.sheguard.model.NotificationSenderModel;
import com.android.sheguard.util.NotificationResponse;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

public interface NotificationAPI {

    @Headers(
            {
                    "Content-Type:application/json",
                    "Authorization:key=AAAA4lzNwYQ:APA91bEvKfBcFQ0JN7isT7Oir44FeeyPjdSb05_n0tl-IoiCwDkrY-FiXZUrJColOGYHqY1aCj4NEkc64jPqk0OAe2jkspWE4ZFvzNsp31ygsM_fwGawvU6E5C389DhD2NPRbBdWtG40"
            }
    )

    @POST("fcm/send")
    Call<NotificationResponse> sendNotification(@Body NotificationSenderModel body);
}
