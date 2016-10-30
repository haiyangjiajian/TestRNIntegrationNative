package com.haiyangjiajian.testrnintegrationnative.module;

import android.app.Activity;
import android.content.Intent;
import android.widget.Toast;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.haiyangjiajian.testrnintegrationnative.activity.MainActivity;
import com.haiyangjiajian.testrnintegrationnative.activity.ReactActivity;

/**
 * Created by ZhaoHaiyang on 2016/10/28.
 */
public class NativeActivityModule extends ReactContextBaseJavaModule {

    public NativeActivityModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }


    @Override
    public String getName() {
        return "GotoActivity";
    }

    @ReactMethod
    public void gotoMainActivity() {
        Activity currentActivity = getCurrentActivity();
        Intent intent = new Intent(currentActivity, MainActivity.class);
        currentActivity.startActivity(intent);
        currentActivity.finish();
    }
}
