package com.google.android.libraries.compose.photos.api.callback;

import android.content.Intent;
import android.os.IBinder;
import com.sun.jna.Callback;
import defpackage.doqj;
import defpackage.doql;
import defpackage.eaie;
import defpackage.ejxr;
import defpackage.ekph;
import defpackage.espo;
import defpackage.espp;
import defpackage.fbty;
import defpackage.fbug;
import defpackage.fbuh;
import defpackage.fbus;
import defpackage.fdbq;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class PhotosApiCallbackService extends doqj {
    public doql a;
    private ejxr b;

    @Override // defpackage.lvp, android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        super.onBind(intent);
        ejxr ejxrVar = this.b;
        if (ejxrVar == null) {
            fdbq.c("binder");
            ejxrVar = null;
        }
        IBinder iBinder = ((espp) ejxrVar).get();
        iBinder.getClass();
        return iBinder;
    }

    @Override // defpackage.doqj, defpackage.lvp, android.app.Service
    public final void onCreate() {
        super.onCreate();
        fbuh fbuhVar = new fbuh();
        fbug fbugVar = new fbug(fbty.b(this), fbuhVar);
        HashMap map = new HashMap();
        fbus.b(eaie.b().a, espo.c(getApplicationContext(), new ekph("com.google.android.apps.photos")), map);
        fbugVar.g(fbus.a(map));
        doql doqlVar = this.a;
        if (doqlVar == null) {
            fdbq.c(Callback.METHOD_NAME);
            doqlVar = null;
        }
        fbugVar.d(doqlVar);
        this.b = new espp(fbugVar.a(), fbuhVar, this);
    }
}
