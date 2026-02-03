package com.google.android.apps.messaging.scheduledsend.scheduling;

import android.content.Context;
import android.content.Intent;
import defpackage.aihr;
import defpackage.clpp;
import defpackage.cmcx;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ScheduledSendAlarmReceiver extends aihr {
    public fcsu a;
    public fcsu b;

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.b.b()).c("ScheduledSendAlarmReceiver Receiver broadcast", "com/google/android/apps/messaging/scheduledsend/scheduling/ScheduledSendAlarmReceiver", "beginRootTrace", 31);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.ScheduledSendAlarm.Latency";
    }

    @Override // defpackage.clca
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.ScheduledSendAlarm.Latency";
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.clca
    public final eiju j(Context context, Intent intent) {
        return !((Boolean) clpp.a.e()).booleanValue() ? eijx.e(null) : ((cmcx) this.a.b()).d(this);
    }
}
