package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dowy {
    public final dpxd a;
    public final dpxd b;

    public dowy(dpxd dpxdVar, dpxd dpxdVar2) {
        this.a = dpxdVar;
        this.b = dpxdVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dowy)) {
            return false;
        }
        dowy dowyVar = (dowy) obj;
        return fdbq.f(this.a, dowyVar.a) && fdbq.f(this.b, dowyVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + ((dpxb) this.b).a;
    }

    public final String toString() {
        return "Tint(background=" + this.a + ", icon=" + this.b + ")";
    }
}
