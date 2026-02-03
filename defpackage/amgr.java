package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class amgr extends fcyz implements fdat {
    int a;
    final /* synthetic */ fdap b;
    final /* synthetic */ amgw c;
    final /* synthetic */ MessageId d;
    final /* synthetic */ ancn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amgr(fdap fdapVar, amgw amgwVar, MessageId messageId, ancn ancnVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = fdapVar;
        this.c = amgwVar;
        this.d = messageId;
        this.e = ancnVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((amgr) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            fdap fdapVar = this.b;
            this.a = 1;
            if (fdapVar.invoke(this) == fcylVar) {
                return fcylVar;
            }
        }
        amgw amgwVar = this.c;
        anco ancoVar = (anco) amgwVar.a.b();
        BugleConversationId bugleConversationIdU = amgwVar.U();
        bugleConversationIdU.getClass();
        ancoVar.d(bugleConversationIdU, this.d, this.e.a);
        return fctx.a;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new amgr(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
