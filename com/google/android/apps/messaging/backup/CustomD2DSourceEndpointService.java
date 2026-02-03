package com.google.android.apps.messaging.backup;

import android.content.Intent;
import android.os.IBinder;
import defpackage.ahij;
import defpackage.ecem;
import defpackage.ehlg;
import defpackage.ehnq;
import defpackage.ehvd;
import defpackage.eiel;
import defpackage.eieu;
import defpackage.eifp;
import defpackage.eiiy;
import defpackage.ejwl;
import defpackage.esty;
import defpackage.eygg;
import defpackage.eyie;
import defpackage.fbui;
import defpackage.fbur;
import defpackage.fbus;
import defpackage.fbut;
import defpackage.szz;
import defpackage.tbw;
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CustomD2DSourceEndpointService extends tbw implements ehlg<szz> {
    public ehvd a;
    private szz b;
    private boolean c;
    private final eiel d = new eiel(this);
    private boolean e;

    @Deprecated
    public CustomD2DSourceEndpointService() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return szz.class;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final szz H() {
        szz szzVar = this.b;
        if (szzVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return szzVar;
    }

    @Override // defpackage.lvp, android.app.Service
    public final IBinder onBind(Intent intent) {
        eifp eifpVarA = this.d.a(intent);
        try {
            ehvd ehvdVar = this.a;
            if (ehvdVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onBind called before onCreate.");
            }
            ehvdVar.b();
            super.onBind(intent);
            szz szzVarH = H();
            eygg eyggVar = szzVarH.a;
            esty estyVar = (esty) eyggVar.b();
            HashMap map = new HashMap();
            fbus.b("com.google.android.gms.backup.customd2dapi.CustomD2DSourceService", (fbur) szzVarH.b.b(), map);
            fbut fbutVarA = fbus.a(map);
            fbui fbuiVar = new fbui();
            fbuiVar.b();
            estyVar.c(fbutVarA, fbuiVar.a());
            IBinder iBinderA = ((esty) eyggVar.b()).a();
            eifpVarA.close();
            return iBinderA;
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.tbw, defpackage.lvp, android.app.Service
    public final void onCreate() {
        eifp eifpVarB = this.d.b();
        try {
            this.c = true;
            ejwl.l(getApplication() instanceof ehnq);
            if (this.b == null) {
                if (!this.c) {
                    throw new IllegalStateException("createPeer() called outside of onCreate");
                }
                if (this.e) {
                    throw new IllegalStateException("createPeer() called after destroyed.");
                }
                eieu eieuVarK = eiiy.k("CreateComponent");
                try {
                    bb();
                    eieuVarK.close();
                    eieuVarK = eiiy.k("CreatePeer");
                    try {
                        try {
                            Object objBb = bb();
                            this.b = new szz(eyie.a(((ahij) objBb).d), eyie.a(((ahij) objBb).b.b.pt));
                            eieuVarK.close();
                        } catch (ClassCastException e) {
                            throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                        }
                    } finally {
                    }
                } finally {
                }
            }
            super.onCreate();
            this.c = false;
            eifpVarB.close();
        } catch (Throwable th) {
            try {
                eifpVarB.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.lvp, android.app.Service
    public final void onDestroy() {
        eifp eifpVarC = this.d.c();
        try {
            ehvd ehvdVar = this.a;
            if (ehvdVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onDestroy called before onCreate.");
            }
            ehvdVar.a();
            super.onDestroy();
            this.e = true;
            eifpVarC.close();
        } catch (Throwable th) {
            try {
                eifpVarC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
