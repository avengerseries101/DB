package com.example.lifecycleawarecomponentsexample;

import android.util.Log;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.OnLifecycleEvent;

public class MainActivityObserver implements LifecycleObserver {

    private String TAG = "Main";

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public void onEventCreateFunction(){
        Log.d(TAG, "onCreate: Observer");
    }
    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public void onEventDestroyFunction(){
        Log.d(TAG, "onDestroy: Observer");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public void onEventPauseFunction(){
        Log.d(TAG, "onPause: Observer");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public void onEventResumeFunction(){
        Log.d(TAG, "onResume: Observer");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public void onEventStartFunction(){
        Log.d(TAG, "onStart: Observer");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public void onEventStopFunction(){
        Log.d(TAG, "onStop: Observer");
    }
}
