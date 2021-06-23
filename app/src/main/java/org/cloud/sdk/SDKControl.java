package org.cloud.sdk;

import android.util.Log;
import layaair.game.browser.ConchJNI;
public class SDKControl {
    public static String TAG = "vgame";

    public static void ASCallAndroid(String id,String level){
        Log.i(TAG,level);
        ConchJNI.RunJS("SDKControlAndroid.ShowAd('userASFan')");
    }
    public static void TakeIn(String id,String level){
        Log.w(TAG,id+"+   +"+level);
    }
    public  static  void  doStatistics(String event,String level){
        Log.i(TAG,event+"   "+"第"+level+"关");
    }
    public static void showAd(String type){
        Log.i(TAG,"广告播放成功 类型"+"  " +type);
        //广告播放成功设为true,失败设为false
        ConchJNI.RunJS("SDKControlAndroid.CallbackAd('true')");
    }

    public static void StopMusic(){
        Log.i(TAG,"1");
        ConchJNI.RunJS("SDKControlAndroid.StopMusic('true')");
    }
    public static void PlayMusic(){
        Log.i(TAG,"1");
        ConchJNI.RunJS("SDKControlAndroid.StopMusic('false')");
    }

}
