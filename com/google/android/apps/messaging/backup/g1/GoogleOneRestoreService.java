package com.google.android.apps.messaging.backup.g1;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.libraries.subscriptions.restore.IG1Restore;
import defpackage.ains;
import defpackage.ekrg;
import defpackage.fcsu;
import defpackage.tcf;
import defpackage.tcg;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GoogleOneRestoreService extends tcg {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/backup/g1/GoogleOneRestoreService");
    public IG1Restore.Stub b;
    public ains c;
    public fcsu d;
    private final IG1Restore.Stub e = new tcf(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        if (intent == null || !"com.android.Bugle.intent.action.RESTORE_ACTION".equals(intent.getAction())) {
            return null;
        }
        return this.e;
    }
}
