package com.google.android.apps.messaging.diagnostics;

import android.content.Intent;
import android.os.IBinder;
import defpackage.aazf;
import defpackage.aazo;
import defpackage.cgbn;
import defpackage.cqce;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class DiagnosticsService extends aazo {
    private static final cqce b = cqce.f("BugleDiagnostics", DiagnosticsService.class);
    public cgbn a;
    private boolean c = false;

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return new aazf();
    }

    @Override // defpackage.aazo, android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (this.c) {
            return;
        }
        this.a.r();
        b.q("Diagnostics service created");
        this.c = true;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        this.a.h();
        b.q("Diagnostics service destroyed");
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return 2;
    }
}
