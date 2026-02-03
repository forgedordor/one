package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dlct {
    public final List a;
    public final boolean b;

    public dlct(List list, boolean z) {
        this.a = list;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlct)) {
            return false;
        }
        dlct dlctVar = (dlct) obj;
        return fdbq.f(this.a, dlctVar.a) && this.b == dlctVar.b;
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        return "CombinedSuggestionRowUiData(suggestionList=" + this.a + ", delegatedUiSuggestionsPresent=" + this.b + ")";
    }
}
