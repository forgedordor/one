package com.google.android.apps.messaging.dittosatellite.backgroundhandler;

import android.content.Intent;
import android.os.IBinder;
import defpackage.abdx;
import defpackage.abew;
import defpackage.abex;
import defpackage.abmq;
import defpackage.ahij;
import defpackage.auvh;
import defpackage.ecem;
import defpackage.ehlg;
import defpackage.ehnq;
import defpackage.ehvd;
import defpackage.eiel;
import defpackage.eieu;
import defpackage.eifp;
import defpackage.eiiy;
import defpackage.ejwl;
import defpackage.eksl;
import defpackage.eyie;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class SatelliteBackgroundHandlerService extends abdx implements ehlg<abex> {
    public ehvd a;
    private abex b;
    private boolean c;
    private final eiel d = new eiel(this);
    private boolean e;

    @Deprecated
    public SatelliteBackgroundHandlerService() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return abex.class;
    }

    @Override // defpackage.ehlg
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final abex H() {
        abex abexVar = this.b;
        if (abexVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return abexVar;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        eifp eifpVarA = this.d.a(intent);
        try {
            ehvd ehvdVar = this.a;
            if (ehvdVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onBind called before onCreate.");
            }
            ehvdVar.b();
            abew abewVar = H().e;
            eifpVarA.close();
            return abewVar;
        } catch (Throwable th) {
            try {
                eifpVarA.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.abdx, android.app.Service
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
                            this.b = new abex(((ahij) objBb).h, eyie.a(((ahij) objBb).k), eyie.a(((ahij) objBb).b.p));
                            eieuVarK.close();
                        } finally {
                        }
                    } catch (ClassCastException e) {
                        throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e);
                    }
                } finally {
                }
            }
            super.onCreate();
            H().d = Instant.now();
            ((eksl) ((eksl) abex.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerServicePeer", "onCreate", 79, "SatelliteBackgroundHandlerServicePeer.java")).q("Created SatelliteBackgroundHandlerService");
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

    @Override // android.app.Service
    public final void onDestroy() {
        eifp eifpVarC = this.d.c();
        try {
            ehvd ehvdVar = this.a;
            if (ehvdVar == null) {
                throw new IllegalStateException("Service not initialized correctly; onDestroy called before onCreate.");
            }
            ehvdVar.a();
            super.onDestroy();
            abex abexVarH = H();
            eksl ekslVar = (eksl) ((eksl) abex.a.h()).h("com/google/android/apps/messaging/dittosatellite/backgroundhandler/SatelliteBackgroundHandlerServicePeer", "onDestroy", 97, "SatelliteBackgroundHandlerServicePeer.java");
            long epochMilli = Instant.now().toEpochMilli();
            Instant instant = abexVarH.d;
            instant.getClass();
            ekslVar.s("Destroying SatelliteBackgroundHandlerService. Ran for %d ms", epochMilli - instant.toEpochMilli());
            ((abmq) abexVarH.b.get()).b().k(auvh.b(), abexVarH.c);
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
