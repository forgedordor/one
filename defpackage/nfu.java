package defpackage;

import android.os.Looper;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class nfu extends ndd implements nfm {
    private final mhk d;
    private final nap e;
    private final mau g;
    private boolean j;
    private boolean k;
    private min l;
    private mbo m;
    private final nfs n;
    private final int f = 1048576;
    private boolean h = true;
    private long i = -9223372036854775807L;

    public nfu(mbo mboVar, mhk mhkVar, nfs nfsVar, nap napVar, int i, mau mauVar) {
        this.m = mboVar;
        this.d = mhkVar;
        this.n = nfsVar;
        this.e = napVar;
        this.g = mauVar;
    }

    private final void u() {
        mcl nggVar = new ngg(this.i, this.j, this.k, F());
        if (this.h) {
            nggVar = new nfr(nggVar);
        }
        l(nggVar);
    }

    @Override // defpackage.nep
    public final synchronized mbo F() {
        return this.m;
    }

    @Override // defpackage.nfm
    public final void a(long j, noq noqVar, boolean z) {
        if (j == -9223372036854775807L) {
            j = this.i;
        }
        boolean zY = noqVar.y();
        if (!this.h && this.i == j && this.j == zY && this.k == z) {
            return;
        }
        this.i = j;
        this.j = zY;
        this.k = z;
        this.h = false;
        u();
    }

    @Override // defpackage.ndd
    protected final void k(min minVar) {
        this.l = minVar;
        Looper looperMyLooper = Looper.myLooper();
        mee.f(looperMyLooper);
        mwx mwxVarJ = J();
        nap napVar = this.e;
        napVar.h(looperMyLooper, mwxVarJ);
        napVar.f();
        u();
    }

    @Override // defpackage.ndd
    protected final void n() {
        this.e.g();
    }

    @Override // defpackage.ndd, defpackage.nep
    public final synchronized void q(mbo mboVar) {
        this.m = mboVar;
    }

    @Override // defpackage.nep
    public final void v(nel nelVar) {
        nfq nfqVar = (nfq) nelVar;
        if (nfqVar.n) {
            for (ngb ngbVar : nfqVar.m) {
                ngbVar.h();
                ngbVar.j();
            }
        }
        njg njgVar = nfqVar.f;
        njc njcVar = njgVar.c;
        if (njcVar != null) {
            njcVar.a(true);
        }
        njl njlVar = njgVar.e;
        njlVar.execute(new nje(nfqVar));
        njlVar.b.a(njlVar.a);
        nfqVar.j.removeCallbacksAndMessages(null);
        nfqVar.k = null;
        nfqVar.x = true;
    }

    @Override // defpackage.nep
    public final nel w(nen nenVar, niu niuVar, long j) {
        mhl mhlVarA = this.d.a();
        min minVar = this.l;
        if (minVar != null) {
            mhlVarA.f(minVar);
        }
        mbl mblVar = F().b;
        mee.f(mblVar);
        nfs nfsVar = this.n;
        J();
        return new nfq(mblVar.a, mhlVarA, new ndg(nfsVar.a), this.e, b(nenVar), c(nenVar), this, niuVar, 1048576, this.g, mgb.w(mblVar.i));
    }

    @Override // defpackage.nep
    public final void t() {
    }
}
