package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dqay {
    public final dqax a;
    public final dqaw b;

    public dqay(dqax dqaxVar, dqaw dqawVar) {
        this.a = dqaxVar;
        this.b = dqawVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dqay)) {
            return false;
        }
        dqay dqayVar = (dqay) obj;
        return fdbq.f(this.a, dqayVar.a) && fdbq.f(this.b, dqayVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        dqaw dqawVar = this.b;
        return iHashCode + (dqawVar == null ? 0 : dqawVar.hashCode());
    }

    public final String toString() {
        return "ReactiveSpanResolver(rowSpanCountResolver=" + this.a + ", itemSpanSizeResolver=" + this.b + ")";
    }

    public /* synthetic */ dqay(dqax dqaxVar) {
        this(dqaxVar, null);
    }
}
