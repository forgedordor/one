package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
final class ejpu {
    public Integer a;
    public final Integer b;
    public final Integer c;
    public final Integer d;
    public final Integer e;
    public final Integer f;

    public ejpu(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6) {
        this.a = num;
        this.b = num2;
        this.c = num3;
        this.d = num4;
        this.e = num5;
        this.f = num6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejpu)) {
            return false;
        }
        ejpu ejpuVar = (ejpu) obj;
        return fdbq.f(this.a, ejpuVar.a) && fdbq.f(this.b, ejpuVar.b) && fdbq.f(this.c, ejpuVar.c) && fdbq.f(this.d, ejpuVar.d) && fdbq.f(this.e, ejpuVar.e) && fdbq.f(this.f, ejpuVar.f);
    }

    public final int hashCode() {
        Integer num = this.a;
        int iHashCode = num == null ? 0 : num.hashCode();
        Integer num2 = this.b;
        int iHashCode2 = num2 == null ? 0 : num2.hashCode();
        int i = iHashCode * 31;
        Integer num3 = this.c;
        int iHashCode3 = (((((((i + iHashCode2) * 31) + (num3 == null ? 0 : num3.hashCode())) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31;
        Integer num4 = this.f;
        return iHashCode3 + (num4 != null ? num4.hashCode() : 0);
    }

    public final String toString() {
        return "DateTimeData(year=" + this.a + ", month=" + this.b + ", day=" + this.c + ", minute=" + this.d + ", second=" + this.e + ", hour=" + this.f + ")";
    }
}
