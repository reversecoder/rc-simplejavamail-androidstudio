package com.reversecoder.javamail.application;

import android.app.Application;
import android.content.Context;

import com.reversecoder.javamail.library.util.ConfigLoader;

/**
 * Created by rashed on 3/28/17.
 */

public class JavaMailApplication extends Application {

    private static Context mContext;
    private static final String DEFAULT_CONFIG_FILENAME = "simplejavamail.properties";
//    private static final String CANARO_EXTRA_BOLD_PATH = "fonts/canaro_extra_bold.otf";
//    public static Typeface canaroExtraBold;

    @Override
    public void onCreate() {
        super.onCreate();
        mContext = this;
//        initTypeface();
//        try {
//            ConfigLoader.loadProperties(mContext, DEFAULT_CONFIG_FILENAME, false);
//        } catch (Exception ex) {
//            ex.printStackTrace();
//        }
    }

//    private void initTypeface() {
//        canaroExtraBold = Typeface.createFromAsset(getAssets(), CANARO_EXTRA_BOLD_PATH);
//    }

    public static Context getGlobalContext() {
        return mContext;
    }

}
