package org.tdevelopers.notificationtranslator;

import android.os.Bundle;
import android.content.Intent;
import org.qtproject.qt5.android.bindings.QtApplication;
import org.qtproject.qt5.android.bindings.QtActivity;
import android.util.Log;
import android.content.Context;
import java.util.List;

public class CustomMainActivity extends QtActivity
{

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);

        Intent intent = new Intent("android.settings.ACTION_NOTIFICATION_LISTENER_SETTINGS");
        startActivity(intent);

        Intent serviceIntent = new Intent(this, MyNotificationListenerService.class);
        startService(serviceIntent);
    }

    @Override
    protected void onResume(){      
        super.onResume();
    }

    @Override
    protected void onPause(){
        super.onPause();
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
    }
}
