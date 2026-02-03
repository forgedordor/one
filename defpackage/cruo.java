package defpackage;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cruo {
    public final csdo a;
    public final eoff b;

    public cruo(csdo csdoVar, eoff eoffVar) {
        this.a = csdoVar;
        this.b = eoffVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cruo)) {
            return false;
        }
        cruo cruoVar = (cruo) obj;
        return fdbq.f(this.a, cruoVar.a) && this.b == cruoVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "Verdict(confidenceScore=" + this.a + ", outcome=" + this.b + ")";
    }
}
