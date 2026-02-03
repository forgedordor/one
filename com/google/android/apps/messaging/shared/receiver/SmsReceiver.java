package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.cgrg;
import defpackage.clab;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.craf;
import defpackage.crmx;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class SmsReceiver extends clab {
    private static final cqce d = cqce.g("Bugle", "SmsReceiver");
    public fcsu a;
    public eigp b;
    public fcsu c;

    @Override // defpackage.cldb
    protected final int a() {
        return 1;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return this.b.c("SmsReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/SmsReceiver", "beginRootTrace", 56);
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        cqce cqceVar = d;
        cqbd cqbdVarD = cqceVar.d();
        cqbdVarD.I("onReceive");
        cqbdVarD.I(intent);
        cqbdVarD.r();
        if (((crmx) this.a.b()).K()) {
            String action = intent.getAction();
            if (craf.i(context) && ("android.provider.Telephony.SMS_RECEIVED".equals(action) || "android.provider.Telephony.MMS_DOWNLOADED".equals(action))) {
                cqceVar.p("Received sms");
                ((cgrg) this.c.b()).a();
            }
        }
        return eijx.e(null);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.SmsReceiver.Latency";
    }
}
