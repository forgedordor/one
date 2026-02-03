package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aaps extends aapv {
    private emvl f;
    private ConversationIdType g;
    public Optional a = Optional.empty();
    public Optional b = Optional.empty();
    public Optional c = Optional.empty();
    public Optional d = Optional.empty();
    private Optional h = Optional.empty();
    public Optional e = Optional.empty();

    @Override // defpackage.aapv
    public final aapw a() {
        ConversationIdType conversationIdType;
        emvl emvlVar = this.f;
        if (emvlVar != null && (conversationIdType = this.g) != null) {
            return new aapt(emvlVar, conversationIdType, this.a, this.b, this.c, this.d, this.h, this.e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f == null) {
            sb.append(" type");
        }
        if (this.g == null) {
            sb.append(" conversationId");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.aapv
    public final void b(emvi emviVar) {
        this.h = Optional.of(emviVar);
    }

    @Override // defpackage.aapv
    public final void c(ConversationIdType conversationIdType) {
        if (conversationIdType == null) {
            throw new NullPointerException("Null conversationId");
        }
        this.g = conversationIdType;
    }

    @Override // defpackage.aapv
    public final void d(emvl emvlVar) {
        if (emvlVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f = emvlVar;
    }
}
