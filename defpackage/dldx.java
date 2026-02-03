package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dldx {
    public final List a;
    public final diih b;

    public dldx(List list, diih diihVar) {
        list.getClass();
        this.a = list;
        this.b = diihVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dldx)) {
            return false;
        }
        dldx dldxVar = (dldx) obj;
        return fdbq.f(this.a, dldxVar.a) && fdbq.f(this.b, dldxVar.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        diih diihVar = this.b;
        return iHashCode + (diihVar == null ? 0 : diihVar.hashCode());
    }

    public final String toString() {
        return "SuggestionListUiData(suggestionList=" + this.a + ", initialCompositionElement=" + this.b + ")";
    }

    public /* synthetic */ dldx(List list) {
        this(list, null);
    }
}
