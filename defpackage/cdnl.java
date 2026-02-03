package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdnl {
    public final Set a;
    public final Map b;

    public cdnl(Set set, Map map) {
        set.getClass();
        map.getClass();
        this.a = set;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdnl)) {
            return false;
        }
        cdnl cdnlVar = (cdnl) obj;
        return fdbq.f(this.a, cdnlVar.a) && fdbq.f(this.b, cdnlVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConversationWithParentStateChanged(trustedConversations=" + this.a + ", untrustedConversations=" + this.b + ")";
    }
}
