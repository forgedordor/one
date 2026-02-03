package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agbs {
    public final ConversationId a;
    public final boolean b;
    public final boolean c;
    public final ComposeRowState d;
    public final boolean e;
    public final boolean f;
    public final int g;
    private final MessageId h = null;
    private final bajg i;
    private final String j;

    public /* synthetic */ agbs(ConversationId conversationId, boolean z, boolean z2, int i, ComposeRowState composeRowState, boolean z3, boolean z4, int i2) {
        this.a = conversationId;
        this.b = z & ((i2 & 4) == 0);
        this.c = z2;
        this.g = i;
        this.d = (i2 & 32) != 0 ? null : composeRowState;
        this.i = null;
        this.j = null;
        this.e = ((i2 & 256) == 0) & z3;
        this.f = ((i2 & 512) == 0) & z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agbs)) {
            return false;
        }
        agbs agbsVar = (agbs) obj;
        if (!fdbq.f(this.a, agbsVar.a)) {
            return false;
        }
        MessageId messageId = agbsVar.h;
        if (!fdbq.f(null, null) || this.b != agbsVar.b || this.c != agbsVar.c || this.g != agbsVar.g || !fdbq.f(this.d, agbsVar.d)) {
            return false;
        }
        bajg bajgVar = agbsVar.i;
        if (!fdbq.f(null, null)) {
            return false;
        }
        String str = agbsVar.j;
        return fdbq.f(null, null) && this.e == agbsVar.e && this.f == agbsVar.f;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 961;
        ComposeRowState composeRowState = this.d;
        int iHashCode2 = composeRowState == null ? 0 : composeRowState.hashCode();
        boolean z = this.b;
        boolean z2 = this.c;
        return ((((((((((iHashCode + agbr.a(z)) * 31) + agbr.a(z2)) * 31) + this.g) * 31) + iHashCode2) * 29791) + agbr.a(this.e)) * 31) + agbr.a(this.f);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ConversationArguments(conversationId=");
        sb.append(this.a);
        sb.append(", messageId=null, withAddPeople=");
        sb.append(this.b);
        sb.append(", deleteConversationIfEmpty=");
        sb.append(this.c);
        sb.append(", eventSource=");
        int i = this.g;
        sb.append((Object) (i != 2 ? i != 3 ? i != 4 ? i != 5 ? i != 6 ? "SUGGESTED_ACTION" : "MINICDP" : "PENPAL_GAIA" : "CONVERSATION_LIST" : "MULTI_SHARE" : "START_CHAT"));
        sb.append(", composeRowState=");
        sb.append(this.d);
        sb.append(", renderData=null, searchQuery=null, hasRbmRecipient=");
        sb.append(this.e);
        sb.append(", finishCurrentActivity=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
