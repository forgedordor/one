package com.google.android.ims.messaging;

import android.content.Intent;
import android.os.IBinder;
import defpackage.dfri;
import defpackage.ejxr;
import defpackage.ekhx;
import defpackage.espo;
import defpackage.espp;
import defpackage.fbmx;
import defpackage.fbty;
import defpackage.fbug;
import defpackage.fbuh;
import defpackage.fbus;
import defpackage.fcsu;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class MessagingEngineEndpointService extends dfri {
    public fcsu a;
    private ejxr b;

    @Override // defpackage.lvp, android.app.Service
    public final IBinder onBind(Intent intent) {
        super.onBind(intent);
        return ((espp) this.b).get();
    }

    @Override // defpackage.dfri, defpackage.lvp, android.app.Service
    public final void onCreate() {
        super.onCreate();
        fbty fbtyVarB = fbty.b(getApplicationContext());
        fbuh fbuhVar = new fbuh();
        fbug fbugVar = new fbug(fbtyVarB, fbuhVar);
        fbugVar.d((fbmx) this.a.b());
        HashMap map = new HashMap();
        fbus.b("bugle.smapi.rcs.MessagingEngineNotificationService", espo.c(getApplicationContext(), ekhx.r("com.google.android.ims", "com.google.android.apps.messaging")), map);
        fbugVar.g(fbus.a(map));
        this.b = new espp(fbugVar.a(), fbuhVar, this);
    }
}
