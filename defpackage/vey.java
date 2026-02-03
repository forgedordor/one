package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class vey extends fcyz implements fdat {
    int a;
    final /* synthetic */ vfd b;
    final /* synthetic */ ConversationId c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vey(vfd vfdVar, ConversationId conversationId, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = vfdVar;
        this.c = conversationId;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((vey) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            vfd vfdVar = this.b;
            eiju eijuVarD = vfdVar.c.d(this.c, elka.CONVERSATION_FROM_MORE_BUTTON);
            eijuVarD.getClass();
            this.a = 1;
            obj = fdxs.c(eijuVarD, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        if (((Boolean) obj).booleanValue()) {
            vfd vfdVar2 = this.b;
            vfdVar2.d.g();
            vfdVar2.e.h(agbl.a);
        }
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new vey(this.b, this.c, fcxyVar);
    }
}
