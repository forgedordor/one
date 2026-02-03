package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class anol extends fcyz implements fdat {
    final /* synthetic */ anon a;
    final /* synthetic */ enkm b;
    final /* synthetic */ ConversationId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anol(anon anonVar, enkm enkmVar, ConversationId conversationId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.a = anonVar;
        this.b = enkmVar;
        this.c = conversationId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) throws Throwable {
        ((anol) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
        return null;
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fctl.b(obj);
        this.a.c.a(this.b, this.c);
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new anol(this.a, this.b, this.c, fcxyVar);
    }
}
