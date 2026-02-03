package defpackage;

import android.media.MediaFormat;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
final class njt implements nlx {
    public final Queue a;
    public Surface b;
    public nlu c;
    public Executor d;
    public nkz e;
    private final nlc f;
    private final nlh g;
    private mau h;
    private long i;

    public njt(nlc nlcVar, mej mejVar) {
        this.f = nlcVar;
        nlcVar.a = mejVar;
        this.g = new nlh(new njs(this), nlcVar);
        this.a = new ArrayDeque();
        this.h = new mau(new mat());
        this.i = -9223372036854775807L;
        this.c = nlu.b;
        this.d = new Executor() { // from class: njm
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
            }
        };
        this.e = new nkz() { // from class: njn
            @Override // defpackage.nkz
            public final void c(long j, long j2, mau mauVar, MediaFormat mediaFormat) {
            }
        };
    }

    @Override // defpackage.nlx
    public final Surface a() {
        Surface surface = this.b;
        mee.g(surface);
        return surface;
    }

    @Override // defpackage.nlx
    public final void b() {
        this.f.b();
    }

    @Override // defpackage.nlx
    public final void c() {
        this.b = null;
        this.f.j(null);
    }

    @Override // defpackage.nlx
    public final void d(boolean z) {
        if (z) {
            this.f.g();
        }
        nlh nlhVar = this.g;
        nlhVar.e.d();
        nlhVar.f = -9223372036854775807L;
        nlhVar.g = -9223372036854775807L;
        nlhVar.h = -9223372036854775807L;
        mfx mfxVar = nlhVar.d;
        if (mfxVar.a() > 0) {
            nlhVar.j = ((Long) nlh.a(mfxVar)).longValue();
        }
        mfx mfxVar2 = nlhVar.c;
        if (mfxVar2.a() > 0) {
            mfxVar2.e(0L, (mde) nlh.a(mfxVar2));
        }
        this.a.clear();
    }

    @Override // defpackage.nlx
    public final void e(boolean z) {
        this.f.c(z);
    }

    @Override // defpackage.nlx
    public final void f() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.nlx
    public final void h(long j, long j2) throws nlw {
        try {
            nlh nlhVar = this.g;
            while (true) {
                mfh mfhVar = nlhVar.e;
                if (mfhVar.e()) {
                    return;
                }
                long jA = mfhVar.a();
                Long l = (Long) nlhVar.d.d(jA);
                if (l != null && l.longValue() != nlhVar.j) {
                    nlhVar.j = l.longValue();
                    nlhVar.a.f(2);
                }
                nlc nlcVar = nlhVar.a;
                long j3 = nlhVar.j;
                nla nlaVar = nlhVar.b;
                int iA = nlcVar.a(jA, j, j2, j3, false, false, nlaVar);
                if (iA == 0 || iA == 1) {
                    nlhVar.g = jA;
                    long jB = mfhVar.b();
                    mde mdeVar = (mde) nlhVar.c.d(jB);
                    if (mdeVar != null && !mdeVar.equals(mde.a) && !mdeVar.equals(nlhVar.i)) {
                        nlhVar.i = mdeVar;
                        final njs njsVar = nlhVar.k;
                        final mde mdeVar2 = nlhVar.i;
                        mat matVar = new mat();
                        matVar.t = mdeVar2.b;
                        matVar.u = mdeVar2.c;
                        matVar.c("video/raw");
                        njsVar.a = new mau(matVar);
                        njsVar.b.d.execute(new Runnable() { // from class: njr
                            @Override // java.lang.Runnable
                            public final void run() {
                                njsVar.b.c.e(mdeVar2);
                            }
                        });
                    }
                    long jNanoTime = iA == 0 ? System.nanoTime() : nlaVar.b;
                    final njs njsVar2 = nlhVar.k;
                    if (nlcVar.m()) {
                        njt njtVar = njsVar2.b;
                        if (njtVar.b != null) {
                            njtVar.d.execute(new Runnable() { // from class: njp
                                @Override // java.lang.Runnable
                                public final void run() {
                                    njsVar2.b.c.b();
                                }
                            });
                        }
                    }
                    mau mauVar = njsVar2.a;
                    if (mauVar == null) {
                        mauVar = new mau(new mat());
                    }
                    njt njtVar2 = njsVar2.b;
                    njtVar2.e.c(jB, jNanoTime, mauVar, null);
                    ((nlv) njtVar2.a.remove()).a(jNanoTime);
                } else if (iA == 2 || iA == 3) {
                    nlhVar.g = jA;
                    mfhVar.b();
                    final njs njsVar3 = nlhVar.k;
                    njt njtVar3 = njsVar3.b;
                    njtVar3.d.execute(new Runnable() { // from class: njq
                        @Override // java.lang.Runnable
                        public final void run() {
                            njsVar3.b.c.d();
                        }
                    });
                    ((nlv) njtVar3.a.remove()).b();
                } else if (iA != 4) {
                    return;
                } else {
                    nlhVar.g = jA;
                }
            }
        } catch (mpn e) {
            throw new nlw(e, this.h);
        }
    }

    @Override // defpackage.nlx
    public final void i(long j) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.nlx
    public final void j(int i) {
        this.f.h(i);
    }

    @Override // defpackage.nlx
    public final void k(nlu nluVar, Executor executor) {
        this.c = nluVar;
        this.d = executor;
    }

    @Override // defpackage.nlx
    public final void l(Surface surface, mft mftVar) {
        this.b = surface;
        this.f.j(surface);
    }

    @Override // defpackage.nlx
    public final void m(float f) {
        this.f.k(f);
    }

    @Override // defpackage.nlx
    public final void n(List list) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.nlx
    public final void o(nkz nkzVar) {
        this.e = nkzVar;
    }

    @Override // defpackage.nlx
    public final void p() {
        nlh nlhVar = this.g;
        long j = nlhVar.f;
        if (j == -9223372036854775807L) {
            j = Long.MIN_VALUE;
            nlhVar.f = Long.MIN_VALUE;
            nlhVar.g = Long.MIN_VALUE;
        }
        nlhVar.h = j;
    }

    @Override // defpackage.nlx
    public final void q() {
        this.f.d();
    }

    @Override // defpackage.nlx
    public final void r() {
        this.f.e();
    }

    @Override // defpackage.nlx
    public final boolean s(long j, nlv nlvVar) {
        this.a.add(nlvVar);
        nlh nlhVar = this.g;
        nlhVar.e.c(j);
        nlhVar.f = j;
        nlhVar.h = -9223372036854775807L;
        this.d.execute(new Runnable() { // from class: njo
            @Override // java.lang.Runnable
            public final void run() {
                this.a.c.c();
            }
        });
        return true;
    }

    @Override // defpackage.nlx
    public final boolean t() {
        nlh nlhVar = this.g;
        long j = nlhVar.h;
        return j != -9223372036854775807L && nlhVar.g == j;
    }

    @Override // defpackage.nlx
    public final boolean u() {
        return true;
    }

    @Override // defpackage.nlx
    public final boolean v(boolean z) {
        return this.f.l(z);
    }

    @Override // defpackage.nlx
    public final void w(mau mauVar, long j, int i, List list) {
        mee.c(list.isEmpty());
        int i2 = mauVar.v;
        mau mauVar2 = this.h;
        if (i2 != mauVar2.v || mauVar.w != mauVar2.w) {
            nlh nlhVar = this.g;
            int i3 = mauVar.w;
            long j2 = nlhVar.f;
            nlhVar.c.e(j2 == -9223372036854775807L ? 0L : j2 + 1, new mde(i2, i3));
        }
        float f = mauVar.z;
        if (f != this.h.z) {
            this.f.i(f);
        }
        this.h = mauVar;
        if (j != this.i) {
            nlh nlhVar2 = this.g;
            if (nlhVar2.e.e()) {
                nlhVar2.a.f(i);
                nlhVar2.j = j;
            } else {
                mfx mfxVar = nlhVar2.d;
                long j3 = nlhVar2.f;
                mfxVar.e(j3 == -9223372036854775807L ? -4611686018427387904L : j3 + 1, Long.valueOf(j));
            }
            this.i = j;
        }
    }

    @Override // defpackage.nlx
    public final void g() {
    }

    @Override // defpackage.nlx
    public final void x(mau mauVar) {
    }
}
