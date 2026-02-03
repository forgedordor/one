package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class diqo implements diqp {
    public final String a;
    public final String b;
    public final dirz c;
    private final int d = 0;

    public diqo(String str, String str2, dirz dirzVar) {
        this.a = str;
        this.b = str2;
        this.c = dirzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof diqo)) {
            return false;
        }
        diqo diqoVar = (diqo) obj;
        if (!fdbq.f(this.a, diqoVar.a)) {
            return false;
        }
        int i = diqoVar.d;
        return fdbq.f(this.b, diqoVar.b) && fdbq.f(this.c, diqoVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 961) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Text(text=" + this.a + ", count=0, contentDescription=" + this.b + ", style=" + this.c + ")";
    }
}
