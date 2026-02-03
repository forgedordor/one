package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class axlx extends ayde {
    public final MessageIdType a;
    public final ConversationIdType b;
    public final ParticipantsTable.BindData c;
    public final cnqj d;
    public final long e;
    public final int f;
    public final axza g;
    private final boolean h;

    public axlx(MessageIdType messageIdType, ConversationIdType conversationIdType, ParticipantsTable.BindData bindData, cnqj cnqjVar, boolean z, long j, int i, axza axzaVar) {
        if (messageIdType == null) {
            throw new NullPointerException("Null messageId");
        }
        this.a = messageIdType;
        this.b = conversationIdType;
        this.c = bindData;
        this.d = cnqjVar;
        this.h = z;
        this.e = j;
        this.f = i;
        this.g = axzaVar;
    }

    @Override // defpackage.ayde
    public final int a() {
        return this.f;
    }

    @Override // defpackage.ayde
    public final long b() {
        return this.e;
    }

    @Override // defpackage.ayde
    public final axza c() {
        return this.g;
    }

    @Override // defpackage.ayde
    public final ConversationIdType d() {
        return this.b;
    }

    @Override // defpackage.ayde
    public final MessageIdType e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ayde) {
            ayde aydeVar = (ayde) obj;
            if (this.a.equals(aydeVar.e()) && this.b.equals(aydeVar.d()) && this.c.equals(aydeVar.f()) && this.d.equals(aydeVar.g()) && this.h == aydeVar.h() && this.e == aydeVar.b() && this.f == aydeVar.a() && this.g.equals(aydeVar.c())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ayde
    public final ParticipantsTable.BindData f() {
        return this.c;
    }

    @Override // defpackage.ayde
    public final cnqj g() {
        return this.d;
    }

    @Override // defpackage.ayde
    public final boolean h() {
        return this.h;
    }

    public final int hashCode() {
        int iHashCode = (((((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode()) * 1000003) ^ (true != this.h ? 1237 : 1231)) * 1000003;
        long j = this.e;
        return ((((iHashCode ^ ((int) (j ^ (j >>> 32)))) * 1000003) ^ this.f) * 1000003) ^ this.g.hashCode();
    }

    public final String toString() {
        axza axzaVar = this.g;
        cnqj cnqjVar = this.d;
        ParticipantsTable.BindData bindData = this.c;
        ConversationIdType conversationIdType = this.b;
        return "LaunchNonCriticalActionsParams{messageId=" + this.a.toString() + ", conversationId=" + conversationIdType.toString() + ", sender=" + bindData.toString() + ", threadId=" + cnqjVar.toString() + ", newConversation=" + this.h + ", receivedTime=" + this.e + ", subId=" + this.f + ", rawSmsMessagingAddress=" + axzaVar.toString() + "}";
    }
}
