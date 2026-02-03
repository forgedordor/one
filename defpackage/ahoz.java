package defpackage;

import com.google.android.apps.messaging.release.BugleRelease_Application;

/* compiled from: PG */
/* loaded from: classes2.dex */
public class ahoz extends ahgk {
    private boolean u = false;
    private final eyhh v = new eyhh(new ahoy(this));

    @Override // defpackage.ehnl, defpackage.eyhy
    public final /* synthetic */ eyhx ba() {
        return this.v;
    }

    @Override // defpackage.ehnl
    public final eyhh c() {
        return this.v;
    }

    @Override // defpackage.squ, defpackage.aoll, defpackage.ehnm, android.app.Application
    public void onCreate() {
        if (!this.u) {
            this.u = true;
            BugleRelease_Application bugleRelease_Application = (BugleRelease_Application) this;
            ahng ahngVar = ((ahkn) bb()).d.b;
            ahkn ahknVar = ahngVar.a;
            eyik eyikVar = ahknVar.aI;
            bugleRelease_Application.r = (eigp) eyikVar.b();
            bugleRelease_Application.s = ahngVar.bn;
            bugleRelease_Application.f = ahngVar.bX;
            ahnh ahnhVar = ahknVar.a;
            bugleRelease_Application.g = ahnhVar.CO;
            bugleRelease_Application.h = ahngVar.cc;
            bugleRelease_Application.i = ahknVar.nu;
            bugleRelease_Application.j = ahknVar.y;
            bugleRelease_Application.k = ahngVar.ce;
            bugleRelease_Application.l = ahnhVar.sF;
            bugleRelease_Application.m = ahknVar.aJ;
            bugleRelease_Application.n = (eigp) eyikVar.b();
            bugleRelease_Application.o = ahngVar.dD;
            bugleRelease_Application.p = ahnhVar.d;
            bugleRelease_Application.q = ahngVar.dE;
            ((squ) bugleRelease_Application).a = ahnhVar.Vy;
            bugleRelease_Application.b = ahnhVar.up;
        }
        super.onCreate();
    }
}
