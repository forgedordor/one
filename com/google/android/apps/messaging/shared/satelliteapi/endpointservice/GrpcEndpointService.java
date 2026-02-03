package com.google.android.apps.messaging.shared.satelliteapi.endpointservice;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import defpackage.ahij;
import defpackage.ahkn;
import defpackage.cljt;
import defpackage.clju;
import defpackage.ecem;
import defpackage.ehlg;
import defpackage.ehnq;
import defpackage.ehvd;
import defpackage.eiel;
import defpackage.eieu;
import defpackage.eifp;
import defpackage.eiiy;
import defpackage.ejwl;
import defpackage.eosc;
import defpackage.esty;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class GrpcEndpointService extends clju implements ehlg<cljt> {
    public ehvd a;
    private cljt b;
    private boolean c;
    private final eiel d = new eiel(this);
    private boolean e;

    @Deprecated
    public GrpcEndpointService() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return cljt.class;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final cljt H() {
        cljt cljtVar = this.b;
        if (cljtVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return cljtVar;
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
            IBinder iBinderA = H().a.a();
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

    @Override // defpackage.clju, defpackage.lvp, android.app.Service
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
                            esty estyVar = (esty) ((ahij) objBb).d.b();
                            ahkn ahknVar = ((ahij) objBb).b;
                            this.b = new cljt(estyVar, (Context) ahknVar.t.b(), (eosc) ahknVar.y.b());
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
