package com.google.android.apps.messaging.ui.appsettings;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import defpackage.a;
import defpackage.bbdl;
import defpackage.cgbn;
import defpackage.cqca;
import defpackage.crmx;
import defpackage.crny;
import defpackage.cuqs;
import defpackage.cuyy;
import defpackage.cuyz;
import defpackage.eieh;
import defpackage.eigp;
import defpackage.eiju;
import defpackage.eijx;
import defpackage.fcsu;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class SimFullReceiver extends cuqs {
    public fcsu a;
    public fcsu b;
    public fcsu c;
    public fcsu d;

    @Override // defpackage.cldb
    protected final int a() {
        return 16;
    }

    @Override // defpackage.cldb
    public final eieh b() {
        return ((eigp) this.c.b()).c("SimFullReceiver Receive broadcast", "com/google/android/apps/messaging/ui/appsettings/SimFullReceiver", "beginRootTrace", 41);
    }

    @Override // defpackage.cldb
    public final eiju c(Context context, Intent intent) {
        if ("android.provider.Telephony.SIM_FULL".equals(intent.getAction())) {
            int iA = ((crny) this.a.b()).h(intent.getIntExtra("subscription", -1)).a();
            cqca.i("Bugle", a.e(iA, "SIM ", " storage full"));
            if (((crmx) this.b.b()).K()) {
                cuyz cuyzVar = (cuyz) this.d.b();
                Resources resources = context.getResources();
                crny crnyVar = (crny) cuyzVar.a.b();
                crnyVar.getClass();
                bbdl bbdlVar = (bbdl) cuyzVar.b.b();
                bbdlVar.getClass();
                cgbn cgbnVar = (cgbn) cuyzVar.c.b();
                cgbnVar.getClass();
                resources.getClass();
                new cuyy(crnyVar, bbdlVar, cgbnVar, resources, iA).e(new Void[0]);
            }
        }
        return eijx.e(null);
    }

    @Override // defpackage.cldb
    public final String d() {
        return null;
    }
}
