package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fik {
    public final int a;
    public final long b;
    public final int c;

    public fik(int i, int i2, long j) {
        this.c = i;
        this.a = i2;
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fik)) {
            return false;
        }
        fik fikVar = (fik) obj;
        return this.c == fikVar.c && this.a == fikVar.a && this.b == fikVar.b;
    }

    public final int hashCode() {
        long j = this.b;
        return (((this.c * 31) + this.a) * 31) + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        return "AnchorInfo(direction=" + ((Object) khj.a(this.c)) + ", offset=" + this.a + ", selectableId=" + this.b + ')';
    }
}
