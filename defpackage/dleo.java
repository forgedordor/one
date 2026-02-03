package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dleo {
    public final List a;
    public final int b;
    public final fdap c;

    public dleo(List list, int i, fdap fdapVar) {
        fdapVar.getClass();
        this.a = list;
        this.b = i;
        this.c = fdapVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dleo)) {
            return false;
        }
        dleo dleoVar = (dleo) obj;
        return fdbq.f(this.a, dleoVar.a) && this.b == dleoVar.b && fdbq.f(this.c, dleoVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "SuggestionTabListUiData(suggestionTabList=" + this.a + ", initialTabIndex=" + this.b + ", onInitialComposition=" + this.c + ")";
    }
}
