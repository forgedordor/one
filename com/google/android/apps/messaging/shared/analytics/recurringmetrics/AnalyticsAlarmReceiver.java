package com.google.android.apps.messaging.shared.analytics.recurringmetrics;

import android.content.Context;
import android.content.Intent;
import defpackage.aiyx;
import defpackage.ajat;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AnalyticsAlarmReceiver extends aiyx {
    public fcsu a;
    public fcsu b;

    @Override // defpackage.cldb
    protected final int a() {
        return 18;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.b.b()).c("AnalyticsAlarmReceiver Receive broadcast", "com/google/android/apps/messaging/shared/analytics/recurringmetrics/AnalyticsAlarmReceiver", "beginRootTrace", 28);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.AnalyticsAlarm.Latency";
    }

    @Override // defpackage.clca
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.AnalyticsAlarm.Latency";
    }

    @Override // defpackage.clca
    public final void g(Context context, Intent intent) {
        ((ajat) this.a.b()).h(this);
    }
}
