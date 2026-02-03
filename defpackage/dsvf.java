package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsvf {
    public final evrp a;
    public final Object b;

    public dsvf(evrp evrpVar, Object obj) {
        this.a = evrpVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dsvf) {
            dsvf dsvfVar = (dsvf) obj;
            if (this.a.equals(dsvfVar.a) && this.b.equals(dsvfVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
