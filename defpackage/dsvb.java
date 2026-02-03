package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsvb {
    public final evrp a;
    public final Object b;

    public dsvb(evrp evrpVar, Object obj) {
        boolean z = false;
        if (evrpVar.a() >= 100000000 && evrpVar.a() < 200000000) {
            z = true;
        }
        ejwl.a(z);
        this.a = evrpVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dsvb) {
            dsvb dsvbVar = (dsvb) obj;
            if (this.a.equals(dsvbVar.a) && this.b.equals(dsvbVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
