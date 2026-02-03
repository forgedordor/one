package defpackage;

import android.util.LruCache;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageNotification;
import com.google.android.rcs.client.messaging.data.TraceId;
import j$.time.Instant;
import java.util.ArrayDeque;
import java.util.Queue;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dfvk {
    public final Object a = new Object();
    public final Queue b = new ArrayDeque();
    private final LruCache c = new LruCache(((Integer) dfog.o().a.l.a()).intValue());
    private final diep d;

    public dfvk(diep diepVar) {
        this.d = diepVar;
    }

    public final boolean a(TraceId traceId, Conversation conversation, Message message) {
        synchronized (this.a) {
            if (!ejwk.c(message.h()) && this.c.get(message.h()) != null) {
                dhja.k("Messages queue: deduplicate message, messageId:{%s}, conversationId:{%s}.", message.h(), conversation.b());
                return false;
            }
            this.c.put(message.h(), true);
            efkd efkdVarE = MessageNotification.e();
            efkdVarE.b(conversation);
            efkdVarE.d(message);
            efkdVarE.e(traceId);
            if (dfog.v()) {
                efkdVarE.c(Instant.ofEpochMilli(this.d.a()));
            }
            Queue queue = this.b;
            queue.add(efkdVarE.a());
            dhja.c("Messages queue: push operation, messageId:{%s}, conversationId:{%s}, queueSize:{%s}.", message.h(), conversation.b(), Integer.valueOf(queue.size()));
            return true;
        }
    }
}
