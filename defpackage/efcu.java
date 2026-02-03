package defpackage;

import android.app.PendingIntent;
import com.google.android.rcs.client.messaging.AutoValue_SendMessageRequest;
import com.google.android.rcs.client.messaging.SendMessageRequest;
import com.google.android.rcs.client.messaging.data.Conversation;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageClass;
import com.google.android.rcs.client.messaging.data.TraceId;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class efcu extends effw {
    private PendingIntent a;
    private Conversation b;
    private Message c;
    private MessageClass d;
    private TraceId e;
    private Optional f = Optional.empty();
    private efkm g;

    @Override // defpackage.effw
    public final SendMessageRequest a() {
        Conversation conversation;
        Message message;
        MessageClass messageClass;
        TraceId traceId;
        efkm efkmVar;
        PendingIntent pendingIntent = this.a;
        if (pendingIntent != null && (conversation = this.b) != null && (message = this.c) != null && (messageClass = this.d) != null && (traceId = this.e) != null && (efkmVar = this.g) != null) {
            return new AutoValue_SendMessageRequest(pendingIntent, conversation, message, messageClass, traceId, this.f, efkmVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" intent");
        }
        if (this.b == null) {
            sb.append(" conversation");
        }
        if (this.c == null) {
            sb.append(" message");
        }
        if (this.d == null) {
            sb.append(" messageClass");
        }
        if (this.e == null) {
            sb.append(" traceId");
        }
        if (this.g == null) {
            sb.append(" messagingMethod");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.effw
    public final void b(Conversation conversation) {
        if (conversation == null) {
            throw new NullPointerException("Null conversation");
        }
        this.b = conversation;
    }

    @Override // defpackage.effw
    public final void c(PendingIntent pendingIntent) {
        if (pendingIntent == null) {
            throw new NullPointerException("Null intent");
        }
        this.a = pendingIntent;
    }

    @Override // defpackage.effw
    public final void d(Message message) {
        if (message == null) {
            throw new NullPointerException("Null message");
        }
        this.c = message;
    }

    @Override // defpackage.effw
    public final void e(MessageClass messageClass) {
        if (messageClass == null) {
            throw new NullPointerException("Null messageClass");
        }
        this.d = messageClass;
    }

    @Override // defpackage.effw
    public final void f(efkm efkmVar) {
        if (efkmVar == null) {
            throw new NullPointerException("Null messagingMethod");
        }
        this.g = efkmVar;
    }

    @Override // defpackage.effw
    public final void g(evqs evqsVar) {
        this.f = Optional.of(evqsVar);
    }

    @Override // defpackage.effw
    public final void h(TraceId traceId) {
        if (traceId == null) {
            throw new NullPointerException("Null traceId");
        }
        this.e = traceId;
    }
}
