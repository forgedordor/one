package com.google.android.apps.messaging.shared.flaggedmessages;

import android.content.Context;
import android.content.Intent;
import defpackage.cdhc;
import defpackage.cdia;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class FlaggedMessageAlertReceiver extends cdhc {
    private static final cqce c = cqce.g("Bugle", "FlaggedMessageAlertReceiver");
    public cdia a;
    public eigp b;

    @Override // defpackage.cldb
    protected final int a() {
        return 18;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return this.b.c("FlaggedMessageAlertReceiver Receive broadcast", "com/google/android/apps/messaging/shared/flaggedmessages/FlaggedMessageAlertReceiver", "beginRootTrace", 34);
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        String action = intent.getAction();
        action.getClass();
        if (action.hashCode() == 1527016992 && action.equals("com.google.android.apps.messaging.shared.flaggedmessages.ALERT_EXPIRED_FLAGGED_MESSAGES")) {
            q("FlaggedMessageAlertReceiver", this.a.a());
        } else {
            cqbd cqbdVarE = c.e();
            cqbdVarE.I("Unexpected Intent action sent to FlaggedMessageAlertReceiver:");
            cqbdVarE.I(action);
            cqbdVarE.r();
        }
        return eijx.e(null);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.MessageFlaggerAlert.Latency";
    }
}
