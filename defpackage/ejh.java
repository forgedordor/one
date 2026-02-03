package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ejh implements eja, ixn {
    public final eji a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final fdjx f;
    public final kio g;
    public final long h;
    public final List i;
    public final int j;
    public final int k;
    private final ixn l;
    private final boolean m;
    private final int n;
    private final boolean o;
    private final dwm p;
    private final int q;
    private final int r;

    public ejh(eji ejiVar, int i, boolean z, float f, ixn ixnVar, float f2, boolean z2, fdjx fdjxVar, kio kioVar, long j, List list, int i2, int i3, int i4, boolean z3, dwm dwmVar, int i5, int i6) {
        this.a = ejiVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.l = ixnVar;
        this.e = f2;
        this.m = z2;
        this.f = fdjxVar;
        this.g = kioVar;
        this.h = j;
        this.i = list;
        this.n = i2;
        this.j = i3;
        this.k = i4;
        this.o = z3;
        this.p = dwmVar;
        this.q = i5;
        this.r = i6;
    }

    @Override // defpackage.eja
    public final int a() {
        return this.q;
    }

    @Override // defpackage.eja
    public final int b() {
        return -this.n;
    }

    @Override // defpackage.eja
    public final int c() {
        return this.r;
    }

    @Override // defpackage.eja
    public final int d() {
        return this.k;
    }

    @Override // defpackage.eja
    public final int e() {
        return this.j;
    }

    @Override // defpackage.eja
    public final int f() {
        return this.n;
    }

    @Override // defpackage.eja
    public final long g() {
        return (k() << 32) | (j() & 4294967295L);
    }

    @Override // defpackage.eja
    public final dwm h() {
        return this.p;
    }

    @Override // defpackage.eja
    public final List i() {
        return this.i;
    }

    @Override // defpackage.ixn
    public final int j() {
        return this.l.j();
    }

    @Override // defpackage.ixn
    public final int k() {
        return this.l.k();
    }

    public final ejh l(int i, boolean z) {
        eji ejiVar;
        int i2;
        eji ejiVar2;
        long jB;
        if (!this.m) {
            List list = this.i;
            if (!list.isEmpty() && (ejiVar = this.a) != null && (i2 = this.b - i) >= 0 && i2 < ejiVar.i) {
                eji ejiVar3 = (eji) fcva.N(list);
                eji ejiVar4 = (eji) fcva.S(list);
                if (!ejiVar3.k && !ejiVar4.k) {
                    if (i < 0) {
                        if (Math.min((ejiVar3.g + ejiVar3.i) - this.n, (ejiVar4.g + ejiVar4.i) - this.j) <= (-i)) {
                            return null;
                        }
                    } else if (Math.min(this.n - ejiVar3.g, this.j - ejiVar4.g) <= i) {
                        return null;
                    }
                    int size = list.size();
                    int i3 = 0;
                    while (i3 < size) {
                        eji ejiVar5 = (eji) list.get(i3);
                        if (!ejiVar5.k) {
                            ejiVar5.g += i;
                            int[] iArr = ejiVar5.n;
                            int length = iArr.length;
                            for (int i4 = 0; i4 < length; i4++) {
                                int i5 = i4 & 1;
                                boolean z2 = ejiVar5.b;
                                if (z2) {
                                    if (i5 == 0) {
                                        i5 = 0;
                                        if (z2) {
                                        }
                                    }
                                    iArr[i4] = iArr[i4] + i;
                                } else if (z2 && i5 == 0) {
                                    iArr[i4] = iArr[i4] + i;
                                }
                            }
                            if (z) {
                                int iD = ejiVar5.d();
                                int i6 = 0;
                                while (i6 < iD) {
                                    ens ensVarB = ejiVar5.f.b(ejiVar5.d, i6);
                                    if (ensVarB != null) {
                                        boolean z3 = ejiVar5.b;
                                        long j = ensVarB.b;
                                        if (z3) {
                                            ejiVar2 = ejiVar;
                                            jB = (kjb.a(j) << 32) | (Integer.valueOf(kjb.b(j) + i).intValue() & 4294967295L);
                                        } else {
                                            ejiVar2 = ejiVar;
                                            jB = (kjb.b(j) & 4294967295L) | (Integer.valueOf(kjb.a(j) + i).intValue() << 32);
                                        }
                                        ensVarB.b = jB;
                                    } else {
                                        ejiVar2 = ejiVar;
                                    }
                                    i6++;
                                    ejiVar = ejiVar2;
                                }
                            }
                        }
                        i3++;
                        ejiVar = ejiVar;
                    }
                    return new ejh(ejiVar, i2, this.c || i > 0, i, this.l, this.e, false, this.f, this.g, this.h, list, this.n, this.j, this.k, this.o, this.p, this.q, this.r);
                }
            }
        }
        return null;
    }

    @Override // defpackage.ixn
    public final Map m() {
        return this.l.m();
    }

    @Override // defpackage.ixn
    public final fdap n() {
        return this.l.n();
    }

    @Override // defpackage.ixn
    public final void o() {
        this.l.o();
    }
}
