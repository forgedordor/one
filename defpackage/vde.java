package defpackage;

import com.google.android.apps.messaging.conversation2.api.OpenConversation2Arguments;
import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.conversation.draft.ComposeRowState;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class vde {
    public final ConversationId a;
    public final MessageId b;
    public final String c;
    public final ComposeRowState d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final long h;
    public final OpenConversation2Arguments i;

    public vde(ConversationId conversationId, MessageId messageId, String str, ComposeRowState composeRowState, boolean z, boolean z2, boolean z3, long j) {
        this.a = conversationId;
        this.b = messageId;
        this.c = str;
        this.d = composeRowState;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = j;
        this.i = new OpenConversation2Arguments(conversationId, messageId, str, Boolean.valueOf(z), z2, z3, null, 64, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vde)) {
            return false;
        }
        vde vdeVar = (vde) obj;
        return fdbq.f(this.a, vdeVar.a) && fdbq.f(this.b, vdeVar.b) && fdbq.f(this.c, vdeVar.c) && fdbq.f(this.d, vdeVar.d) && this.e == vdeVar.e && this.f == vdeVar.f && this.g == vdeVar.g && this.h == vdeVar.h;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        MessageId messageId = this.b;
        int iHashCode2 = (iHashCode + (messageId == null ? 0 : messageId.hashCode())) * 31;
        String str = this.c;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        ComposeRowState composeRowState = this.d;
        int iHashCode4 = (((((((iHashCode3 + (composeRowState != null ? composeRowState.hashCode() : 0)) * 31) + vdd.a(this.e)) * 31) + vdd.a(this.f)) * 31) + vdd.a(this.g)) * 31;
        long j = this.h;
        return iHashCode4 + ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        String str = this.c;
        CharSequence charSequenceC = str != null ? cqcy.c(str) : null;
        MessageId messageId = this.b;
        return "Arguments(conversationId=" + this.a + ", messageId=" + messageId + ", searchQuery=" + ((Object) charSequenceC) + ", composeRowState=" + this.d + ", canNavigateBack=" + this.e + ", renderAddPeople=" + this.f + ", isBubbleActivity=" + this.g + ", intentTimestamp=" + this.h + ")";
    }
}
