package defpackage;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class cnxd {
    public final int a;
    public final int b;
    public final int c;
    private final int d;
    private final int e;

    public cnxd(int i) {
        this.d = i;
        Object objE = cnrt.e.e();
        objE.getClass();
        this.a = ((Number) objE).intValue();
        Object objE2 = cnrt.g.e();
        objE2.getClass();
        int iIntValue = ((Number) objE2).intValue();
        this.e = iIntValue;
        Object objE3 = cnrt.f.e();
        objE3.getClass();
        int iIntValue2 = ((Number) objE3).intValue();
        this.b = iIntValue2;
        this.c = fddu.i(i, iIntValue, iIntValue2);
        ejyb.d(iIntValue <= iIntValue2, iIntValue, iIntValue2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cnxd) && this.d == ((cnxd) obj).d;
    }

    public final int hashCode() {
        return this.d;
    }

    public final String toString() {
        return "BatchLimits(targetMessagesToUpdate=" + this.d + ")";
    }
}
