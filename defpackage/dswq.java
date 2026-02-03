package defpackage;

import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class dswq {
    private final int a;
    private final dsva[] b;
    private final dsvb[] c;

    public dswq(int i, dsva[] dsvaVarArr, dsvb[] dsvbVarArr) {
        dsvaVarArr.getClass();
        dsvbVarArr.getClass();
        this.a = i;
        this.b = dsvaVarArr;
        this.c = dsvbVarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dswq)) {
            return false;
        }
        dswq dswqVar = (dswq) obj;
        return this.a == dswqVar.a && Arrays.equals(this.b, dswqVar.b) && Arrays.equals(this.c, dswqVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + Arrays.hashCode(this.b)) * 31) + Arrays.hashCode(this.c);
    }
}
