package com.example.myvideoapplication;

import android.os.AsyncTask;
import android.util.Log;

import com.arthenica.smartexception.java9.Exceptions;

import java.io.IOException;
import static com.example.myvideoapplication.MainActivity.TAG;

public class AsyncCatImageTask extends AsyncTask<String, Integer, Integer> {

    @Override
    protected Integer doInBackground(String... inputs) {
        try {
            final String asyncCommand = "cat " + inputs[0] + " > " + inputs[1];
            Log.d(TAG, String.format("Starting async cat image command: %s", asyncCommand));

            final Process process = Runtime.getRuntime().exec(new String[]{"sh", "-c", asyncCommand});
            int rc = process.waitFor();

            Log.d(TAG, String.format("Async cat image command: %s exited with %d.", asyncCommand, rc));

            return rc;
        } catch (final IOException | InterruptedException e) {
            Log.e(TAG, String.format("Async cat image command failed for %s.%s", inputs[0], Exceptions.getStackTraceString(e)));
            return -1;
        }
    }

}