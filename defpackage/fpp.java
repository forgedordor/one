package defpackage;

import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fpp implements koa {
    private final long a;
    private final kio b;
    private final fdat c;

    public fpp(long j, kio kioVar, fdat fdatVar) {
        this.a = j;
        this.b = kioVar;
        this.c = fdatVar;
    }

    @Override // defpackage.koa
    public final long a(kjd kjdVar, long j, kji kjiVar, long j2) {
        fcux fcuxVar;
        Object obj;
        Object next;
        kio kioVar = this.b;
        int iEp = kioVar.ep(48.0f);
        long j3 = this.a;
        int iEp2 = kioVar.ep(kiu.a(j3));
        kji kjiVar2 = kji.a;
        int i = iEp2 * (kjiVar == kjiVar2 ? 1 : -1);
        int iEp3 = kioVar.ep(kiu.b(j3));
        int i2 = kjdVar.b;
        int i3 = kjdVar.d;
        int iB = kjg.b(j2);
        int iB2 = kjg.b(j) - kjg.b(j2);
        int iIntValue = (i3 - iB) + i;
        int i4 = i + i2;
        if (kjiVar == kjiVar2) {
            Integer numValueOf = Integer.valueOf(i4);
            Integer numValueOf2 = Integer.valueOf(iIntValue);
            if (i2 < 0) {
                iB2 = 0;
            }
            fcuxVar = new fcux(new Integer[]{numValueOf, numValueOf2, Integer.valueOf(iB2)});
        } else {
            Integer numValueOf3 = Integer.valueOf(iIntValue);
            Integer numValueOf4 = Integer.valueOf(i4);
            if (i3 <= kjg.b(j)) {
                iB2 = 0;
            }
            fcuxVar = new fcux(new Integer[]{numValueOf3, numValueOf4, Integer.valueOf(iB2)});
        }
        Iterator itA = fcuxVar.a();
        while (true) {
            obj = null;
            if (!itA.hasNext()) {
                next = null;
                break;
            }
            next = itA.next();
            int iIntValue2 = ((Number) next).intValue();
            if (iIntValue2 >= 0 && iIntValue2 + kjg.b(j2) <= kjg.b(j)) {
                break;
            }
        }
        Integer num = (Integer) next;
        if (num != null) {
            iIntValue = num.intValue();
        }
        int iMax = Math.max(kjdVar.e + iEp3, iEp);
        int i5 = kjdVar.c;
        int iA = (i5 - kjg.a(j2)) + iEp3;
        Iterator itA2 = new fcux(new Integer[]{Integer.valueOf(iMax), Integer.valueOf(iA), Integer.valueOf((i5 - (kjg.a(j2) / 2)) + iEp3), Integer.valueOf((kjg.a(j) - kjg.a(j2)) - iEp)}).a();
        while (true) {
            if (!itA2.hasNext()) {
                break;
            }
            Object next2 = itA2.next();
            int iIntValue3 = ((Number) next2).intValue();
            if (iIntValue3 >= iEp && iIntValue3 + kjg.a(j2) <= kjg.a(j) - iEp) {
                obj = next2;
                break;
            }
        }
        Integer num2 = (Integer) obj;
        if (num2 != null) {
            iA = num2.intValue();
        }
        this.c.a(kjdVar, new kjd(iIntValue, iA, kjg.b(j2) + iIntValue, kjg.a(j2) + iA));
        return kjc.a(iIntValue, iA);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fpp)) {
            return false;
        }
        fpp fppVar = (fpp) obj;
        return kiu.d(this.a, fppVar.a) && fdbq.f(this.b, fppVar.b) && fdbq.f(this.c, fppVar.c);
    }

    public final int hashCode() {
        return (((kit.a(this.a) * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "DropdownMenuPositionProvider(contentOffset=" + ((Object) kiu.c(this.a)) + ", density=" + this.b + ", onPositionCalculated=" + this.c + ')';
    }
}
