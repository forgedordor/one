package com.google.android.apps.messaging.shared.satelliteapi.dunestar;

import android.content.Context;
import android.content.Intent;
import defpackage.auvw;
import defpackage.clij;
import defpackage.cliv;
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
/* loaded from: classes8.dex */
public final class SatelliteConnectionChangeReceiver extends clij {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/shared/satelliteapi/dunestar/SatelliteConnectionChangeReceiver");
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
        return ((eigp) fcsuVar.b()).a("SatelliteConnectionChangeReceiver receive broadcast");
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.SatelliteConnectionChange.Latency";
    }

    @Override // defpackage.clca
    protected final String f() {
        return "Bugle.Broadcast.ForegroundService.SatelliteConnectionChange.Latency";
    }

    @Override // defpackage.clca
    protected final eiju j(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        fcsu fcsuVar = this.d;
        if (fcsuVar == null) {
            fdbq.c("lightweightExecutor");
            fcsuVar = null;
        }
        Object objB = fcsuVar.b();
        objB.getClass();
        return auvw.a(fdin.b((fdjx) objB, eicg.a(fcyi.a), fdjz.a, new cliv(null, intent, this)));
    }

    public final fcsu m() {
        fcsu fcsuVar = this.c;
        if (fcsuVar != null) {
            return fcsuVar;
        }
        fdbq.c("tikTokWorkManager");
        return null;
    }
}
