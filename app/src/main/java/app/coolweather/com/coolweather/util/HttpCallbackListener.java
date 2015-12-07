package app.coolweather.com.coolweather.util;

/**
 * Created by test on 12/4/2015.
 */
public interface HttpCallbackListener {
    void onFinish(String response);
    void onError(Exception e);
}
