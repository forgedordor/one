package defpackage;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class xef {
    public final dpdy a;
    public final djdm b;

    public xef(dpdy dpdyVar, djdm djdmVar) {
        this.a = dpdyVar;
        this.b = djdmVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xef)) {
            return false;
        }
        xef xefVar = (xef) obj;
        return fdbq.f(this.a, xefVar.a) && fdbq.f(this.b, xefVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        djdm djdmVar = this.b;
        return iHashCode + (djdmVar == null ? 0 : djdmVar.hashCode());
    }

    public final String toString() {
        return "InputsData(hugoUiData=" + this.a + ", inputsUiData=" + this.b + ")";
    }
}
