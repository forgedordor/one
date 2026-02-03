package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agbx implements afzv {
    public final ConversationIdType a;
    public final MessageIdType b;
    public final String c;
    public final boolean d;
    private final boolean e;
    private final int f;

    public agbx(ConversationIdType conversationIdType, MessageIdType messageIdType, String str, boolean z) {
        conversationIdType.getClass();
        this.a = conversationIdType;
        this.b = messageIdType;
        this.c = str;
        this.d = z;
        this.e = false;
        this.f = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agbx)) {
            return false;
        }
        agbx agbxVar = (agbx) obj;
        if (!fdbq.f(this.a, agbxVar.a) || !fdbq.f(this.b, agbxVar.b) || !fdbq.f(this.c, agbxVar.c) || this.d != agbxVar.d) {
            return false;
        }
        boolean z = agbxVar.e;
        int i = agbxVar.f;
        return true;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        String str = this.c;
        return (((((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + agbw.a(this.d)) * 31) + agbw.a(false)) * 31) + 2;
    }

    public final String toString() {
        return "ConversationMessageSearch(conversationId=" + this.a + ", messageId=" + this.b + ", query=" + this.c + ", isBubbleActivity=" + this.d + ", hasRbmBotRecipient=false, source=2)";
    }
}
