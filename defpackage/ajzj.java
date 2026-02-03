package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversation;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ajzj implements ajzi {
    private static final eksp a = eksp.c("BugleConversation");
    private static final cohg b = new cohf("SendingContext::onConversationOpened");
    private final fcsu c;

    public ajzj(fcsu fcsuVar) {
        this.c = fcsuVar;
    }

    @Override // defpackage.ajzi
    public final eieu a() {
        return b.a();
    }

    @Override // defpackage.ajzi
    public final eiju b(BugleConversation bugleConversation, ajlm ajlmVar) {
        eieu eieuVarK = eiiy.k("SendingContextOpenConversationListener::onConversationOpened::convoV2");
        try {
            ((eksl) ((eksl) a.e()).h("com/google/android/apps/messaging/shared/api/messaging/conversation/bugle/SendingContextOpenConversationListener", "onConversationOpened", 52, "SendingContextOpenConversationListener.java")).q("executing SendingContextOpenConversationListener for convo v2.");
            final axka axkaVar = (axka) this.c.b();
            final ConversationIdType conversationIdType = ((DefaultConversation) bugleConversation).a.a;
            eieu eieuVarK2 = eiiy.k("SendingContext::populateSendingContext");
            try {
                eiju eijuVarF = eijx.f(new Runnable() { // from class: axjz
                    @Override // java.lang.Runnable
                    public final void run() {
                        axka axkaVar2 = axkaVar;
                        axkaVar2.a(conversationIdType);
                        axgh axghVar = (axgh) axkaVar2.a.b();
                        eieu eieuVarK3 = eiiy.k("BugleDbOperationsCached::populateExistingConversation");
                        try {
                            eieuVarK3.close();
                        } catch (Throwable th) {
                            try {
                                eieuVarK3.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                            throw th;
                        }
                    }
                }, axkaVar.b);
                eieuVarK2.close();
                eieuVarK.b(eijuVarF);
                eieuVarK.close();
                return eijuVarF;
            } finally {
            }
        } catch (Throwable th) {
            try {
                eieuVarK.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
