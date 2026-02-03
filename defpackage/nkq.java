package defpackage;

import android.content.Context;
import android.util.Pair;
import android.view.Surface;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class nkq implements nlx, nkr {
    public mau a;
    final /* synthetic */ nkw b;
    private final int c;
    private ekgb d;
    private int e;
    private long f;
    private long g;
    private nlu h;
    private Executor i;
    private boolean j;

    public nkq(nkw nkwVar, Context context) {
        this.b = nkwVar;
        this.c = mgb.m(context);
        int i = ekgb.d;
        this.d = ekoe.a;
        this.g = -9223372036854775807L;
        this.h = nlu.b;
        this.i = nkw.a;
    }

    private final void D(mau mauVar) {
        mat matVar = new mat(mauVar);
        matVar.C = nkw.f(mauVar.E);
        mau mauVar2 = new mau(matVar);
        int i = 1 != this.e ? 2 : 1;
        mdd mddVar = this.b.m;
        mee.f(mddVar);
        mddVar.g(0, i, mauVar2, this.d, 0L);
    }

    @Override // defpackage.nkr
    public final void A() {
        nlu nluVar = this.h;
        Executor executor = this.i;
        nluVar.getClass();
        executor.execute(new Runnable() { // from class: nkp
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
    }

    @Override // defpackage.nkr
    public final void B() {
        final nlu nluVar = this.h;
        Executor executor = this.i;
        nluVar.getClass();
        executor.execute(new Runnable() { // from class: nkm
            @Override // java.lang.Runnable
            public final void run() {
                nluVar.d();
            }
        });
    }

    @Override // defpackage.nkr
    public final void C(final mde mdeVar) {
        final nlu nluVar = this.h;
        this.i.execute(new Runnable() { // from class: nko
            @Override // java.lang.Runnable
            public final void run() {
                nluVar.e(mdeVar);
            }
        });
    }

    @Override // defpackage.nlx
    public final Surface a() {
        mee.c(this.j);
        mdd mddVar = this.b.m;
        mee.f(mddVar);
        return mddVar.b(0);
    }

    @Override // defpackage.nlx
    public final void b() {
        nkw nkwVar = this.b;
        if (nkwVar.i.a() == 0) {
            nkwVar.g();
            return;
        }
        mfx mfxVar = new mfx();
        boolean z = true;
        while (nkwVar.i.a() > 0) {
            nkv nkvVar = (nkv) nkwVar.i.c();
            mee.f(nkvVar);
            if (z) {
                int i = nkvVar.b;
                if (i == 0 || i == 1) {
                    nkvVar = new nkv(nkvVar.a, 0, nkvVar.c);
                } else {
                    nkwVar.g();
                }
            }
            mfxVar.e(nkvVar.c, nkvVar);
            z = false;
        }
        nkwVar.i = mfxVar;
    }

    @Override // defpackage.nlx
    public final void c() {
        mft mftVar = mft.a;
        int i = mftVar.c;
        int i2 = mftVar.d;
        nkw nkwVar = this.b;
        nkwVar.i(null, i, i2);
        nkwVar.o = null;
    }

    @Override // defpackage.nlx
    public final void d(boolean z) {
        if (this.j) {
            mdd mddVar = this.b.m;
            mee.f(mddVar);
            mddVar.c();
        }
        this.g = -9223372036854775807L;
        this.b.h(z);
    }

    @Override // defpackage.nlx
    public final void e(boolean z) {
        nkw nkwVar = this.b;
        if (nkwVar.e) {
            nkwVar.f.e(z);
        }
    }

    @Override // defpackage.nlx
    public final void f() {
        if (this.j) {
            nkw nkwVar = this.b;
            long j = nkwVar.r;
            nkwVar.h(false);
            mdd mddVar = nkwVar.m;
            mee.f(mddVar);
            mddVar.e();
            nkwVar.r = j;
        }
    }

    @Override // defpackage.nlx
    public final void g() {
        nkw nkwVar = this.b;
        if (nkwVar.q == 2) {
            return;
        }
        mew mewVar = nkwVar.l;
        if (mewVar != null) {
            mewVar.i();
        }
        mdd mddVar = nkwVar.m;
        if (mddVar != null) {
            mddVar.h();
        }
        nkwVar.o = null;
        nkwVar.q = 2;
    }

    @Override // defpackage.nlx
    public final void h(long j, long j2) {
        this.b.f.h(j + this.f, j2);
    }

    @Override // defpackage.nlx
    public final void i(long j) {
        this.f = j;
    }

    @Override // defpackage.nlx
    public final void j(int i) {
        this.b.f.j(i);
    }

    @Override // defpackage.nlx
    public final void k(nlu nluVar, Executor executor) {
        this.h = nluVar;
        this.i = executor;
    }

    @Override // defpackage.nlx
    public final void l(Surface surface, mft mftVar) {
        nkw nkwVar = this.b;
        Pair pair = nkwVar.o;
        if (pair != null && ((Surface) pair.first).equals(surface) && ((mft) nkwVar.o.second).equals(mftVar)) {
            return;
        }
        nkwVar.o = Pair.create(surface, mftVar);
        nkwVar.i(surface, mftVar.c, mftVar.d);
    }

    @Override // defpackage.nlx
    public final void m(float f) {
        this.b.f.m(f);
    }

    @Override // defpackage.nlx
    public final void n(List list) {
        if (ekjz.h(this.d, list)) {
            return;
        }
        this.d = ekgb.n(list);
        mau mauVar = this.a;
        if (mauVar != null) {
            D(mauVar);
        }
    }

    @Override // defpackage.nlx
    public final void o(nkz nkzVar) {
        nkw nkwVar = this.b;
        nkwVar.n = nkzVar;
        ((njt) nkwVar.f).e = nkzVar;
    }

    @Override // defpackage.nlx
    public final void p() {
        nkw nkwVar = this.b;
        long j = this.g;
        nkwVar.s = j;
        if (nkwVar.r >= j) {
            nkwVar.j();
        }
    }

    @Override // defpackage.nlx
    public final void q() {
        nkw nkwVar = this.b;
        if (nkwVar.e) {
            nkwVar.f.q();
        }
    }

    @Override // defpackage.nlx
    public final void r() {
        nkw nkwVar = this.b;
        if (nkwVar.e) {
            nkwVar.f.r();
        }
    }

    @Override // defpackage.nlx
    public final boolean s(long j, nlv nlvVar) {
        mee.c(this.j);
        nkw nkwVar = this.b;
        int i = nkwVar.u;
        if (i != -1 && i == nkwVar.v) {
            mdd mddVar = nkwVar.m;
            mee.f(mddVar);
            if (mddVar.a(0) < this.c) {
                mdd mddVar2 = nkwVar.m;
                mee.f(mddVar2);
                if (mddVar2.m(0)) {
                    long j2 = j + this.f;
                    this.g = j2;
                    nlvVar.a(j2 * 1000);
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.nlx
    public final boolean t() {
        if (!this.j) {
            return false;
        }
        nkw nkwVar = this.b;
        return nkwVar.p == 0 && nkwVar.t && nkwVar.f.t();
    }

    @Override // defpackage.nlx
    public final boolean u() {
        return this.j;
    }

    @Override // defpackage.nlx
    public final boolean v(boolean z) {
        boolean z2 = z && this.j;
        nkw nkwVar = this.b;
        return nkwVar.f.v(z2 && nkwVar.p == 0);
    }

    @Override // defpackage.nlx
    public final void w(mau mauVar, long j, int i, List list) {
        mee.c(this.j);
        this.d = ekgb.n(list);
        this.e = 1;
        this.a = mauVar;
        nkw nkwVar = this.b;
        nkwVar.s = -9223372036854775807L;
        nkwVar.t = false;
        D(mauVar);
        long j2 = this.g;
        long j3 = -4611686018427387904L;
        if (nkwVar.e) {
            if (j2 != -9223372036854775807L) {
                j3 = j2 + 1;
            }
        } else if (j2 != -9223372036854775807L) {
            return;
        }
        long j4 = j3;
        nkwVar.i.e(j4, new nkv(j + this.f, i, j4));
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0055  */
    @Override // defpackage.nlx
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void x(defpackage.mau r22) throws defpackage.nlw {
        /*
            Method dump skipped, instructions count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nkq.x(mau):void");
    }

    @Override // defpackage.nkr
    public final void y(final mcw mcwVar) {
        final nlu nluVar = this.h;
        this.i.execute(new Runnable() { // from class: nkl
            @Override // java.lang.Runnable
            public final void run() {
                mau mauVar = this.a.a;
                mee.g(mauVar);
                nluVar.a(new nlw(mcwVar, mauVar));
            }
        });
    }

    @Override // defpackage.nkr
    public final void z() {
        final nlu nluVar = this.h;
        Executor executor = this.i;
        nluVar.getClass();
        executor.execute(new Runnable() { // from class: nkn
            @Override // java.lang.Runnable
            public final void run() {
                nluVar.b();
            }
        });
    }
}
