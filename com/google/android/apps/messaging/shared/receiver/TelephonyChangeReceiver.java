package com.google.android.apps.messaging.shared.receiver;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.action.ProcessTelephonyChangeAction;
import defpackage.aipo;
import defpackage.axyr;
import defpackage.ayqd;
import defpackage.bxlc;
import defpackage.cggc;
import defpackage.clag;
import defpackage.cmof;
import defpackage.cqbd;
import defpackage.cqce;
import defpackage.crny;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes8.dex */
public class TelephonyChangeReceiver extends clag {
    private static final cqce c = cqce.g("Bugle", "TelephonyChangeReceiver");
    public fcsu a;
    public fcsu b;

    @Override // defpackage.cldb
    protected final int a() {
        return 9;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.b.b()).c("TelephonyChangeReceiver Receive broadcast", "com/google/android/apps/messaging/shared/receiver/TelephonyChangeReceiver", "beginRootTrace", 37);
    }

    @Override // defpackage.cldb
    public final String d() {
        return "Bugle.Broadcast.TelephonyChange.Latency";
    }

    @Override // defpackage.clca
    public final String f() {
        return "Bugle.Broadcast.ForegroundService.TelephonyChange.Latency";
    }

    @Override // defpackage.clca
    public final void g(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        cqbd cqbdVarD = c.d();
        cqbdVarD.I("onReceive:");
        cqbdVarD.I(intent);
        cqbdVarD.r();
        if ("android.provider.action.EXTERNAL_PROVIDER_CHANGE".equals(action)) {
            axyr axyrVar = (axyr) this.a.b();
            Uri data = intent.getData();
            Context context2 = (Context) axyrVar.a.b();
            context2.getClass();
            crny crnyVar = (crny) axyrVar.d.b();
            crnyVar.getClass();
            aipo aipoVar = (aipo) axyrVar.e.b();
            aipoVar.getClass();
            ayqd ayqdVar = (ayqd) axyrVar.f.b();
            ayqdVar.getClass();
            cggc cggcVar = (cggc) axyrVar.g.b();
            cggcVar.getClass();
            bxlc bxlcVar = (bxlc) axyrVar.h.b();
            bxlcVar.getClass();
            cmof cmofVar = (cmof) axyrVar.i.b();
            cmofVar.getClass();
            fcsu fcsuVar = axyrVar.k;
            fcsu fcsuVar2 = axyrVar.j;
            new ProcessTelephonyChangeAction(context2, axyrVar.b, axyrVar.c, crnyVar, aipoVar, ayqdVar, cggcVar, bxlcVar, cmofVar, fcsuVar2, fcsuVar, data).q(this);
        }
    }

    @Override // defpackage.clca
    public final boolean i(Intent intent) {
        return true;
    }

    @Override // defpackage.clca
    protected final String k(Context context, Intent intent) {
        return context.getString(R.string.updating_conversations_foreground_notification_text);
    }
}
