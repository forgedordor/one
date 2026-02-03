package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhq implements Comparable {
    public final int a;
    public final int b;
    public final long c;
    private final int d;

    public hhq(int i, int i2, int i3, long j) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = j;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return fdbq.b(this.c, ((hhq) obj).c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhq)) {
            return false;
        }
        hhq hhqVar = (hhq) obj;
        return this.a == hhqVar.a && this.b == hhqVar.b && this.d == hhqVar.d && this.c == hhqVar.c;
    }

    public final int hashCode() {
        long j = this.c;
        return (((((this.a * 31) + this.b) * 31) + this.d) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "CalendarDate(year=" + this.a + ", month=" + this.b + ", dayOfMonth=" + this.d + ", utcTimeMillis=" + this.c + ')';
    }
}
