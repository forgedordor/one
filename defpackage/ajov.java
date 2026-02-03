package defpackage;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ajov {
    public final String a;
    public final int b;
    public final int c;
    public final int d;

    public ajov(String str, int i, int i2) {
        str.getClass();
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = (i + i2) - 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ajov)) {
            return false;
        }
        ajov ajovVar = (ajov) obj;
        return fdbq.f(this.a, ajovVar.a) && this.b == ajovVar.b && this.c == ajovVar.c;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c;
    }

    public final String toString() {
        return "ContactHeaderSection(value=" + this.a + ", start=" + this.b + ", count=" + this.c + ")";
    }
}
