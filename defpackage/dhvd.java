package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dhvd extends dhph {
    private final String a;
    private final String b;
    private final double c;

    public dhvd(String str, String str2, double d) {
        this.a = str;
        this.b = str2;
        this.c = d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dhvd)) {
            return false;
        }
        dhvd dhvdVar = (dhvd) obj;
        return fdbq.f(this.a, dhvdVar.a) && fdbq.f(this.b, dhvdVar.b) && Double.compare(this.c, dhvdVar.c) == 0;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        long jDoubleToLongBits = Double.doubleToLongBits(this.c);
        return (iHashCode * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
    }
}
