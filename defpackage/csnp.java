package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csnp {
    private final String a;
    private final int b;

    public csnp(int i, String str) {
        this.b = i;
        this.a = str;
    }

    public final csdd a(Integer num) {
        int i = this.b;
        int i2 = i - 2;
        eoff eoffVar = (i2 == 2 || i2 == 8) ? eoff.SPAM : i2 != 11 ? eoff.NO_VERDICT : eoff.NOT_SPAM;
        csdo csdoVar = i2 != 2 ? i2 != 8 ? i2 != 11 ? csdo.a : csdo.c : csdo.b : csdo.c;
        String str = this.a;
        ekrg ekrgVar = csnv.a;
        return new csdd(eoffVar, csdoVar, str, csno.a(i, num), null, 16);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csnp)) {
            return false;
        }
        csnp csnpVar = (csnp) obj;
        return this.b == csnpVar.b && fdbq.f(this.a, csnpVar.a);
    }

    public final int hashCode() {
        String str = this.a;
        return (this.b * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "StrangerCheckResult(action=" + ((Object) felu.b(this.b)) + ", initiatedBy=" + this.a + ")";
    }
}
