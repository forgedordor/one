package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class cvsj extends fcyz implements fdat {
    final /* synthetic */ cvsn a;
    final /* synthetic */ ConversationId b;
    final /* synthetic */ bvdk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cvsj(cvsn cvsnVar, ConversationId conversationId, bvdk bvdkVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = cvsnVar;
        this.b = conversationId;
        this.c = bvdkVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((cvsj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.c.a(barn.b(this.b.b()), this.c, elka.CONVERSATION_FROM_CROSS_COUNTRY_USER_ACTION);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new cvsj(this.a, this.b, this.c, fcxyVar);
    }
}
