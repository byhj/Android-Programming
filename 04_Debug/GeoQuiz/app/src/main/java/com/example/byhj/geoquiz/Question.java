package com.example.byhj.geoquiz;

/**
 * Created by byhj-PC on 2015/11/20.
 */
public class Question {

    //hold the resource ID for a string
    private int mTextResid;
    private boolean mAnswerTrue;

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResid() {
        return mTextResid;
    }

    public void setTextResid(int textResid) {
        mTextResid = textResid;
    }

    public Question(int textResid, boolean answerTrue)
    {
        mTextResid = textResid;
        mAnswerTrue = answerTrue;
    }
}
