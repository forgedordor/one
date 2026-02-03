package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hij implements koa {
    private final long a;
    private final kio b;
    private final int c;
    private final fdat d;
    private final hjk e;
    private final hjk f;
    private final hjk g;
    private final hjk h;
    private final hjl i;
    private final hjl j;
    private final hjl k;
    private final hjl l;
    private final hjl m;

    public hij(long j, kio kioVar, int i, fdat fdatVar) {
        this.a = j;
        this.b = kioVar;
        this.c = i;
        this.d = fdatVar;
        int iEp = kioVar.ep(kiu.a(j));
        ibx ibxVar = ibw.j;
        this.e = new hfi(ibxVar, ibxVar, iEp);
        ibx ibxVar2 = ibw.l;
        this.f = new hfi(ibxVar2, ibxVar2, iEp);
        this.g = new hlc(ibs.c);
        this.h = new hlc(ibs.d);
        int iEp2 = kioVar.ep(kiu.b(j));
        icc iccVar = ibw.m;
        icc iccVar2 = ibw.o;
        this.i = new hfj(iccVar, iccVar2, iEp2);
        this.j = new hfj(iccVar2, iccVar, iEp2);
        this.k = new hfj(ibw.n, iccVar, iEp2);
        this.l = new hld(iccVar, i);
        this.m = new hld(iccVar2, i);
    }

    @Override // defpackage.koa
    public final long a(kjd kjdVar, long j, kji kjiVar, long j2) {
        kjd kjdVar2;
        long j3;
        char c;
        int iA;
        int iA2;
        int i;
        char c2 = 3;
        hjk[] hjkVarArr = new hjk[3];
        hjkVarArr[0] = this.e;
        hjkVarArr[1] = this.f;
        int i2 = (int) (j >> 32);
        hjkVarArr[2] = kjb.a(kjdVar.c()) < i2 / 2 ? this.g : this.h;
        List listG = fcva.g(hjkVarArr);
        int size = listG.size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                kjdVar2 = kjdVar;
                j3 = j;
                c = c2;
                iA = 0;
                break;
            }
            hjk hjkVar = (hjk) listG.get(i3);
            int i4 = (int) (j2 >> 32);
            int i5 = size;
            c = c2;
            j3 = j;
            int i6 = i3;
            kjdVar2 = kjdVar;
            iA = hjkVar.a(kjdVar2, j3, i4, kjiVar);
            if (i6 == fcva.e(listG) || (iA >= 0 && i4 + iA <= i2)) {
                break;
            }
            i3 = i6 + 1;
            size = i5;
            c2 = c;
        }
        hjl[] hjlVarArr = new hjl[4];
        hjlVarArr[0] = this.i;
        hjlVarArr[1] = this.j;
        hjlVarArr[2] = this.k;
        int i7 = (int) (j3 & 4294967295L);
        hjlVarArr[c] = kjb.b(kjdVar2.c()) < i7 / 2 ? this.l : this.m;
        List listG2 = fcva.g(hjlVarArr);
        int size2 = listG2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size2) {
                iA2 = 0;
                break;
            }
            int i9 = i7;
            int i10 = (int) (j2 & 4294967295L);
            iA2 = ((hjl) listG2.get(i8)).a(kjdVar2, j3, i10);
            if (i8 == fcva.e(listG2) || (iA2 >= (i = this.c) && i10 + iA2 <= i9 - i)) {
                break;
            }
            i8++;
            i7 = i9;
        }
        long j4 = (iA << 32) | (iA2 & 4294967295L);
        this.d.a(kjdVar2, kje.a(j4, j2));
        return j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hij)) {
            return false;
        }
        hij hijVar = (hij) obj;
        return kiu.d(this.a, hijVar.a) && fdbq.f(this.b, hijVar.b) && this.c == hijVar.c && fdbq.f(this.d, hijVar.d);
    }

    public final int hashCode() {
        return (((((kit.a(this.a) * 31) + this.b.hashCode()) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) kiu.c(this.a)) + ", density=" + this.b + ", verticalMargin=" + this.c + ", onPositionCalculated=" + this.d + ')';
    }
}
