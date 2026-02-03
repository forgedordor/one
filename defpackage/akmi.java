package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId;
import com.google.android.apps.messaging.shared.api.messaging.conversation.rbm.RbmConversationId;

/* compiled from: PG */
/* loaded from: classes6.dex */
final class akmi extends fcyz implements fdat {
    int a;
    final /* synthetic */ akml b;
    final /* synthetic */ awjl c;
    final /* synthetic */ aoer d;
    final /* synthetic */ ajsm e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public akmi(akml akmlVar, awjl awjlVar, aoer aoerVar, ajsm ajsmVar, fcxy fcxyVar) {
        super(2, fcxyVar);
        this.b = akmlVar;
        this.c = awjlVar;
        this.d = aoerVar;
        this.e = ajsmVar;
    }

    @Override // defpackage.fdat
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((akmi) c((fdjx) obj, (fcxy) obj2)).b(fctx.a);
    }

    @Override // defpackage.fcyt
    public final Object b(Object obj) throws Throwable {
        fcyl fcylVar = fcyl.a;
        int i = this.a;
        fctl.b(obj);
        if (i == 0) {
            eiju eijuVarN = ((ajvr) this.b.b.b()).n(this.c, this.d, this.e);
            this.a = 1;
            obj = fdxs.c(eijuVarN, this);
            if (obj == fcylVar) {
                return fcylVar;
            }
        }
        return RbmConversationId.c(((ConversationId) obj).b());
    }

    @Override // defpackage.fcyt
    public final fcxy c(Object obj, fcxy fcxyVar) {
        return new akmi(this.b, this.c, this.d, this.e, fcxyVar);
    }
}
