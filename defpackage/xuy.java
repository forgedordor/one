package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xuy {
    public final evxw a;

    public xuy(evxw evxwVar) {
        this.a = evxwVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xuy) && fdbq.f(this.a, ((xuy) obj).a);
    }

    public final int hashCode() {
        evxw evxwVar = this.a;
        if (evxwVar == null) {
            return 0;
        }
        return evxwVar.hashCode();
    }

    public final String toString() {
        return "EffectUiData(effect=" + this.a + ")";
    }
}
