package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akmg extends fcyz implements fdat {
    int a;
    final /* synthetic */ akml b;
    final /* synthetic */ awjl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akmg(akml akmlVar, awjl awjlVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akmlVar;
        this.c = awjlVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akmg) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarI = ((ajvr) this.b.b.b()).i(this.c);
            this.a = 1;
            obj = fdxs.c(eijuVarI, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        ConversationId conversationId = (ConversationId) obj;
        if (conversationId != null) {
            return RbmConversationId.c(conversationId.b());
        }
        return null;
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akmg(this.b, this.c, fcxyVar);
    }
}
