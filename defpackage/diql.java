package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diql implements diqp {
    public final String a;
    public final float b;
    public final int c;
    public final String d;
    public final dirz e;
    private final String f;

    public diql(String str, String str2, float f, int i, String str3, dirz dirzVar) {
        this.f = str;
        this.a = str2;
        this.b = f;
        this.c = i;
        this.d = str3;
        this.e = dirzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diql)) {
            return false;
        }
        diql diqlVar = (diql) obj;
        return fdbq.f(this.f, diqlVar.f) && fdbq.f(this.a, diqlVar.a) && Float.compare(this.b, diqlVar.b) == 0 && this.c == diqlVar.c && fdbq.f(this.d, diqlVar.d) && fdbq.f(this.e, diqlVar.e);
    }

    public final int hashCode() {
        return (((((((((this.f.hashCode() * 31) + this.a.hashCode()) * 31) + Float.floatToIntBits(this.b)) * 31) + this.c) * 31) + this.d.hashCode()) * 31) + this.e.hashCode();
    }

    public final String toString() {
        return "Emotify(id=" + this.f + ", uri=" + this.a + ", scale=" + this.b + ", count=" + this.c + ", contentDescription=" + this.d + ", style=" + this.e + ")";
    }
}
