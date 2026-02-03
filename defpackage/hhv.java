package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class hhv {
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final long e;

    public hhv(int i, int i2, int i3, int i4, long j) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hhv)) {
            return false;
        }
        hhv hhvVar = (hhv) obj;
        return this.a == hhvVar.a && this.b == hhvVar.b && this.c == hhvVar.c && this.d == hhvVar.d && this.e == hhvVar.e;
    }

    public final int hashCode() {
        long j = this.e;
        return (((((((this.a * 31) + this.b) * 31) + this.c) * 31) + this.d) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "CalendarMonth(year=" + this.a + ", month=" + this.b + ", numberOfDays=" + this.c + ", daysFromStartOfWeekToFirstOfMonth=" + this.d + ", startUtcTimeMillis=" + this.e + ')';
    }
}
