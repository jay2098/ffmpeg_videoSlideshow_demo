package com.example.myvideoapplication;

import android.content.Context;
import android.widget.Toast;

public class Popup {

    public static void show(final Context context, final String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

}
