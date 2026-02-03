package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dkrm implements dkrn {
    public final List a;
    public final dkeg b;

    public dkrm(List list, dkeg dkegVar) {
        this.a = list;
        this.b = dkegVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dkrm)) {
            return false;
        }
        dkrm dkrmVar = (dkrm) obj;
        return fdbq.f(this.a, dkrmVar.a) && fdbq.f(this.b, dkrmVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "GaiaSellPageSellItemUiData(suggestionList=" + this.a + ", body=" + this.b + ")";
    }
}
