package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class csex {
    public final int a;
    public final int b;
    public final String c;

    public csex(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof csex)) {
            return false;
        }
        csex csexVar = (csex) obj;
        return this.a == csexVar.a && this.b == csexVar.b && fdbq.f(this.c, csexVar.c);
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Annotation(start=" + this.a + ", end=" + this.b + ", type=" + this.c + ")";
    }
}
