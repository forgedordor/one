package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jum {
    public final Object a;
    public final int b;
    public final int c;
    public final String d;

    public jum(Object obj, int i, int i2) {
        this(obj, i, i2, "");
    }

    public static /* synthetic */ jum a(jum jumVar, Object obj, int i, int i2) {
        if ((i2 & 1) != 0) {
            obj = jumVar.a;
        }
        int i3 = (i2 & 2) != 0 ? jumVar.b : 0;
        if ((i2 & 4) != 0) {
            i = jumVar.c;
        }
        return new jum(obj, i3, i, jumVar.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jum)) {
            return false;
        }
        jum jumVar = (jum) obj;
        return fdbq.f(this.a, jumVar.a) && this.b == jumVar.b && this.c == jumVar.c && fdbq.f(this.d, jumVar.d);
    }

    public final int hashCode() {
        Object obj = this.a;
        return ((((((obj == null ? 0 : obj.hashCode()) * 31) + this.b) * 31) + this.c) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Range(item=" + this.a + ", start=" + this.b + ", end=" + this.c + ", tag=" + this.d + ')';
    }

    public jum(Object obj, int i, int i2, String str) {
        this.a = obj;
        this.b = i;
        this.c = i2;
        this.d = str;
        if (i <= i2) {
            return;
        }
        kfq.b("Reversed range is not supported");
    }
}
