package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xsi {
    public final int a;
    public final dtic b;
    public final int c;

    public xsi(int i, dtic dticVar, int i2) {
        dticVar.getClass();
        this.a = i;
        this.b = dticVar;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xsi)) {
            return false;
        }
        xsi xsiVar = (xsi) obj;
        return this.a == xsiVar.a && fdbq.f(this.b, xsiVar.b) && this.c == xsiVar.c;
    }

    public final int hashCode() {
        return (((this.a * 31) + this.b.hashCode()) * 31) + this.c;
    }

    public final String toString() {
        return "ExampleTheme(id=" + this.a + ", tonalPalette=" + this.b + ", nameResId=" + this.c + ")";
    }
}
