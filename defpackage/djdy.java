package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class djdy {
    public final List a;

    public djdy(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof djdy) && fdbq.f(this.a, ((djdy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ComposeRowMentionSuggestionsUiData(entries=" + this.a + ")";
    }
}
