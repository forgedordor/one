package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axlw extends aydd {
    public final MessageIdType a;
    private final MessageCoreData b;
    private final ParticipantsTable.BindData c;
    private final ConversationIdType d;
    private final cnqj e;
    private final boolean f;
    private final long g;
    private final int h;
    private final axza i;

    public axlw(MessageCoreData messageCoreData, ParticipantsTable.BindData bindData, MessageIdType messageIdType, ConversationIdType conversationIdType, cnqj cnqjVar, boolean z, long j, int i, axza axzaVar) {
        this.b = messageCoreData;
        this.c = bindData;
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.a = messageIdType;
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.d = conversationIdType;
        this.e = cnqjVar;
        this.f = z;
        this.g = j;
        this.h = i;
        this.i = axzaVar;
    }

    @Override // defpackage.aydd
    public final int a() {
        return this.h;
    }

    @Override // defpackage.aydd
    public final long b() {
        return this.g;
    }

    @Override // defpackage.aydd
    public final axza c() {
        return this.i;
    }

    @Override // defpackage.aydd
    public final MessageCoreData d() {
        return this.b;
    }

    @Override // defpackage.aydd
    public final ConversationIdType e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aydd) {
            aydd ayddVar = (aydd) obj;
            MessageCoreData messageCoreData = this.b;
            if (messageCoreData != null ? messageCoreData.equals(ayddVar.d()) : ayddVar.d() == null) {
                if (this.c.equals(ayddVar.g()) && this.a.equals(ayddVar.f()) && this.d.equals(ayddVar.e()) && this.e.equals(ayddVar.h()) && this.f == ayddVar.i() && this.g == ayddVar.b() && this.h == ayddVar.a() && this.i.equals(ayddVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.aydd
    public final MessageIdType f() {
        return this.a;
    }

    @Override // defpackage.aydd
    public final ParticipantsTable.BindData g() {
        return this.c;
    }

    @Override // defpackage.aydd
    public final cnqj h() {
        return this.e;
    }

    public final int hashCode() {
        MessageCoreData messageCoreData = this.b;
        int iHashCode = (((((((((messageCoreData == null ? 0 : messageCoreData.hashCode()) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.a.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ this.e.hashCode();
        int i = true != this.f ? 1237 : 1231;
        long j = this.g;
        return (((((((iHashCode * 1000003) ^ i) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.h) * 1000003) ^ this.i.hashCode();
    }

    @Override // defpackage.aydd
    public final boolean i() {
        return this.f;
    }

    public final String toString() {
        axza axzaVar = this.i;
        cnqj cnqjVar = this.e;
        ConversationIdType conversationIdType = this.d;
        MessageIdType messageIdType = this.a;
        ParticipantsTable.BindData bindData = this.c;
        return "LaunchCriticalActionsParams{message=" + String.valueOf(this.b) + ", sender=" + bindData.toString() + ", messageId=" + messageIdType.toString() + ", conversationId=" + conversationIdType.toString() + ", threadId=" + cnqjVar.toString() + ", newConversation=" + this.f + ", receivedTime=" + this.g + ", subId=" + this.h + ", rawSmsMessagingAddress=" + axzaVar.toString() + "}";
    }
}
