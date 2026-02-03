package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eln implements eou {
    public final int a;
    public final Object b;
    public final int d;
    public final LazyLayoutItemAnimator e;
    public final int f;
    public final int g;
    public int i;
    public final long j;
    public long k;
    public int l;
    public int m;
    public boolean n;
    private final int o;
    private final kji p;
    private final int q;
    private final List r;
    private final long s;
    private final long t;
    private final int u;
    private final int v;
    private int w;
    public final boolean c = true;
    public int h = Integer.MIN_VALUE;

    public eln(int i, Object obj, int i2, int i3, kji kjiVar, int i4, int i5, List list, long j, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2, int i6, int i7) {
        this.a = i;
        this.b = obj;
        this.o = i2;
        this.p = kjiVar;
        this.q = i4;
        this.d = i5;
        this.r = list;
        this.s = j;
        this.e = lazyLayoutItemAnimator;
        this.t = j2;
        this.u = i6;
        this.v = i7;
        int size = list.size();
        int iMax = 0;
        for (int i8 = 0; i8 < size; i8++) {
            iMax = Math.max(iMax, ((iyl) list.get(i8)).b);
        }
        this.f = iMax;
        this.g = fddu.f(iMax + i3, 0);
        this.j = (this.o << 32) | (4294967295L & iMax);
        this.k = 0L;
        this.l = -1;
        this.m = -1;
    }

    @Override // defpackage.eou
    public final int a() {
        return this.a;
    }

    @Override // defpackage.eou
    public final int b() {
        return this.u;
    }

    @Override // defpackage.eou
    public final int c() {
        return this.g;
    }

    @Override // defpackage.eou
    public final int d() {
        return this.r.size();
    }

    @Override // defpackage.eou
    public final int e() {
        return this.v;
    }

    @Override // defpackage.eou
    public final long f() {
        return this.t;
    }

    @Override // defpackage.eou
    public final long g(int i) {
        return this.k;
    }

    @Override // defpackage.eou
    public final Object h() {
        return this.b;
    }

    @Override // defpackage.eou
    public final Object i(int i) {
        return ((iyl) this.r.get(i)).f();
    }

    public final void j(iyk iykVar, boolean z) {
        ini iniVar;
        if (this.h == Integer.MIN_VALUE) {
            ebs.c("position() should be called first");
        }
        int iD = d();
        for (int i = 0; i < iD; i++) {
            iyl iylVar = (iyl) this.r.get(i);
            int i2 = this.w - iylVar.b;
            int i3 = this.i;
            long j = this.k;
            ens ensVarB = this.e.b(this.b, i);
            if (ensVarB != null) {
                if (z) {
                    ensVarB.g = j;
                } else {
                    long j2 = ensVarB.g;
                    if (true == kjb.f(j2, 9223372034707292159L)) {
                        j2 = j;
                    }
                    long jD = kjb.d(j2, ensVarB.a());
                    if ((kjb.b(j) <= i2 && kjb.b(jD) <= i2) || (kjb.b(j) >= i3 && kjb.b(jD) >= i3)) {
                        ensVarB.c();
                    }
                    j = jD;
                }
                iniVar = ensVarB.d;
            } else {
                iniVar = null;
            }
            long jD2 = kjb.d(j, this.s);
            if (!z && ensVarB != null) {
                ensVarB.c = jD2;
            }
            if (iniVar != null) {
                iykVar.w(iylVar, jD2, iniVar, 0.0f);
            } else {
                iykVar.v(iylVar, jD2, 0.0f, iyn.a);
            }
        }
    }

    public final void k(int i, int i2, int i3, int i4, int i5, int i6) {
        this.h = i4;
        if (this.p == kji.b) {
            i2 = (i3 - i2) - this.o;
        }
        this.k = (i2 << 32) | (i & 4294967295L);
        this.l = i5;
        this.m = i6;
        this.w = -this.q;
        this.i = i4 + this.d;
    }

    @Override // defpackage.eou
    public final void l(int i, int i2, int i3, int i4) {
        k(i, i2, i3, i4, -1, -1);
    }

    @Override // defpackage.eou
    public final boolean m() {
        return true;
    }

    @Override // defpackage.eou
    public final void n() {
        this.n = true;
    }
}
