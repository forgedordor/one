package com.google.android.apps.messaging.shared.simstatetracker;

import android.content.Context;
import android.content.Intent;
import defpackage.ains;
import defpackage.auvw;
import defpackage.cmjg;
import defpackage.cmji;
import defpackage.cmlp;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.ekrg;
import defpackage.fcsu;
import defpackage.fcyi;
import defpackage.fdbq;
import defpackage.fdjx;
import defpackage.fdjz;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class AsyncTelephonySimStateReceiver extends cmji {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/simstatetracker/AsyncTelephonySimStateReceiver");
    public fcsu b;
    public fcsu c;
    public fcsu d;
    public fcsu e;

    @Override // defpackage.cldb
    public final eieh b() {
        fcsu fcsuVar = this.b;
        if (fcsuVar == null) {
            fdbq.c("traceCreation");
            fcsuVar = null;
        }
        return ((eigp) fcsuVar.b()).a("AsyncTelephonySimStateReceiver receive broadcast");
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.AsyncTelephonySimStateReceiver.Latency";
    }

    @Override // defpackage.clca
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.AsyncTelephonySimStateReceiver.Latency";
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        intent.getClass();
        return false;
    }

    @Override // defpackage.clca
    protected final eiju j(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        fcsu fcsuVar = this.c;
        if (fcsuVar == null) {
            fdbq.c("blockingScope");
            fcsuVar = null;
        }
        Object objB = fcsuVar.b();
        objB.getClass();
        return auvw.c((fdjx) objB, fcyi.a, fdjz.a, new cmjg(this, intent, null));
    }

    public final fcsu m() {
        fcsu fcsuVar = this.d;
        if (fcsuVar != null) {
            return fcsuVar;
        }
        fdbq.c("simStateScheduler");
        return null;
    }

    public final void n(int i) {
        fcsu fcsuVar = this.e;
        if (fcsuVar == null) {
            fdbq.c("countersUtil");
            fcsuVar = null;
        }
        ((ains) ((cmlp) fcsuVar.b()).a.b()).e("Bugle.Dsdr.AsyncTelephonySimStateReceiver", i - 1);
    }
}
