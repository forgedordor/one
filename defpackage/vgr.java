package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vgr extends fcyz implements fdat {
    int a;
    final /* synthetic */ vgv b;
    final /* synthetic */ ConversationId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vgr(vgv vgvVar, ConversationId conversationId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vgvVar;
        this.c = conversationId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vgr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            vgv vgvVar = this.b;
            eiju eijuVarG = vgvVar.c.G(this.c, elka.CONVERSATION_FROM_MORE_BUTTON);
            eijuVarG.getClass();
            this.a = 1;
            if (fdxs.c(eijuVarG, this) == fcylVar) {
                return fcylVar;
            }
        }
        vgv vgvVar2 = this.b;
        vgvVar2.f.g();
        vgvVar2.i.h(agbl.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vgr(this.b, this.c, fcxyVar);
    }
}
