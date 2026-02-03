package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amdw implements ajmg {
    private final ConversationId a;
    private final ajmg b;

    public amdw(ConversationId conversationId, ajmg ajmgVar) {
        this.a = conversationId;
        this.b = ajmgVar;
    }

    @Override // defpackage.cqtk
    public final /* bridge */ /* synthetic */ eiju a(Object obj) {
        ajmf ajmfVar = (ajmf) obj;
        return !ajmfVar.c().equals(this.a) ? eijx.e(null) : this.b.a(ajmfVar);
    }

    @Override // defpackage.ajmg
    public final eiju b() {
        return this.b.b();
    }
}
