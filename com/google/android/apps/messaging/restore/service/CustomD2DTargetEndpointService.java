package com.google.android.apps.messaging.restore.service;

import android.content.Intent;
import android.os.IBinder;
import defpackage.ahij;
import defpackage.aibi;
import defpackage.aich;
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
import java.util.HashMap;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class CustomD2DTargetEndpointService extends aich implements ehlg<aibi> {
    public ehvd a;
    private aibi b;
    private boolean c;
    private final eiel d = new eiel(this);
    private boolean e;

    @Deprecated
    public CustomD2DTargetEndpointService() {
        ecem.c();
    }

    @Override // defpackage.ehlg
    public final Class F() {
        return aibi.class;
    }

    @Override // defpackage.ehlg
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final aibi H() {
        aibi aibiVar = this.b;
        if (aibiVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.e) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return aibiVar;
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
            aibi aibiVarH = H();
            eygg eyggVar = aibiVarH.a;
            esty estyVar = (esty) eyggVar.b();
            HashMap map = new HashMap();
            fbus.b("com.google.android.gms.backup.customd2dapi.CustomD2DTargetService", (fbur) aibiVarH.b.b(), map);
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

    @Override // defpackage.aich, defpackage.lvp, android.app.Service
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
                            this.b = new aibi(eyie.a(((ahij) objBb).d), eyie.a(((ahij) objBb).b.b.py));
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
