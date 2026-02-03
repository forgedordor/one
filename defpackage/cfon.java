package defpackage;

import java.util.List;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cfon {
    public final List a;

    public cfon(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cfon) && fdbq.f(this.a, ((cfon) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "LoadedDatabaseConversationProperties(participants=" + this.a + ")";
    }
}
