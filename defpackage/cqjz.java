package defpackage;

import android.util.SparseArray;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cqjz {
    public final fcsu a;
    public volatile SparseArray b;
    private final fcsu c;

    public cqjz(fcsu fcsuVar, fcsu fcsuVar2) {
        this.a = fcsuVar;
        this.c = fcsuVar2;
    }

    public final int[] a(int i) {
        Integer[] numArr;
        int[] iArrD = ((crny) this.c.b()).h(i).D();
        SparseArray sparseArray = this.b;
        return (sparseArray == null || !((cqky) this.a.b()).a() || (numArr = (Integer[]) sparseArray.get(i)) == null) ? iArrD : new int[]{numArr[0].intValue(), numArr[1].intValue()};
    }
}
