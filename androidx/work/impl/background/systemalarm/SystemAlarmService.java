package androidx.work.impl.background.systemalarm;

import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;
import defpackage.lvp;
import defpackage.qas;
import defpackage.qfs;
import defpackage.qfu;
import defpackage.qlv;
import defpackage.qlw;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemAlarmService extends lvp implements qfs {
    private static final String a = qas.d("SystemAlarmService");
    private qfu b;
    private boolean c;

    private final void b() {
        qfu qfuVar = new qfu(this);
        this.b = qfuVar;
        if (qfuVar.i == null) {
            qfuVar.i = this;
        } else {
            qas.c();
            Log.e(qfu.a, "A completion listener for SystemAlarmDispatcher already exists.");
        }
    }

    @Override // defpackage.qfs
    public final void a() {
        this.c = true;
        qas.c().a(a, "All commands completed in dispatcher");
        String str = qlv.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        synchronized (qlw.a) {
            linkedHashMap.putAll(qlw.b);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) entry.getKey();
            String str2 = (String) entry.getValue();
            if (wakeLock != null && wakeLock.isHeld()) {
                qas.c();
                Log.w(qlv.a, "WakeLock held for ".concat(String.valueOf(str2)));
            }
        }
        stopSelf();
    }

    @Override // defpackage.lvp, android.app.Service
    public final void onCreate() {
        super.onCreate();
        b();
        this.c = false;
    }

    @Override // defpackage.lvp, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.c = true;
        this.b.b();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.c) {
            qas.c();
            Log.i(a, "Re-initializing SystemAlarmDispatcher after a request to shut-down.");
            this.b.b();
            b();
            this.c = false;
        }
        if (intent == null) {
            return 3;
        }
        this.b.d(intent, i2);
        return 3;
    }
}
