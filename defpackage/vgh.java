package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vgh extends fcyz implements fdat {
    int a;
    final /* synthetic */ vgl b;
    final /* synthetic */ ConversationId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgh(vgl vglVar, ConversationId conversationId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vglVar;
        this.c = conversationId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vgh) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            vgl vglVar = this.b;
            eiju eijuVarG = vglVar.c.G(this.c, elka.CONVERSATION_FROM_MORE_BUTTON);
            eijuVarG.getClass();
            this.a = 1;
            if (fdxs.c(eijuVarG, this) == fcylVar) {
                return fcylVar;
            }
        }
        vgl vglVar2 = this.b;
        vglVar2.f.g();
        vglVar2.i.h(agbl.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vgh(this.b, this.c, fcxyVar);
    }
}
