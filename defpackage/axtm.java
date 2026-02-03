package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class axtm {
    private final ConversationIdType a;
    private final SelfIdentityId b;
    private final int c;

    public axtm(MessageCoreData messageCoreData) {
        ConversationIdType conversationIdTypeA = messageCoreData.A();
        this.a = conversationIdTypeA;
        if ((!eotp.a("bugle.enable_sim_parallel_rcs_sending", "bugle") || !messageCoreData.cX()) && !messageCoreData.dg() && !messageCoreData.cO()) {
            this.b = null;
            this.c = conversationIdTypeA.hashCode();
        } else {
            SelfIdentityId selfIdentityIdV = messageCoreData.v();
            this.b = selfIdentityIdV;
            this.c = Objects.hash(conversationIdTypeA, aoet.b(selfIdentityIdV));
        }
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof axtm)) {
            return false;
        }
        axtm axtmVar = (axtm) obj;
        return this.c == axtmVar.c && Objects.equals(this.a, axtmVar.a) && Objects.equals(this.b, axtmVar.b);
    }

    public final int hashCode() {
        return this.c;
    }
}
