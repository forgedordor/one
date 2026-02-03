package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
final class icm extends icg {
    private final String b;
    private final Object c;
    private final Object d;
    private final Object f;

    public icm(String str, Object obj, Object obj2, Object obj3, fdau fdauVar) {
        super(fdauVar);
        this.b = str;
        this.c = obj;
        this.d = obj2;
        this.f = obj3;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof icm)) {
            return false;
        }
        icm icmVar = (icm) obj;
        return fdbq.f(this.b, icmVar.b) && fdbq.f(this.c, icmVar.c) && fdbq.f(this.d, icmVar.d) && fdbq.f(this.f, icmVar.f);
    }

    public final int hashCode() {
        return (((((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.f.hashCode();
    }
}
