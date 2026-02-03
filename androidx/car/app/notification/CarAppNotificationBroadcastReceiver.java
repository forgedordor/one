package androidx.car.app.notification;

import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Log;
import androidx.car.app.IStartCarApp;
import androidx.car.app.utils.RemoteUtils;
import defpackage.crr;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public class CarAppNotificationBroadcastReceiver extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, final Intent intent) {
        IBinder binder;
        ComponentName componentName = (ComponentName) intent.getParcelableExtra("androidx.car.app.notification.COMPONENT_EXTRA_KEY");
        intent.removeExtra("androidx.car.app.notification.COMPONENT_EXTRA_KEY");
        intent.setComponent(componentName);
        Bundle extras = intent.getExtras();
        if (extras != null) {
            binder = extras.getBinder("androidx.car.app.extra.START_CAR_APP_BINDER_KEY");
            extras.remove("androidx.car.app.extra.START_CAR_APP_BINDER_KEY");
        } else {
            binder = null;
        }
        if (binder == null) {
            Objects.toString(intent);
            Log.e("CarApp.NBR", "Notification intent missing expected extra: ".concat(String.valueOf(intent)));
        } else {
            final IStartCarApp iStartCarAppAsInterface = IStartCarApp.Stub.asInterface(binder);
            iStartCarAppAsInterface.getClass();
            RemoteUtils.e("startCarApp from notification", new crr() { // from class: cqw
                @Override // defpackage.crr
                public final Object a() {
                    iStartCarAppAsInterface.startCarApp(intent);
                    return null;
                }
            });
        }
    }
}
