package defpackage;

import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dsva {
    public final evrp a;
    public final Object b;

    public dsva(evrp evrpVar, Object obj) {
        boolean z = false;
        if (evrpVar.a() >= 200000000 && evrpVar.a() < 300000000) {
            z = true;
        }
        ejwl.a(z);
        this.a = evrpVar;
        this.b = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dsva) {
            dsva dsvaVar = (dsva) obj;
            if (this.a.equals(dsvaVar.a) && this.b.equals(dsvaVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
