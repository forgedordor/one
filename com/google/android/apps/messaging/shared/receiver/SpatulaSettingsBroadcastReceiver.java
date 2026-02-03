package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import defpackage.auvw;
import defpackage.clae;
import defpackage.clbm;
import defpackage.crtr;
import defpackage.eieh;
import defpackage.eieu;
import defpackage.eigp;
import defpackage.eiiy;
import defpackage.fcsu;
import defpackage.fczl;
import defpackage.fdbq;
import defpackage.fdjx;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class SpatulaSettingsBroadcastReceiver extends clae {
    public fcsu a;
    public fcsu b;
    public fcsu c;

    @Override // defpackage.cldb
    public final eieh b() {
        fcsu fcsuVar = this.a;
        if (fcsuVar == null) {
            fdbq.c("traceCreation");
            fcsuVar = null;
        }
        return ((eigp) fcsuVar.b()).a("SpatulaSettingsBroadcastReceiver Receive broadcast");
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.SpatulaSettingsBroadcastReceiver.Latency";
    }

    @Override // defpackage.clca
    protected final String f() {
        return null;
    }

    @Override // defpackage.clca
    protected final void g(Context context, Intent intent) throws IOException {
        context.getClass();
        intent.getClass();
        if (!fdbq.f(intent.getAction(), "com.google.android.gms.spatula.settings.core.SPATULA_SETTING_UPDATED")) {
            return;
        }
        eieu eieuVarH = eiiy.h("SpatulaSettingsBroadcastReceiver.handleBroadcast");
        try {
            String stringExtra = intent.getStringExtra("ACCOUNT_NAME");
            if (stringExtra != null) {
                fcsu fcsuVar = this.c;
                if (fcsuVar == null) {
                    fdbq.c("blockingScope");
                    fcsuVar = null;
                }
                Object objB = fcsuVar.b();
                objB.getClass();
                auvw.k((fdjx) objB, null, null, new clbm(this, stringExtra, null), 3);
            }
            fczl.a(eieuVarH, null);
        } finally {
        }
    }

    @Override // defpackage.clca
    protected final boolean h(Context context, Intent intent) {
        context.getClass();
        intent.getClass();
        return crtr.e();
    }
}
