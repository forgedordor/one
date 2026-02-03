package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class auaf extends auar {
    private aubq a;
    private ConversationIdType b;
    private Instant c;
    private efjm d;

    @Override // defpackage.auar
    public final auas a() {
        ConversationIdType conversationIdType;
        Instant instant;
        efjm efjmVar;
        aubq aubqVar = this.a;
        if (aubqVar != null && (conversationIdType = this.b) != null && (instant = this.c) != null && (efjmVar = this.d) != null) {
            return new auag(aubqVar, conversationIdType, instant, efjmVar);
        }
        StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" sender");
        }
        if (this.b == null) {
            sb.append(" conversationId");
        }
        if (this.c == null) {
            sb.append(" expiry");
        }
        if (this.d == null) {
            sb.append(" status");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.auar
    public final void b(ConversationIdType conversationIdType) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.b = conversationIdType;
    }

    @Override // defpackage.auar
    public final void c(Instant instant) {
        if (instant == null) {
            throw new NullPointerException("Null expiry");
        }
        this.c = instant;
    }

    @Override // defpackage.auar
    public final void d(aubq aubqVar) {
        if (aubqVar == null) {
            throw new NullPointerException("Null sender");
        }
        this.a = aubqVar;
    }

    @Override // defpackage.auar
    public final void e(efjm efjmVar) {
        if (efjmVar == null) {
            throw new NullPointerException("Null status");
        }
        this.d = efjmVar;
    }
}
