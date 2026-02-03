package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amgj {
    final /* synthetic */ amgl a;

    public amgj(amgl amglVar) {
        this.a = amglVar;
    }

    public final void a(ajle ajleVar, MessageId messageId, ConversationId conversationId, Instant instant) {
        ajleVar.getClass();
        amgl amglVar = this.a;
        synchronized (amglVar.c) {
            Iterator it = amglVar.b.iterator();
            while (it.hasNext()) {
                ((ajmg) it.next()).a(new amgk(ajleVar, messageId, conversationId, instant));
            }
        }
    }
}
