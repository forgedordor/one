package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class opc {
    public final orp a;
    public final orp b;
    public final orp c;
    public final orq d;
    public final boolean e;

    public opc(orp orpVar, orp orpVar2, orp orpVar3, orq orqVar) {
        this.a = orpVar;
        this.b = orpVar2;
        this.c = orpVar3;
        this.d = orqVar;
        this.e = orqVar.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        opc opcVar = (opc) obj;
        return fdbq.f(this.a, opcVar.a) && fdbq.f(this.b, opcVar.b) && fdbq.f(this.c, opcVar.c) && fdbq.f(this.d, opcVar.d) && fdbq.f(null, null);
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31;
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ", source=" + this.d + ", mediator=null)";
    }
}
