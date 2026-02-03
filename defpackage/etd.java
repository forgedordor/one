package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class etd implements ixn {
    public final List a;
    public final int b;
    public final int c;
    public final int d;
    public final dwm e;
    public final int f;
    public final int g;
    public final int h;
    public final erx i;
    public final erx j;
    public final float k;
    public final int l;
    public final boolean m;
    public final eaw n;
    public final fdjx o;
    private final ixn p;
    private final boolean q;
    private final List r;
    private final List s;

    public etd(List list, int i, int i2, int i3, dwm dwmVar, int i4, int i5, int i6, erx erxVar, erx erxVar2, float f, int i7, boolean z, eaw eawVar, ixn ixnVar, boolean z2, List list2, List list3, fdjx fdjxVar) {
        this.a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = dwmVar;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = erxVar;
        this.j = erxVar2;
        this.k = f;
        this.l = i7;
        this.m = z;
        this.n = eawVar;
        this.p = ixnVar;
        this.q = z2;
        this.r = list2;
        this.s = list3;
        this.o = fdjxVar;
    }

    public final int a() {
        return -this.f;
    }

    public final long b() {
        return (k() << 32) | (j() & 4294967295L);
    }

    public final etd c(int i) {
        erx erxVar;
        int i2;
        int i3;
        int i4;
        int i5;
        if (!this.q) {
            List list = this.a;
            if (!list.isEmpty() && (erxVar = this.i) != null && (i2 = this.l - i) >= 0 && i2 < (i5 = (i4 = this.b) + (i3 = this.c))) {
                float f = i;
                float f2 = this.k;
                erx erxVar2 = this.j;
                if (erxVar2 != null) {
                    float f3 = f2 - (f / i5);
                    if (f3 < 0.5f && f3 > -0.5f) {
                        erx erxVar3 = (erx) fcva.N(list);
                        erx erxVar4 = (erx) fcva.S(list);
                        if (i < 0) {
                            if (Math.min((erxVar3.h + i5) - this.f, (erxVar4.h + i5) - this.g) <= (-i)) {
                                return null;
                            }
                        } else if (Math.min(this.f - erxVar3.h, this.g - erxVar4.h) <= i) {
                            return null;
                        }
                        int size = list.size();
                        for (int i6 = 0; i6 < size; i6++) {
                            ((erx) list.get(i6)).a(i);
                        }
                        List list2 = this.r;
                        int size2 = list2.size();
                        for (int i7 = 0; i7 < size2; i7++) {
                            ((erx) list2.get(i7)).a(i);
                        }
                        List list3 = this.s;
                        int size3 = list3.size();
                        for (int i8 = 0; i8 < size3; i8++) {
                            ((erx) list3.get(i8)).a(i);
                        }
                        return new etd(list, i4, i3, this.d, this.e, this.f, this.g, this.h, erxVar, erxVar2, f3, i2, this.m || i > 0, this.n, this.p, false, list2, list3, this.o);
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.ixn
    public final int j() {
        return this.p.j();
    }

    @Override // defpackage.ixn
    public final int k() {
        return this.p.k();
    }

    @Override // defpackage.ixn
    public final Map m() {
        return this.p.m();
    }

    @Override // defpackage.ixn
    public final fdap n() {
        return this.p.n();
    }

    @Override // defpackage.ixn
    public final void o() {
        this.p.o();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ etd(List list, int i, int i2, int i3, dwm dwmVar, int i4, int i5, int i6, eaw eawVar, ixn ixnVar, fdjx fdjxVar) {
        fcvo fcvoVar = fcvo.a;
        this(list, i, i2, i3, dwmVar, i4, i5, i6, null, null, 0.0f, 0, false, eawVar, ixnVar, false, fcvoVar, fcvoVar, fdjxVar);
    }
}
