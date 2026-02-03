package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class divc implements divd {
    public final List a;
    public final dkeg b;

    public divc(List list, dkeg dkegVar) {
        this.a = list;
        this.b = dkegVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof divc)) {
            return false;
        }
        divc divcVar = (divc) obj;
        return fdbq.f(this.a, divcVar.a) && fdbq.f(this.b, divcVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GaiaOptInSellItemUiData(suggestionList=" + this.a + ", body=" + this.b + ")";
    }
}
