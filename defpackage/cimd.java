package defpackage;

import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cimd {
    public final Map a;
    public final List b;
    public final List c;

    public cimd(Map map, List list, List list2) {
        this.a = map;
        this.b = list;
        this.c = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cimd)) {
            return false;
        }
        cimd cimdVar = (cimd) obj;
        return fdbq.f(this.a, cimdVar.a) && fdbq.f(this.b, cimdVar.b) && fdbq.f(this.c, cimdVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "MentionTrieNode(children=" + this.a + ", explicitMentionSuggestions=" + this.b + ", implicitMentionSuggestions=" + this.c + ")";
    }
}
