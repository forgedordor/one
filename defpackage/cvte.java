package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvte extends fcyz implements fdat {
    final /* synthetic */ cvtf a;
    final /* synthetic */ ConversationId b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvte(cvtf cvtfVar, ConversationId conversationId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cvtfVar;
        this.b = conversationId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvte) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.d.a(barn.b(this.b.b()), bvdk.UNARCHIVED, elka.CONVERSATION_FROM_UNSPAM_ACTION);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvte(this.a, this.b, fcxyVar);
    }
}
