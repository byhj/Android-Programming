package com.example.byhj.beatbox;

/**
 * Created by byhj-PC on 2015/12/15.
 */
public class Sound {
    private String mAssetPath;
    private String mName;
    private Integer mSoundId;

    public Sound(String assetPath)
    {
        mAssetPath = assetPath;
        String [] componennts = mAssetPath.split("/");
        String filename = componennts[componennts.length-1];
        mName = filename.replace(".wav", "");
    }

    public Integer getSoundId()
    {
        return mSoundId;
    }
    public void setSoundId(Integer soundId)
    {
       mSoundId = soundId;
    }

    public String getAssetPath()
    {
        return mAssetPath;
    }
    public String getName()
    {
        return mName;
    }
}
