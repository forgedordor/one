package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ahyo {
    public final String a;
    public final long b;
    public final long c;

    public ahyo(String str, long j, long j2) {
        this.a = str;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ahyo)) {
            return false;
        }
        ahyo ahyoVar = (ahyo) obj;
        return fdbq.f(this.a, ahyoVar.a) && this.b == ahyoVar.b && this.c == ahyoVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + ahyn.a(this.b)) * 31) + ahyn.a(this.c);
    }

    public final String toString() {
        return "CountInfo(tableName=" + this.a + ", status=" + this.b + ", count=" + this.c + ")";
    }
}
