package com.bignerdranch.android.beatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by AGiP on 19.11.2020.
 */

public class SoundViewModel extends BaseObservable {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox){
        mBeatBox = beatBox;
    }

    @Bindable
    public String getTitle(){
        return mSound.getName();
    }

    public Sound getSound(){
        return mSound;
    }

    public void setSound(Sound sound){
        mSound = sound;
        notifyChange();
    }
    public void onButtonClicked(){
        mBeatBox.play(mSound);
    }
}
