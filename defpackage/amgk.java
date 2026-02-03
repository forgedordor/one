package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class amgk implements ajmf {
    final /* synthetic */ ajle a;
    final /* synthetic */ MessageId b;
    final /* synthetic */ ConversationId c;
    final /* synthetic */ Instant d;

    public amgk(ajle ajleVar, MessageId messageId, ConversationId conversationId, Instant instant) {
        this.a = ajleVar;
        this.b = messageId;
        this.c = conversationId;
        this.d = instant;
    }

    @Override // defpackage.ajmf
    public final ajle a() {
        return this.a;
    }

    @Override // defpackage.ajmf
    public final MessageId b() {
        return this.b;
    }

    @Override // defpackage.ajmf
    public final ConversationId c() {
        return this.c;
    }

    @Override // defpackage.ajmf
    public final Instant d() {
        return this.d;
    }
}
