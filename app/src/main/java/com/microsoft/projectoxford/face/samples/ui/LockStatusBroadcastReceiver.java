package com.microsoft.projectoxford.face.samples.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class LockStatusBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Log.i("vvvv","received");
        Toast.makeText(context, "Received", Toast.LENGTH_SHORT).show();
        if(intent.getAction().equals(Intent.ACTION_USER_PRESENT)){
            Toast.makeText(context, "Screen unlocked", Toast.LENGTH_SHORT).show();
        }
        else if(intent.getAction().equals(Intent.ACTION_SHUTDOWN)){
            Toast.makeText(context, "Screen unlocked", Toast.LENGTH_SHORT).show();

        }
    }
}
