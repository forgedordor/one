package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cget extends cgeu {
    public final ConversationIdType a;
    public final boolean b;
    public final boolean c;
    public final MessageIdType d;
    public final boolean e;
    public final bbew f;

    public cget(ConversationIdType conversationIdType, boolean z, boolean z2, MessageIdType messageIdType, boolean z3, bbew bbewVar) {
        this.a = conversationIdType;
        this.b = z;
        this.c = z2;
        this.d = messageIdType;
        this.e = z3;
        this.f = bbewVar;
    }

    @Override // defpackage.cgeu
    public final ConversationIdType a() {
        return this.a;
    }

    @Override // defpackage.cgeu
    public final MessageIdType b() {
        return this.d;
    }

    @Override // defpackage.cgeu
    public final bbew c() {
        return this.f;
    }

    @Override // defpackage.cgeu
    public final boolean d() {
        return this.c;
    }

    @Override // defpackage.cgeu
    public final boolean e() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cgeu) {
            cgeu cgeuVar = (cgeu) obj;
            if (this.a.equals(cgeuVar.a()) && this.b == cgeuVar.e() && this.c == cgeuVar.d() && this.d.equals(cgeuVar.b()) && this.e == cgeuVar.f() && this.f.equals(cgeuVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.cgeu
    public final boolean f() {
        return this.e;
    }

    public final int hashCode() {
        return ((((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true == this.e ? 1231 : 1237)) * 1000003) ^ this.f.hashCode();
    }

    public final String toString() {
        bbew bbewVar = this.f;
        MessageIdType messageIdType = this.d;
        return "NotificationSuggestionsConversationInfo{conversationId=" + this.a.toString() + ", hasRbmBotRecipient=" + this.b + ", allowReply=" + this.c + ", latestMessageId=" + messageIdType.toString() + ", latestMessageIsOutgoing=" + this.e + ", latestMessageAnnotationData=" + bbewVar.toString() + "}";
    }
}
