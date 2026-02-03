package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.ayge;
import defpackage.ckzs;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class DefaultSmsSubscriptionChangeReceiver extends ckzs {
    public eigp a;
    public ayge b;

    @Override // defpackage.cldb
    protected final int a() {
        return 12;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return this.a.c("DefaultSmsSubscriptionChangeReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/DefaultSmsSubscriptionChangeReceiver", "beginRootTrace", 66);
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        this.b.b().q(this);
        return eijx.e(null);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.DefaultSubscriptionChanged.Latency";
    }
}
