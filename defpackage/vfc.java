package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vfc extends fcyz implements fdat {
    int a;
    final /* synthetic */ vfd b;
    final /* synthetic */ ConversationId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vfc(vfd vfdVar, ConversationId conversationId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vfdVar;
        this.c = conversationId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vfc) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            vfd vfdVar = this.b;
            eiju eijuVarC = vfdVar.c.C(this.c, elka.CONVERSATION_FROM_MORE_BUTTON);
            eijuVarC.getClass();
            this.a = 1;
            if (fdxs.c(eijuVarC, this) == fcylVar) {
                return fcylVar;
            }
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vfc(this.b, this.c, fcxyVar);
    }
}
