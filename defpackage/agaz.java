package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class agaz implements afzv {
    public final ConversationId a;
    public final List b;
    public final SelfIdentityId c;
    public final int d;

    public agaz(ConversationId conversationId, List list, SelfIdentityId selfIdentityId, int i) {
        this.a = conversationId;
        this.b = list;
        this.c = selfIdentityId;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof agaz)) {
            return false;
        }
        agaz agazVar = (agaz) obj;
        return fdbq.f(this.a, agazVar.a) && fdbq.f(this.b, agazVar.b) && fdbq.f(this.c, agazVar.c) && this.d == agazVar.d;
    }

    public final int hashCode() {
        int iHashCode = (this.a.hashCode() * 31) + this.b.hashCode();
        SelfIdentityId selfIdentityId = this.c;
        return (((iHashCode * 31) + (selfIdentityId == null ? 0 : selfIdentityId.hashCode())) * 31) + this.d;
    }

    public final String toString() {
        return "AddPeopleV2(conversationId=" + this.a + ", recipients=" + this.b + ", selfIdentityId=" + this.c + ", conversationUiState=" + this.d + ")";
    }
}
