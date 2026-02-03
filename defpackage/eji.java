package defpackage;

import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eji implements eou {
    public final int a;
    public final boolean b;
    public final int c;
    public final Object d;
    public final Object e;
    public final LazyLayoutItemAnimator f;
    public int g;
    public final int h;
    public final int i;
    public final int j;
    public boolean k;
    public int l = Integer.MIN_VALUE;
    public int m;
    public final int[] n;
    private final List o;
    private final ibx p;
    private final kji q;
    private final boolean r;
    private final int s;
    private final int t;
    private final long u;
    private final long v;
    private int w;
    private final icc x;

    public eji(int i, List list, boolean z, ibx ibxVar, icc iccVar, kji kjiVar, boolean z2, int i2, int i3, int i4, long j, Object obj, Object obj2, LazyLayoutItemAnimator lazyLayoutItemAnimator, long j2) {
        this.a = i;
        this.o = list;
        this.b = z;
        this.p = ibxVar;
        this.x = iccVar;
        this.q = kjiVar;
        this.r = z2;
        this.s = i2;
        this.c = i3;
        this.t = i4;
        this.u = j;
        this.d = obj;
        this.e = obj2;
        this.f = lazyLayoutItemAnimator;
        this.v = j2;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            iyl iylVar = (iyl) list.get(i6);
            boolean z3 = this.b;
            i5 += z3 ? iylVar.b : iylVar.a;
            iMax = Math.max(iMax, !z3 ? iylVar.b : iylVar.a);
        }
        this.h = i5;
        this.i = fddu.f(i5 + this.t, 0);
        this.j = iMax;
        int size2 = this.o.size();
        this.n = new int[size2 + size2];
    }

    private final int o(long j) {
        return this.b ? kjb.b(j) : kjb.a(j);
    }

    private final int p(iyl iylVar) {
        return this.b ? iylVar.b : iylVar.a;
    }

    @Override // defpackage.eou
    public final int a() {
        return this.a;
    }

    @Override // defpackage.eou
    public final int b() {
        return 0;
    }

    @Override // defpackage.eou
    public final int c() {
        return this.i;
    }

    @Override // defpackage.eou
    public final int d() {
        return this.o.size();
    }

    @Override // defpackage.eou
    public final int e() {
        return 1;
    }

    @Override // defpackage.eou
    public final long f() {
        return this.v;
    }

    @Override // defpackage.eou
    public final long g(int i) {
        int[] iArr = this.n;
        int i2 = i + i;
        return (iArr[i2] << 32) | (iArr[i2 + 1] & 4294967295L);
    }

    @Override // defpackage.eou
    public final Object h() {
        return this.d;
    }

    @Override // defpackage.eou
    public final Object i(int i) {
        return ((iyl) this.o.get(i)).f();
    }

    public final void j(iyk iykVar, boolean z) {
        ini iniVar;
        if (this.l == Integer.MIN_VALUE) {
            ebs.c("position() should be called first");
        }
        int iD = d();
        for (int i = 0; i < iD; i++) {
            iyl iylVar = (iyl) this.o.get(i);
            int iP = this.w - p(iylVar);
            int i2 = this.m;
            long jG = g(i);
            ens ensVarB = this.f.b(this.d, i);
            if (ensVarB != null) {
                if (z) {
                    ensVarB.g = jG;
                } else {
                    long j = ensVarB.g;
                    if (true != kjb.f(j, 9223372034707292159L)) {
                        jG = j;
                    }
                    long jD = kjb.d(jG, ensVarB.a());
                    if ((o(jG) <= iP && o(jD) <= iP) || (o(jG) >= i2 && o(jD) >= i2)) {
                        ensVarB.c();
                    }
                    jG = jD;
                }
                iniVar = ensVarB.d;
            } else {
                iniVar = null;
            }
            if (this.r) {
                jG = this.b ? (kjb.a(jG) << 32) | (((this.l - kjb.b(jG)) - p(iylVar)) & 4294967295L) : (((this.l - kjb.a(jG)) - p(iylVar)) << 32) | (kjb.b(jG) & 4294967295L);
            }
            long jD2 = kjb.d(jG, this.u);
            if (!z && ensVarB != null) {
                ensVarB.c = jD2;
            }
            if (this.b) {
                if (iniVar != null) {
                    iykVar.w(iylVar, jD2, iniVar, 0.0f);
                } else {
                    iykVar.v(iylVar, jD2, 0.0f, iyn.a);
                }
            } else if (iniVar == null) {
                iyk.C(iykVar, iylVar, jD2);
            } else if (iykVar.p() == kji.a || iykVar.a() == 0) {
                iykVar.r(iylVar);
                iylVar.x(kjb.d(jD2, iylVar.e), 0.0f, iniVar);
            } else {
                int iA = iykVar.a() - iylVar.a;
                int iA2 = kjb.a(jD2);
                iykVar.r(iylVar);
                iylVar.x(kjb.d(((iA - iA2) << 32) | (4294967295L & kjb.b(jD2)), iylVar.e), 0.0f, iniVar);
            }
        }
    }

    public final void k(int i, int i2, int i3) {
        int i4;
        this.g = i;
        boolean z = this.b;
        this.l = true != z ? i2 : i3;
        List list = this.o;
        int size = list.size();
        for (int i5 = 0; i5 < size; i5++) {
            iyl iylVar = (iyl) list.get(i5);
            int i6 = i5 + i5;
            if (z) {
                int[] iArr = this.n;
                ibx ibxVar = this.p;
                if (ibxVar == null) {
                    ebs.a("null horizontalAlignment when isVertical == true");
                    throw new fcta();
                }
                iArr[i6] = ibxVar.a(iylVar.a, i2, this.q);
                iArr[i6 + 1] = i;
                i4 = iylVar.b;
            } else {
                int i7 = i6 + 1;
                int[] iArr2 = this.n;
                iArr2[i6] = i;
                icc iccVar = this.x;
                if (iccVar == null) {
                    ebs.a("null verticalAlignment when isVertical == false");
                    throw new fcta();
                }
                iArr2[i7] = iccVar.a(iylVar.b, i3);
                i4 = iylVar.a;
            }
            i += i4;
        }
        this.w = -this.s;
        this.m = this.l + this.c;
    }

    @Override // defpackage.eou
    public final void l(int i, int i2, int i3, int i4) {
        k(i, i3, i4);
    }

    @Override // defpackage.eou
    public final boolean m() {
        return this.b;
    }

    @Override // defpackage.eou
    public final void n() {
        this.k = true;
    }
}
