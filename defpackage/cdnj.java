package defpackage;

import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes7.dex */
final class cdnj {
    public final Map a;
    public final Set b;
    public final Set c;
    public final Map d;

    public /* synthetic */ cdnj(Map map, Set set, Set set2, Map map2, int i) {
        set = (i & 2) != 0 ? fcvq.a : set;
        set2 = (i & 4) != 0 ? fcvq.a : set2;
        map2 = (i & 8) != 0 ? fcvp.a : map2;
        set.getClass();
        map2.getClass();
        this.a = map;
        this.b = set;
        this.c = set2;
        this.d = map2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cdnj)) {
            return false;
        }
        cdnj cdnjVar = (cdnj) obj;
        return fdbq.f(this.a, cdnjVar.a) && fdbq.f(this.b, cdnjVar.b) && fdbq.f(this.c, cdnjVar.c) && fdbq.f(this.d, cdnjVar.d);
    }

    public final int hashCode() {
        return (((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "ConversationParticipantsData(conversationsToParticipants=" + this.a + ", currentDisallowedConversations=" + this.b + ", participants=" + this.c + ", currentConversationParentState=" + this.d + ")";
    }
}
