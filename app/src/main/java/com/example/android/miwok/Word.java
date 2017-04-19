package com.example.android.miwok;

/**
 * Created by arshad on 4/18/17.
 */

public class Word {
    private String english;
    private String translate;

    public Word(String eng, String trans){
        english = eng;
        translate = trans;
    }

    public String getEnglish(){
        return english;
    }
    public String getTranslate(){
        return translate;
    }

}
