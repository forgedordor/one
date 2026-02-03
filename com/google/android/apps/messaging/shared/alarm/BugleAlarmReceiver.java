package com.google.android.apps.messaging.shared.alarm;

import android.content.Context;
import android.content.Intent;
import defpackage.aijm;
import defpackage.aijw;
import defpackage.auvw;
import defpackage.eicg;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.ekrg;
import defpackage.fcsu;
import defpackage.fcyi;
import defpackage.fdbq;
import defpackage.fdin;
import defpackage.fdjx;
import defpackage.fdjz;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class BugleAlarmReceiver extends aijw {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/alarm/BugleAlarmReceiver");
    public fcsu b;
    public fcsu c;
    public fcsu d;

    @Override // defpackage.cldb
    public final eieh b() {
        fcsu fcsuVar = this.b;
        if (fcsuVar == null) {
            fdbq.c("traceCreation");
            fcsuVar = null;
        }
        return ((eigp) fcsuVar.b()).a("BugleAlarmReceiver receive broadcast");
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.BugleAlarm.Latency";
    }

    @Override // defpackage.clca
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.BugleAlarm.Latency";
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        intent.getClass();
        return true;
    }

    @Override // defpackage.clca
    protected final eiju j(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        fcsu fcsuVar = this.d;
        if (fcsuVar == null) {
            fdbq.c("blockingScope");
            fcsuVar = null;
        }
        Object objB = fcsuVar.b();
        objB.getClass();
        return auvw.a(fdin.b((fdjx) objB, eicg.a(fcyi.a), fdjz.a, new aijm(null, intent, this)));
    }
}
