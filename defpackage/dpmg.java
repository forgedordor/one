package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpmg {
    public final Object a;
    public final dpos b;
    public final dpmi c;

    public dpmg(Object obj, dpos dposVar, dpmi dpmiVar) {
        this.a = obj;
        this.b = dposVar;
        this.c = dpmiVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dpmg)) {
            return false;
        }
        dpmg dpmgVar = (dpmg) obj;
        return fdbq.f(this.a, dpmgVar.a) && fdbq.f(this.b, dpmgVar.b) && fdbq.f(this.c, dpmgVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "Projection(uiData=" + this.a + ", uiSpec=" + this.b + ", lifecycle=" + this.c + ")";
    }
}
