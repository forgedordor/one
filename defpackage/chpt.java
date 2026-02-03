package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class chpt {
    public final ConversationId a;
    public final List b;
    public final aoer c;
    public final String d;
    public final String e;
    public final aofd f;
    public final evvp g;
    public final boolean h;

    public chpt(ConversationId conversationId, List list, aoer aoerVar, String str, String str2, aofd aofdVar, evvp evvpVar, boolean z) {
        list.getClass();
        aoerVar.getClass();
        this.a = conversationId;
        this.b = list;
        this.c = aoerVar;
        this.d = str;
        this.e = str2;
        this.f = aofdVar;
        this.g = evvpVar;
        this.h = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof chpt)) {
            return false;
        }
        chpt chptVar = (chpt) obj;
        return fdbq.f(this.a, chptVar.a) && fdbq.f(this.b, chptVar.b) && fdbq.f(this.c, chptVar.c) && fdbq.f(this.d, chptVar.d) && fdbq.f(this.e, chptVar.e) && fdbq.f(this.f, chptVar.f) && fdbq.f(this.g, chptVar.g) && this.h == chptVar.h;
    }

    public final int hashCode() {
        return (((((((((((((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + (true != this.h ? 1237 : 1231);
    }

    public final String toString() {
        return "SelfProfileSharingData(conversationId=" + this.a + ", eligibleRecipients=" + this.b + ", selfIdentity=" + this.c + ", selfProfileAccessToken=" + this.d + ", personId=" + this.e + ", selfProfile=" + this.f + ", profileLastUpdatedTimestamp=" + this.g + ", shouldUseServerFanOut=" + this.h + ")";
    }
}
