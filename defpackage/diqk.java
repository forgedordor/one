package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diqk implements diqp {
    public final String a;
    public final int b;
    public final String c;
    public final dirz d;

    public diqk(String str, int i, String str2, dirz dirzVar) {
        this.a = str;
        this.b = i;
        this.c = str2;
        this.d = dirzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diqk)) {
            return false;
        }
        diqk diqkVar = (diqk) obj;
        return fdbq.f(this.a, diqkVar.a) && this.b == diqkVar.b && fdbq.f(this.c, diqkVar.c) && fdbq.f(this.d, diqkVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "Emoji(emoji=" + this.a + ", count=" + this.b + ", contentDescription=" + this.c + ", style=" + this.d + ")";
    }
}
