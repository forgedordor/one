package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class aapv {
    public abstract aapw a();

    public abstract void b(emvi emviVar);

    public abstract void c(ConversationIdType conversationIdType);

    public abstract void d(emvl emvlVar);

    public final aapw e() {
        aapw aapwVarA = a();
        if (((aapt) aapwVarA).a == emvl.NEW_CONVERSATION_WITH_EXISTING_RCS_GROUP_ID) {
            ejwl.m(!((ekgb) r1.e.get()).isEmpty(), "NEW_CONVERSATION_WITH_EXISTING_RCS_GROUP_ID error with empty forkedConversationJoinStates");
        }
        return aapwVarA;
    }
}
