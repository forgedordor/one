package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class elp {
    public final int a;
    public final eln[] b;
    public final int c;
    public final int d;
    private final elu e;
    private final List f;
    private final int g;

    public elp(int i, eln[] elnVarArr, elu eluVar, List list, int i2) {
        this.a = i;
        this.b = elnVarArr;
        this.e = eluVar;
        this.f = list;
        this.g = i2;
        int iMax = 0;
        for (eln elnVar : elnVarArr) {
            iMax = Math.max(iMax, elnVar.f);
        }
        this.c = iMax;
        this.d = fddu.f(iMax + this.g, 0);
    }

    public final eln[] a(int i, int i2, int i3) {
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        while (true) {
            eln[] elnVarArr = this.b;
            if (i4 >= elnVarArr.length) {
                return elnVarArr;
            }
            eln elnVar = elnVarArr[i4];
            long j = ((eki) this.f.get(i5)).a;
            elnVar.k(i, this.e.b[i6], i2, i3, this.a, i6);
            i6++;
            i4++;
            i5++;
        }
    }
}
