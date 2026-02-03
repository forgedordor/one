package defpackage;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dyaf {
    public final ejwi a;
    public final dxxr b;

    public dyaf(ejwi ejwiVar, dxxr dxxrVar) {
        ejwiVar.getClass();
        this.a = ejwiVar;
        this.b = dxxrVar;
    }

    public static final dyag a() {
        dyag dyagVar = new dyag();
        dyagVar.a = new dxxr();
        return dyagVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dyaf)) {
            return false;
        }
        dyaf dyafVar = (dyaf) obj;
        return fdbq.f(this.a, dyafVar.a) && fdbq.f(this.b, dyafVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "AdditionalAccountInformation(observableAccountInformation=" + this.a + ", accountCapabilitiesRetriever=" + this.b + ")";
    }
}
