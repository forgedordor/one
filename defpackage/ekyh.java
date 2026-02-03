package defpackage;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ekyh implements Comparable, Serializable, ekzg, ekzq {
    static final ekyj a = ekyj.c;
    transient elaw b;
    public final int c;
    public ekyd d;
    public ekyd e;
    public int f;
    private final AtomicInteger g = new AtomicInteger();
    private final ekyj[] h;
    private boolean i;

    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ekyh(java.util.List r27) {
        /*
            Method dump skipped, instructions count: 704
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ekyh.<init>(java.util.List):void");
    }

    private final int q() {
        int i;
        int i2 = 1;
        int i3 = 0;
        while (true) {
            i = this.c;
            if (i2 >= i) {
                break;
            }
            if (d(i2).compareTo(d(i3)) < 0) {
                i3 = i2;
            }
            i2++;
        }
        if (i > 0) {
            int i4 = i + i3;
            if (d(i3 + 1).compareTo(d(i4 - 1)) >= 0) {
                return i4;
            }
        }
        return i3;
    }

    private Object readResolve() {
        f();
        return this;
    }

    @Override // java.lang.Comparable
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final int compareTo(ekyh ekyhVar) {
        int i = this.c;
        int i2 = ekyhVar.c;
        if (i != i2) {
            return i - i2;
        }
        if (i == 0) {
            return 0;
        }
        int iQ = q() % i;
        int iQ2 = ekyhVar.q() % i2;
        for (int i3 = 0; i3 < i; i3++) {
            int iCompareTo = d(iQ).compareTo(ekyhVar.d(iQ2));
            if (iCompareTo != 0) {
                return iCompareTo;
            }
            iQ++;
            iQ2++;
        }
        return 0;
    }

    public final int b(ekyj ekyjVar) throws Throwable {
        int i = this.c;
        if (i < 10) {
            for (int i2 = 1; i2 <= i; i2++) {
                if (d(i2).p(ekyjVar)) {
                    return i2;
                }
            }
            return -1;
        }
        ekya ekyaVarA = this.b.a();
        if (!ekxy.d(ekyaVarA, ekyjVar)) {
            return -1;
        }
        elat elatVarB = ((ekzu) ekyaVarA.a()).b(0);
        for (int iD = elatVarB.d() - 1; iD >= 0; iD--) {
            int iC = elatVarB.c(iD);
            if (d(iC).p(ekyjVar)) {
                return iC == 0 ? i : iC;
            }
            int i3 = iC + 1;
            if (d(i3).p(ekyjVar)) {
                return i3;
            }
        }
        return -1;
    }

    @Override // defpackage.ekzq
    public final int c() {
        if (l()) {
            return 0;
        }
        return this.c;
    }

    public final ekyj d(int i) {
        try {
            ekyj[] ekyjVarArr = this.h;
            int length = ekyjVarArr.length;
            return ekyjVarArr[i >= length ? i - length : i];
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new IllegalStateException("Invalid vertex index " + i + " for loop of " + this.h.length + " vertices.", e);
        }
    }

    @Override // defpackage.ekzq
    public final void e(int i, ekzp ekzpVar) {
        int i2 = i + 1;
        ekyj ekyjVarD = d(i);
        ekyj ekyjVarD2 = d(i2);
        ekzpVar.a = ekyjVarD;
        ekzpVar.b = ekyjVarD2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ekyh) {
            ekyh ekyhVar = (ekyh) obj;
            if (Arrays.equals(this.h, ekyhVar.h) && this.i == ekyhVar.i && ejwh.a(this.d, ekyhVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final void f() {
        int i = this.c;
        int i2 = 10;
        if (i > 8) {
            if (i <= 8192) {
                i2 = 50;
            } else if (i > 50000) {
                i2 = 2;
            }
        }
        this.g.set(i2);
        elaw elawVar = new elaw();
        this.b = elawVar;
        elawVar.c(this);
    }

    final boolean g(ekyj ekyjVar) {
        int i = this.c;
        if (i < 3) {
            return this.i;
        }
        ekxt ekxtVar = new ekxt(ekxm.e, ekyjVar, d(0));
        boolean zD = this.i;
        for (int i2 = 1; i2 <= i; i2++) {
            zD ^= ekxtVar.d(d(i2));
        }
        return zD;
    }

    public final boolean h(ekyj ekyjVar) throws Throwable {
        ekyd ekydVar;
        if (!this.b.d && (ekydVar = this.d) != null && !ekydVar.h(ekyjVar)) {
            return false;
        }
        if (this.c <= 32 || (!this.b.d && this.g.decrementAndGet() > 0)) {
            return g(ekyjVar);
        }
        ekya ekyaVarA = this.b.a();
        if (ekxy.d(ekyaVarA, ekyjVar)) {
            return o(ekyaVarA, ekyjVar);
        }
        return false;
    }

    public final int hashCode() {
        return (this.d.hashCode() * 7) + (this.c * 11) + (this.i ? 1 : 0);
    }

    public final boolean i(ekyh ekyhVar) throws Throwable {
        ekyd ekydVar = this.e;
        ekxe ekxeVar = ekydVar.a;
        ekyd ekydVar2 = ekyhVar.d;
        ekxe ekxeVar2 = ekydVar2.a;
        if ((!ekxeVar2.i() && (ekxeVar2.a < ekxeVar.a || ekxeVar2.b > ekxeVar.b)) || !ekydVar.b.j(ekydVar2.b)) {
            return false;
        }
        if (l() || ekyhVar.c < 2) {
            return m() || ekyhVar.k();
        }
        int iB = b(ekyhVar.d(1));
        if (iB < 0) {
            return h(ekyhVar.d(1));
        }
        ekyj ekyjVarD = d(iB - 1);
        ekyj ekyjVarD2 = d(iB);
        ekyj ekyjVarD3 = d(iB + 1);
        ekyj ekyjVarD4 = ekyhVar.d(0);
        return ekyq.b(ekyjVarD3, ekyhVar.d(2), ekyjVarD4, ekyjVarD2) && ekyq.b(ekyjVarD4, ekyjVarD, ekyjVarD3, ekyjVarD2);
    }

    @Override // defpackage.ekzq
    public final boolean j() {
        return this.i;
    }

    public final boolean k() {
        return l() && !this.i;
    }

    public final boolean l() {
        return this.c == 1;
    }

    public final boolean m() {
        return l() && this.i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r21v2 */
    /* JADX WARN: Type inference failed for: r21v3 */
    /* JADX WARN: Type inference failed for: r21v4, types: [boolean] */
    public final boolean n(ekya ekyaVar, ekxo ekxoVar) {
        int i;
        int i2;
        ?? r21;
        int i3 = 0;
        elat elatVarB = ((ekzu) ekyaVar.a()).b(0);
        int iD = elatVarB.d();
        if (iD == 0) {
            return false;
        }
        int i4 = 1;
        if (ekxy.a(ekyaVar, ekxoVar.d) == 0) {
            return true;
        }
        ekxf ekxfVar = new ekxf();
        ekxfVar.a.e(ekxoVar.e, ekxoVar.f);
        ekxfVar.b.e(ekxoVar.g, ekxoVar.h);
        double d = ekxv.b;
        ekxf ekxfVarB = ekxfVar.b(d);
        ekxg ekxgVar = new ekxg();
        ekxg ekxgVar2 = new ekxg();
        int i5 = 0;
        while (i5 < iD) {
            int iC = elatVarB.c(i5);
            double d2 = d;
            boolean zD = ekxv.d(d(iC), d(iC + i4), ekxoVar.a, d2, ekxgVar, ekxgVar2);
            ekxg ekxgVar3 = ekxgVar;
            ekxg ekxgVar4 = ekxgVar2;
            if (zD) {
                i = i3;
                i2 = iD;
                ekxf ekxfVar2 = new ekxf(ekxe.c(ekxgVar3.a, ekxgVar4.a), ekxe.c(ekxgVar3.b, ekxgVar4.b));
                if (ekxfVarB.a.h(ekxfVar2.a) && ekxfVarB.b.h(ekxfVar2.b)) {
                    ekxg ekxgVarB = ekxg.b(ekxgVar4, ekxgVar3);
                    r21 = i4;
                    ekxg ekxgVar5 = new ekxg(-ekxgVarB.b, ekxgVarB.a);
                    int i6 = ekxgVar5.a >= 0.0d ? r21 == true ? 1 : 0 : i;
                    int i7 = ekxgVar5.b >= 0.0d ? r21 == true ? 1 : 0 : i;
                    double dA = ekxg.a(ekxgVar5, ekxg.b(ekxfVarB.c(i6, i7), ekxgVar3));
                    double dA2 = ekxg.a(ekxgVar5, ekxg.b(ekxfVarB.c(1 - i6, 1 - i7), ekxgVar3));
                    if (dA >= 0.0d && dA2 <= 0.0d) {
                        return r21;
                    }
                }
                i5++;
                i4 = r21;
                ekxgVar2 = ekxgVar4;
                i3 = i;
                iD = i2;
                ekxgVar = ekxgVar3;
                d = d2;
            } else {
                i = i3;
                i2 = iD;
            }
            r21 = i4;
            i5++;
            i4 = r21;
            ekxgVar2 = ekxgVar4;
            i3 = i;
            iD = i2;
            ekxgVar = ekxgVar3;
            d = d2;
        }
        return i3;
    }

    public final boolean o(ekya ekyaVar, ekyj ekyjVar) {
        int i = 0;
        elat elatVarB = ((ekzu) ekyaVar.a()).b(0);
        boolean zF = elatVarB.f();
        int iD = elatVarB.d();
        if (iD > 0) {
            ekxt ekxtVar = new ekxt(ekxy.c(ekyaVar), ekyjVar);
            int i2 = -2;
            while (i < iD) {
                int iC = elatVarB.c(i);
                if (iC != i2 + 1) {
                    ekxtVar.c(d(iC));
                }
                zF ^= ekxtVar.d(d(iC + 1));
                i++;
                i2 = iC;
            }
        }
        return zF;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("S2Loop, depth=");
        sb.append(this.f);
        sb.append(", ");
        ekyj[] ekyjVarArr = this.h;
        sb.append(ekyjVarArr.length);
        sb.append(" points. [");
        for (ekyj ekyjVar : ekyjVarArr) {
            sb.append(ekyjVar.o());
            sb.append(" ");
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // defpackage.ekzq
    public final void p() {
    }

    public ekyh(List list, boolean z, ekyd ekydVar) {
        f();
        int size = list.size();
        this.c = size;
        ekyj[] ekyjVarArr = new ekyj[size];
        this.h = ekyjVarArr;
        this.d = ekydVar;
        this.e = ekxu.a(ekydVar);
        this.f = 0;
        this.i = z;
        list.toArray(ekyjVarArr);
    }
}
