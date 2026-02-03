package androidx.work.impl.foreground;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import defpackage.lvp;
import defpackage.qas;
import defpackage.qhy;
import defpackage.qhz;
import defpackage.qia;
import defpackage.qib;
import defpackage.qky;
import java.util.Objects;
import java.util.UUID;

/* compiled from: PG */
/* loaded from: classes.dex */
public class SystemForegroundService extends lvp implements qhz {
    public static final String a = qas.d("SystemFgService");
    qia b;
    NotificationManager c;
    private boolean d;

    private final void e() {
        this.c = (NotificationManager) getApplicationContext().getSystemService("notification");
        qia qiaVar = new qia(getApplicationContext());
        this.b = qiaVar;
        if (qiaVar.i == null) {
            qiaVar.i = this;
        } else {
            qas.c();
            Log.e(qia.a, "A callback already exists.");
        }
    }

    @Override // defpackage.qhz
    public final void a(int i) {
        this.c.cancel(i);
    }

    @Override // defpackage.qhz
    public final void b(int i, Notification notification) {
        this.c.notify(i, notification);
    }

    @Override // defpackage.qhz
    public final void c(int i, int i2, Notification notification) {
        if (Build.VERSION.SDK_INT >= 31) {
            qib.a(this, i, notification, i2);
        } else if (Build.VERSION.SDK_INT >= 29) {
            startForeground(i, notification, i2);
        } else {
            startForeground(i, notification);
        }
    }

    @Override // defpackage.qhz
    public final void d() {
        this.d = true;
        qas.c().a(a, "Shutting down.");
        stopForeground(true);
        stopSelf();
    }

    @Override // defpackage.lvp, android.app.Service
    public final void onCreate() {
        super.onCreate();
        e();
    }

    @Override // defpackage.lvp, android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.b.c();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        if (this.d) {
            qas.c();
            Log.i(a, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.b.c();
            e();
            this.d = false;
        }
        if (intent == null) {
            return 3;
        }
        qia qiaVar = this.b;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            qas.c();
            String str = qia.a;
            Objects.toString(intent);
            Log.i(str, "Started foreground service ".concat(intent.toString()));
            qiaVar.j.a(new qhy(qiaVar, intent.getStringExtra("KEY_WORKSPEC_ID")));
            qiaVar.b(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            qiaVar.b(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            qas.c();
            Log.i(qia.a, "Stopping foreground service");
            qhz qhzVar = qiaVar.i;
            if (qhzVar == null) {
                return 3;
            }
            qhzVar.d();
            return 3;
        }
        qas.c();
        String str2 = qia.a;
        Objects.toString(intent);
        Log.i(str2, "Stopping foreground work for ".concat(intent.toString()));
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        qky.a(UUID.fromString(stringExtra), qiaVar.b);
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.b.d(2048);
    }

    public final void onTimeout(int i, int i2) {
        this.b.d(i2);
    }
}
