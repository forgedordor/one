package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elm implements elf, ixn {
    public final elp a;
    public final int b;
    public final boolean c;
    public final float d;
    public final float e;
    public final fdjx f;
    public final kio g;
    public final fdap h;
    public final List i;
    public final int j;
    public final dwm k;
    private final ixn l;
    private final boolean m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private final int r;

    public elm(elp elpVar, int i, boolean z, float f, ixn ixnVar, float f2, boolean z2, fdjx fdjxVar, kio kioVar, int i2, fdap fdapVar, List list, int i3, int i4, int i5, dwm dwmVar, int i6, int i7) {
        this.a = elpVar;
        this.b = i;
        this.c = z;
        this.d = f;
        this.l = ixnVar;
        this.e = f2;
        this.m = z2;
        this.f = fdjxVar;
        this.g = kioVar;
        this.n = i2;
        this.h = fdapVar;
        this.i = list;
        this.o = i3;
        this.p = i4;
        this.j = i5;
        this.k = dwmVar;
        this.q = i6;
        this.r = i7;
    }

    @Override // defpackage.elf
    public final int a() {
        return this.q;
    }

    @Override // defpackage.elf
    public final int b() {
        return -this.o;
    }

    @Override // defpackage.elf
    public final int c() {
        return this.r;
    }

    @Override // defpackage.elf
    public final int d() {
        return this.j;
    }

    @Override // defpackage.elf
    public final int e() {
        return this.p;
    }

    @Override // defpackage.elf
    public final int f() {
        return this.o;
    }

    @Override // defpackage.elf
    public final long g() {
        return (k() << 32) | (j() & 4294967295L);
    }

    @Override // defpackage.elf
    public final dwm h() {
        return this.k;
    }

    @Override // defpackage.elf
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

    public final elm l(int i, boolean z) {
        elp elpVar;
        int i2;
        char c;
        long j;
        if (!this.m) {
            List list = this.i;
            if (!list.isEmpty() && (elpVar = this.a) != null && (i2 = this.b - i) >= 0 && i2 < elpVar.d) {
                eln elnVar = (eln) fcva.N(list);
                eln elnVar2 = (eln) fcva.S(list);
                if (!elnVar.n && !elnVar2.n) {
                    if (i < 0) {
                        dwm dwmVar = this.k;
                        if (Math.min((eac.a(elnVar, dwmVar) + elnVar.g) - this.o, (eac.a(elnVar2, dwmVar) + elnVar2.g) - this.p) <= (-i)) {
                            return null;
                        }
                    } else {
                        int i3 = this.o;
                        dwm dwmVar2 = this.k;
                        if (Math.min(i3 - eac.a(elnVar, dwmVar2), this.p - eac.a(elnVar2, dwmVar2)) <= i) {
                            return null;
                        }
                    }
                    int size = list.size();
                    int i4 = 0;
                    while (i4 < size) {
                        eln elnVar3 = (eln) list.get(i4);
                        if (!elnVar3.n) {
                            long j2 = elnVar3.k;
                            boolean z2 = elnVar3.c;
                            int iA = kjb.a(j2);
                            long jB = kjb.b(j2) + i;
                            char c2 = ' ';
                            long j3 = 4294967295L;
                            elnVar3.k = (iA << 32) | (jB & 4294967295L);
                            if (z) {
                                int iD = elnVar3.d();
                                int i5 = 0;
                                while (i5 < iD) {
                                    ens ensVarB = elnVar3.e.b(elnVar3.b, i5);
                                    elp elpVar2 = elpVar;
                                    if (ensVarB != null) {
                                        long j4 = ensVarB.b;
                                        c = c2;
                                        j = j3;
                                        ensVarB.b = (Integer.valueOf(kjb.b(j4) + i).intValue() & j) | (kjb.a(j4) << c);
                                    } else {
                                        c = c2;
                                        j = j3;
                                    }
                                    i5++;
                                    elpVar = elpVar2;
                                    c2 = c;
                                    j3 = j;
                                }
                            }
                        }
                        i4++;
                        elpVar = elpVar;
                    }
                    return new elm(elpVar, i2, this.c || i > 0, i, this.l, this.e, false, this.f, this.g, this.n, this.h, list, this.o, this.p, this.j, this.k, this.q, this.r);
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
