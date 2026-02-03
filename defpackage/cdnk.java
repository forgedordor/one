package defpackage;

import java.util.Set;

/* compiled from: PG */
@fcsv
/* loaded from: classes7.dex */
final class cdnk {
    public final Set a;
    public final Set b;

    public cdnk(Set set, Set set2) {
        this.a = set;
        this.b = set2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdnk)) {
            return false;
        }
        cdnk cdnkVar = (cdnk) obj;
        return fdbq.f(this.a, cdnkVar.a) && fdbq.f(this.b, cdnkVar.b);
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b.hashCode();
    }

    public final String toString() {
        return "ConversationWithAllowlistStatusChanged(toDisallowedConversation=" + this.a + ", toAllowedConversation=" + this.b + ")";
    }
}
