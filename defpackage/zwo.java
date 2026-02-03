package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
@fcsv
/* loaded from: classes2.dex */
public final class zwo {
    public static final ekrg a = ekrg.c("com/google/android/apps/messaging/conversation2/satellite/SatelliteToolstoneUpdater");
    public final fcsu b;
    public final fdjx c;
    public final fcsu d;
    public final fcsu e;
    public final ConversationId f;
    public final dqsn g;
    public final Conversation h;
    public final fcsu i;
    private final fdjx j;

    public zwo(fcsu fcsuVar, fdjx fdjxVar, fdjx fdjxVar2, fcsu fcsuVar2, fcsu fcsuVar3, ConversationId conversationId, dqsn dqsnVar, Conversation conversation, fcsu fcsuVar4) {
        fcsuVar.getClass();
        fdjxVar.getClass();
        fdjxVar2.getClass();
        fcsuVar2.getClass();
        fcsuVar3.getClass();
        conversationId.getClass();
        dqsnVar.getClass();
        conversation.getClass();
        fcsuVar4.getClass();
        this.b = fcsuVar;
        this.c = fdjxVar;
        this.j = fdjxVar2;
        this.d = fcsuVar2;
        this.e = fcsuVar3;
        this.f = conversationId;
        this.g = dqsnVar;
        this.h = conversation;
        this.i = fcsuVar4;
    }

    public final void a(cljh cljhVar, ConversationIdType conversationIdType, boolean z) {
        auvw.k(this.j, null, null, new zwl(z, this, conversationIdType, cljhVar, null), 3);
    }
}
