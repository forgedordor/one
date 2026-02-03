package defpackage;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class orq {
    public static final orq a;
    public final orp b;
    public final orp c;
    public final orp d;
    public final boolean e;

    static {
        oro oroVar = oro.b;
        a = new orq(oroVar, oroVar, oroVar);
    }

    public orq(orp orpVar, orp orpVar2, orp orpVar3) {
        orpVar.getClass();
        orpVar2.getClass();
        orpVar3.getClass();
        this.b = orpVar;
        this.c = orpVar2;
        this.d = orpVar3;
        boolean z = true;
        if (!(orpVar instanceof orm) && !(orpVar3 instanceof orm) && !(orpVar2 instanceof orm)) {
            z = false;
        }
        this.e = z;
    }

    public static /* synthetic */ orq a(orq orqVar, orp orpVar, orp orpVar2, orp orpVar3, int i) {
        if ((i & 1) != 0) {
            orpVar = orqVar.b;
        }
        if ((i & 2) != 0) {
            orpVar2 = orqVar.c;
        }
        if ((i & 4) != 0) {
            orpVar3 = orqVar.d;
        }
        orpVar.getClass();
        orpVar2.getClass();
        orpVar3.getClass();
        return new orq(orpVar, orpVar2, orpVar3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof orq)) {
            return false;
        }
        orq orqVar = (orq) obj;
        return fdbq.f(this.b, orqVar.b) && fdbq.f(this.c, orqVar.c) && fdbq.f(this.d, orqVar.d);
    }

    public final int hashCode() {
        return (((this.b.hashCode() * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "LoadStates(refresh=" + this.b + ", prepend=" + this.c + ", append=" + this.d + ')';
    }
}
