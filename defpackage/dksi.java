package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dksi {
    public final List a;
    public final int b;
    private final int c;

    public dksi(List list, int i, int i2) {
        this.a = list;
        this.c = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dksi)) {
            return false;
        }
        dksi dksiVar = (dksi) obj;
        return fdbq.f(this.a, dksiVar.a) && this.c == dksiVar.c && this.b == dksiVar.b;
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.c) * 31) + this.b;
    }

    public final String toString() {
        return "GaiaSellPageSellSuggestionItem(suggestionList=" + this.a + ", firstVisibleItemIndex=" + this.c + ", firstVisibleItemOffset=" + this.b + ")";
    }
}
