package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergency.EmergencyConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.emergencysos.EmergencySosConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajsn {
    private final fcsu a;
    private final fcsu b;

    public ajsn(fcsu fcsuVar, fcsu fcsuVar2) {
        fcsuVar.getClass();
        fcsuVar2.getClass();
        this.a = fcsuVar;
        this.b = fcsuVar2;
    }

    public final ConversationId a(ConversationIdType conversationIdType, String str, boolean z) {
        conversationIdType.getClass();
        if (str == null) {
            return new BugleConversationId(conversationIdType);
        }
        alqm alqmVarA = z ? ((alrj) this.a.b()).a(str) : ((alrj) this.a.b()).n(str);
        return alqmVarA.B() ? new EmergencySosConversationId(conversationIdType) : alqmVarA.z() ? new PenpalBotConversationId(conversationIdType) : alqmVarA.A() ? new RbmConversationId(conversationIdType) : (((aquo) this.b.b()).a() && alqmVarA.v()) ? new EmergencyConversationId(conversationIdType) : new BugleConversationId(conversationIdType);
    }
}
