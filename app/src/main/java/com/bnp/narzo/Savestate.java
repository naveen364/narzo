package com.bnp.narzo;

import android.content.Context;
import android.content.SharedPreferences;

public class Savestate {
    Context context;
    SharedPreferences sharedPreferences;

    public Savestate(Context context){
        this.context=context;
        sharedPreferences = context.getSharedPreferences("preference",Context.MODE_PRIVATE);
    }

    public void setState(boolean b){
        SharedPreferences.Editor editor =sharedPreferences.edit();
        editor.putBoolean("bkey",b);
        editor.apply();
    }

    public boolean getState(){
        return sharedPreferences.getBoolean("bkey",false);
    }
}

