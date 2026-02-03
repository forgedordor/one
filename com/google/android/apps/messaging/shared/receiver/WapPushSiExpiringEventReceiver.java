package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.axnp;
import defpackage.clah;
import defpackage.craf;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class WapPushSiExpiringEventReceiver extends clah {
    public eigp a;
    public axnp b;

    @Override // defpackage.cldb
    protected final int a() {
        return 18;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return this.a.c("WapPushSiExpiringEventReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/WapPushSiExpiringEventReceiver", "beginRootTrace", 32);
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        if (craf.j(context)) {
            this.b.a().q(this);
        }
        return eijx.e(null);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.WapPushSiExpiring.Latency";
    }
}
