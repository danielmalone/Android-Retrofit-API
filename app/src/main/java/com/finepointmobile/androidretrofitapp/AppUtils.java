package com.finepointmobile.androidretrofitapp;

/**
 * Created by danielmalone on 7/22/17.
 */

public class AppUtils {

    public static final String BASE_URL = "https://api.stackexchange.com/2.2/";

    public static SOService getSOService() {
        return RetrofitClient.getClient(BASE_URL).create(SOService.class);
    }
}
