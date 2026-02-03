package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.penpal.PenpalBotConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zom implements vwm {
    private final ConversationId a;
    private final fcsu b;

    public zom(ConversationId conversationId, fcsu fcsuVar) {
        conversationId.getClass();
        this.a = conversationId;
        this.b = fcsuVar;
    }

    @Override // defpackage.vwm
    public final void a(vvw vvwVar) {
        if (((Boolean) ((cczi) crbf.ak.get()).e()).booleanValue() && (this.a instanceof PenpalBotConversationId)) {
            ((agxz) this.b.b()).c.incrementAndGet();
        }
    }
}
