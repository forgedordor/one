package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class khu {
    public static final khu a = new khu(0L, 3);
    public final long b;
    public final long c;

    public khu(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof khu)) {
            return false;
        }
        khu khuVar = (khu) obj;
        return kjl.e(this.b, khuVar.b) && kjl.e(this.c, khuVar.c);
    }

    public final int hashCode() {
        long j = kjl.a;
        return (kjk.a(this.b) * 31) + kjk.a(this.c);
    }

    public final String toString() {
        return "TextIndent(firstLine=" + ((Object) kjl.d(this.b)) + ", restLine=" + ((Object) kjl.d(this.c)) + ')';
    }

    public /* synthetic */ khu(long j, int i) {
        this((i & 1) != 0 ? kjm.c(0) : 0L, (i & 2) != 0 ? kjm.c(0) : j);
    }
}
