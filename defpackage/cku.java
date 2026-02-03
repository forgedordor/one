package defpackage;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;
import androidx.car.app.AppInfo;
import androidx.car.app.CarAppBinder;
import androidx.car.app.SessionInfo;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public abstract class cku extends Service {
    public final Map a = new HashMap();
    public clm b;
    private AppInfo c;

    public abstract csd b();

    @Override // android.app.Service
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(fileDescriptor, printWriter, strArr);
        if (strArr != null) {
            for (String str : strArr) {
                if ("AUTO_DRIVE".equals(str)) {
                    csb.b(new Runnable() { // from class: cks
                        @Override // java.lang.Runnable
                        public final void run() {
                            Map map = this.a.a;
                            synchronized (map) {
                                for (CarAppBinder carAppBinder : map.values()) {
                                    if (Log.isLoggable("CarApp", 3)) {
                                        Log.d("CarApp", "Executing onAutoDriveEnabled for " + carAppBinder.getCurrentSessionInfo());
                                    }
                                    carAppBinder.onAutoDriveEnabled();
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    public cly fi() {
        throw null;
    }

    public final AppInfo fj() {
        if (this.c == null) {
            this.c = AppInfo.create(this);
        }
        return this.c;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        CarAppBinder carAppBinder;
        SessionInfo sessionInfoA = clz.b(intent) ? clz.a(intent) : SessionInfo.DEFAULT_SESSION_INFO;
        Map map = this.a;
        synchronized (map) {
            if (!map.containsKey(sessionInfoA)) {
                map.put(sessionInfoA, new CarAppBinder(this, sessionInfoA));
            }
            carAppBinder = (CarAppBinder) map.get(sessionInfoA);
            carAppBinder.getClass();
        }
        return carAppBinder;
    }

    @Override // android.app.Service
    public void onDestroy() {
        Map map = this.a;
        synchronized (map) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((CarAppBinder) it.next()).destroy();
            }
            map.clear();
        }
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        if (Log.isLoggable("CarApp", 3)) {
            Objects.toString(intent);
            Log.d("CarApp", "onUnbind intent: ".concat(String.valueOf(intent)));
        }
        final SessionInfo sessionInfoA = clz.b(intent) ? clz.a(intent) : SessionInfo.DEFAULT_SESSION_INFO;
        csb.b(new Runnable() { // from class: ckt
            @Override // java.lang.Runnable
            public final void run() {
                Map map = this.a.a;
                SessionInfo sessionInfo = sessionInfoA;
                synchronized (map) {
                    CarAppBinder carAppBinder = (CarAppBinder) map.remove(sessionInfo);
                    if (carAppBinder != null) {
                        carAppBinder.onDestroyLifecycle();
                    }
                }
            }
        });
        if (!Log.isLoggable("CarApp", 3)) {
            return true;
        }
        Log.d("CarApp", "onUnbind completed");
        return true;
    }
}
