package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.claf;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class StorageStatusReceiver extends claf {
    public fcsu a;

    @Override // defpackage.cldb
    protected final int a() {
        return 11;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.a.b()).c("StorageStatusReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/StorageStatusReceiver", "beginRootTrace", 34);
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        return eijx.e(null);
    }

    @Override // defpackage.cldb
    public final String d() {
        return null;
    }
}
