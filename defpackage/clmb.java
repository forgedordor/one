package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
final class clmb {
    public final ConversationIdType a;
    public final SelfIdentityId b;
    public final ParticipantsTable.BindData c;

    public clmb(ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, ParticipantsTable.BindData bindData) {
        this.a = conversationIdType;
        this.b = selfIdentityId;
        this.c = bindData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof clmb)) {
            return false;
        }
        clmb clmbVar = (clmb) obj;
        return fdbq.f(this.a, clmbVar.a) && fdbq.f(this.b, clmbVar.b) && fdbq.f(this.c, clmbVar.c);
    }

    public final int hashCode() {
        return (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
    }

    public final String toString() {
        return "ConvInfo(conversationIdType=" + this.a + ", selfIdentityId=" + this.b + ", participantsTableBindData=" + this.c + ")";
    }
}
