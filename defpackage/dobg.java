package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dobg extends dobi {
    public static final dobf a = new dobf();
    public final String b;
    public final doas c;

    public dobg(String str, doas doasVar) {
        str.getClass();
        this.b = str;
        this.c = doasVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dobg)) {
            return false;
        }
        dobg dobgVar = (dobg) obj;
        return fdbq.f(this.b, dobgVar.b) && fdbq.f(this.c, dobgVar.c);
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.c.hashCode();
    }

    public final String toString() {
        return this.c.a() + "|" + this.b;
    }
}
