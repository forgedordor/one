package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akmj extends fcyz implements fdat {
    final /* synthetic */ akml a;
    final /* synthetic */ ConversationId b;
    final /* synthetic */ asqe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akmj(akml akmlVar, ConversationId conversationId, asqe asqeVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = akmlVar;
        this.b = conversationId;
        this.c = asqeVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((akmj) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        ((asqr) this.a.c.b()).c(barn.b(this.b.b()), this.c, true);
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akmj(this.a, this.b, this.c, fcxyVar);
    }
}
